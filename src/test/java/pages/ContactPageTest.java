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

import static constants.XPath.Common.CONTACT_BUTTON;
import static constants.Inputs.Contact.*;
import static constants.Messages.ContactMessages.*;
import static constants.Signs.ContactPage.*;
import static constants.XPath.ContactPage.*;
public class ContactPageTest {
    private ContactPage contactPage;
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        contactPage = new ContactPage(driver);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

    }
    @After
    public void tearDown() {
        driver.quit();
    }

    private void goToContact(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement contactHeaderButton = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONTACT_BUTTON)));
        contactHeaderButton.click();
    }
    
    @Test
    public void testContactValidData(){
        contactPage.fillData(EMAIL_VALID_INPUT,USERNAME_FIELD_INPUT,MESSAGE_FIELD_INPUT));
       Alert message = driver.switchTo().alert();
       String actualResult = message.getText();
       String expectedResult = REGULAR_MESSAGE;
       assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testContactInvalidEmail(){
        contactPage.fillData(INVALID_INPUT_DATA,USERNAME_FIELD_INPUT,MESSAGE_FIELD_INPUT);
        Alert message = driver.switchTo().alert();
        String actualResult = message.getText();
        String expectedResult = ALERT_MESSAGE;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testContactInvalidName(){
        contactPage.fillData(EMAIL_VALID_INPUT,INVALID_INPUT_DATA,MESSAGE_FIELD_INPUT);
        Alert message = driver.switchTo().alert();
        String actualResult = message.getText();
        String expectedResult = ALERT_MESSAGE;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testContactHeader(){
        String actualResult = contactPage.getContactHeader();
        String expectedResult = CONTACT_EMAIL_LABEL;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testContactEmailLabel(){
        String actualResult = contactPage.getEmailLabel();
        String expectedResult = CONTACT_EMAIL_LABEL;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testContactNameLabel(){
        String actualResult = contactPage.getUsernameLabel();
        String expectedResult = CONTACT_NAME_LABEL;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testContactMessageLabel(){
        String actualResult = contactPage.getMessageLabel();
        String expectedResult = CONTACT_MESSAGE_LABEL;
        assertEquals(expectedResult, actualResult);
    }

}
