package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.XPath.ContactPage.*;
import static constants.XPath.LogInPage.USERNAME_FIELD;

public class ContactPage extends BasePage{
    @FindBy(xpath = HEADER)
    private WebElement contactHeader;
    @FindBy(xpath = EMAIL_LABEL)
    private WebElement emailLabel;
    @FindBy(xpath = EMAIL_FIELD)
    private WebElement emailField;
    @FindBy(xpath = NAME_LABEL)
    private WebElement nameLabel;
    @FindBy(xpath = NAME_FIELD)
    private WebElement usernameField;
    @FindBy(xpath = MESSAGE_LABEL)
    private WebElement messageLabel;
    @FindBy(xpath = MESSAGE_FIELD)
    private WebElement messageField;
    @FindBy(xpath = CLOSE_BUTTON)
    private WebElement closeButton;
    @FindBy(xpath = SEND_BUTTON)
    private WebElement sendButton;


    public ContactPage(WebDriver driver) { super(driver); }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    public String getContactHeader(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HEADER)));
        return contactHeader.getText();
    }
    public void fillEmail(String email){
        fillField(emailField, email);
    }

    public String getEmailLabel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EMAIL_LABEL)));
        return emailLabel.getText();
    }
    public void fillUsername(String username){
        fillField(usernameField, username);
    }

    public String getUsernameLabel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NAME_LABEL)));
        return nameLabel.getText();
    }
    public void fillMessage(String message){fillField(messageField, message); }
    public String getMessageLabel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MESSAGE_LABEL)));
        return messageLabel.getText();
    }
    public void clickSendButton() { sendButton.click() ;}
    public void fillData(String email, String username, String message) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EMAIL_FIELD)));
        fillEmail(email);
        fillUsername(username);
        fillMessage(message);
        sendButton.click();
    }

}
