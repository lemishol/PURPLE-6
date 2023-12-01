package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.XPath.LogInPage.*;

public class LogInPage extends BasePage {
    @FindBy(xpath = HEADER)
    private WebElement loginHeader;

    @FindBy(xpath = USERNAME_TITLE_FIELD)
    private WebElement usernameTitleField;

    @FindBy(xpath = USERNAME_FIELD)
    private WebElement usernameField;

    @FindBy(xpath = PASSWORD_TITLE_FIELD)
    private WebElement passwordTitleField;

    @FindBy(xpath = PASSWORD_FIELD)
    private WebElement passwordField;

    @FindBy(xpath = CLOSE_BUTTON)
    private WebElement closeButton;

    @FindBy(xpath = CLOSE_ICON)
    private WebElement closeIcon;

    @FindBy(xpath = LOGIN_BUTTON)
    private WebElement logInButton;


    public LogInPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    public void fillUsername(String username){
        fillField(usernameField, username);
    }

    public void fillPassword(String password){
        fillField(passwordField, password);
    }

    public void fillForm(String username, String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(USERNAME_FIELD)));

        fillUsername(username);
        fillPassword(password);

        logInButton.click();
    }

    public String getLogInPageHeader(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HEADER)));

        return  loginHeader.getText();
    }

    public String getLogInPageUsernameTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(USERNAME_TITLE_FIELD)));

        return  usernameTitleField.getText();
    }

    public String getLogInPagePasswordTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PASSWORD_TITLE_FIELD)));

        return  passwordTitleField.getText();
    }
}
