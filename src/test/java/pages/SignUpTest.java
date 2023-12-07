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

import static org.junit.Assert.*;

import static constants.XPath.Common.SIGNUP_BUTTON;
import static constants.Inputs.SignUp.*;
import static constants.Messages.SignUpMessages.*;
import static constants.Signs.SignUpPage.*;
import static constants.XPath.SignUpPage.*;
public class SignUpPageTest {
    private SignUpPage SignUpPage;
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        SignUpPage = new SignUpPage(driver);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        clickSignUpHeader();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private void clickSignUpHeader(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement SignUpHeaderTitleButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGNUP_BUTTON)));
        SignUpHeaderTitleButton.click();
    }
    @Test
    public void testSignUpValidData(){
        SignUpPage.fillUsername(USERNAME_FIELD_INPUT);
        SignUpPage.fillPassword(PASSWORD_FIELD_INPUT);
        SignUpPage.clickOnSignUpButton();
        Alert message = driver.switchTo().alert();
        String actualResult = message.getText();
        String expectedResult = REGULAR_MESSAGE;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSignUpHeader(){
        String actualResult = SignUpPage.getSignUpHeader();
        String expectedResult = SIGNUP_HEADER;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSingUpEmailLabel(){
        String actualResult = SignUpPage.getPasswordLabel();
        String expectedResult = PASSWORD_LABEL;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSignUoUsernameLabel(){
        String actualResult = SignUpPage.getUsernameLabel();
        String expectedResult = USERNAME_LABEL;
        assertEquals(expectedResult, actualResult);
    }
      @Test
    public void testSignUpInvalidPassword(){
        SignUpPage.fillUsername(USERNAME_FIELD_INPUT);
        SignUpPage.fillPassword(PASSWORD_FIELD_INVALID);
        SignUpPage.clickOnSignUpButton();
        Alert message = driver.switchTo().alert();
        String actualResult = message.getText();
        String expectedResult = ALERT_MESSAGE;
        assertEquals(expectedResult, actualResult);
    }

}
