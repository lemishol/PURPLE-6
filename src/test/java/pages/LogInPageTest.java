package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.XPath.Common.LOGIN_BUTTON;
import static constants.XPath.LogInPage.*;
import static org.junit.Assert.*;

public class LogInPageTest {
    private LogInPage logInPage;
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        logInPage = new LogInPage(driver);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private void clickLogInHeader(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement loginHeaderTitleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOGIN_BUTTON)));
        loginHeaderTitleButton.click();
    }

    @Test
    public void testLogInValidData(){
        clickLogInHeader();

        logInPage.fillForm("qwerty1!", "qwerty1!");

        WebElement usernameElement = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        String actualResult = usernameElement.getText();
        String expectedResult = "Welcome qwerty1!";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogInSpellingHeader(){
        clickLogInHeader();

        String actualResult = logInPage.getLogInPageHeader();
        String expectedResult = "Log in";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogInSpellingUsernameTextField(){
        clickLogInHeader();

        String actualResult = logInPage.getLogInPageUsernameTitle();
        String expectedResult = "Username:";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogInSpellingPasswordTextField(){
        clickLogInHeader();

        String actualResult = logInPage.getLogInPagePasswordTitle();
        String expectedResult = "Password:";

        assertEquals(expectedResult, actualResult);
    }

    //With a weak password, account authorization with a message without specific information does not occur, but for some reason registration occurs.
    @Test
    public void testLogInWeakPassword(){
        clickLogInHeader();

        logInPage.fillForm("Username333", "Password333");

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String actualResult = alert.getText();
        String expectedResult = "Welcome Username333";

        assertEquals(expectedResult, actualResult);
    }
}