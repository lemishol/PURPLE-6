package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.XPath.ContactPage.*;

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
    @FindBy(xpath = MASSAGE_LABEL)
    private WebElement massageLabel;
    @FindBy(xpath = MASSAGE_FIELD)
    private WebElement massageField;
    @FindBy(xpath = CLOSE_BUTTON)
    private WebElement closeButton;
    @FindBy(xpath = SEND_BUTTON)
    private WebElement sendButton;


    public ContactPage(WebDriver driver) { super(driver); }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    
    public void fillEmail(String email){
        fillField(emailField, email);
    }
    
    public String getEmailLabel(){return emailLabel.getText(); }
    
    public void fillUsername(String username){
        fillField(usernameField, username);
    }
    
     public String getUsernameLabel(){ return nameLabel.getText(); }
    
    public void fillMassage(String massage){fillField(massageField, massage); }
    public String getEmailLabel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HEADER)));
        return contactHeader.getText();
    }
    
      public String getMassageLabel(){return massageLabel.getText(); }
    public void clickOnSendButton() { sendButton.click() ;}

}
