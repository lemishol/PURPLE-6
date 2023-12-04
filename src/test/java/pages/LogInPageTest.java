package pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Inputs.LogIn.*;
import static constants.Messages.LogInMeCartMessages.*;
import static constants.XPath.Common.LOGIN_BUTTON;
import static constants.XPath.LogInPage.USERNAME_TITLE_FIELD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogInPageTest {
    private LogInPage logInPage;
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        logInPage = new LogInPage(driver);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        clickLogInHeader();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    private void clickLogInHeader(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement loginHeaderTitleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOGIN_BUTTON)));
        loginHeaderTitleButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(USERNAME_TITLE_FIELD)));
    }

    @Test
    public void testLogInSpellingHeader(){
        String actualResult = logInPage.getLogInPageHeader();
        String expectedResult = HEADER_TEXT;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogInSpellingUsernameTextField(){
        String actualResult = logInPage.getLogInPageUsernameTitle();
        String expectedResult = USERNAME_TITLE_FIELD_TEXT;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogInSpellingPasswordTextField(){
        String actualResult = logInPage.getLogInPagePasswordTitle();
        String expectedResult = PASSWORD_TITLE_FIELD_TEXT;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogInValidData(){
        logInPage.fillUsername(VALID_USERNAME);
        logInPage.fillPassword(VALID_PASSWORD);
        logInPage.clickLogInButton();

        WebElement usernameElement = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        String actualResult = usernameElement.getText();
        String expectedResult = "Welcome qwerty1!";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogInWeakPassword(){
        logInPage.fillUsername(WEAK_USERNAME);
        logInPage.fillPassword(WEAK_PASSWORD);
        logInPage.clickLogInButton();

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String actualResult = alert.getText();
        String expectedResult = AUTHORIZED_USER;

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({
            SHORT_PASSWORD_WITHOUT_SPECIAL_CHARACTERS + "," + SHORT_PASSWORD,
            SHORT_PASSWORD_WITHOUT_NUMBER + "," + SHORT_PASSWORD,
            PASSWORD_VALUE_WITHOUT_SPECIAL_CHARACTERS + "," + PASSWORD_WITHOUT_SPECIAL_CHARACTERS,
            PASSWORD_VALUE_WITHOUT_NUMBER + "," + PASSWORD_WITHOUT_NUMBER,
            NUMBERS_PASSWORD + "," + PASSWORD_WITHOUT_LETTER,
            NUMBERS_PASSWORD_WITHOUT_SPECIAL_CHARACTERS + "," + PASSWORD_WITHOUT_SPECIAL_CHARACTERS,
            NUMBERS_PASSWORD_WITHOUT_LETTER + "," + PASSWORD_WITHOUT_LETTER
    })
    public void testLogInInvalidPasswordData(String password, String expectedResult){
        logInPage.fillUsername(VALID_USERNAME);
        logInPage.fillPassword(password);
        logInPage.clickLogInButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String actualResult = alert.getText();

        assertEquals(expectedResult, actualResult);
    }
}
