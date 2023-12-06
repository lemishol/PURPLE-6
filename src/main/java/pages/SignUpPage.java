package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static constants.XPath.SignUpPage.*;

public class SignUpPage extends BasePage{
    @FindBy(xpath = HEADER)
    private WebElement SignUpHeader;

    @FindBy(xpath = EMAIL_FIELD)
    private WebElement emailField;
    @FindBy(xpath = EMAIL_TITLE_FIELD)
    private WebElement emailTitleField;

    @FindBy(xpath = PASSWORD_FIELD)
    private WebElement passwordField;
    @FindBy(xpath = PASSWORD_TITLE_FIELD)
    private WebElement passwordTitleField;

    @FindBy(xpath = CLOSE_BUTTON)
    private WebElement closeButton;

    @FindBy(xpath = SIGNUP_BUTTON)
    private WebElement SignUpButton;


  public SignUpPage(WebDriver driver) { super(driver); }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    
    public void fillEmail(String email){
        fillField(emailField, email);
    }
    
    public String getEmailLabel(){return emailLabel.getText(); }
    
    public void fillPassword(String password){
        fillField(passwordField, password);
    }
    
     public String getPasswordLabel(){ return nameLabel.getText(); }
    
        public void clickOnSendButton() { sendButton.click() ;}
