package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import unassigned.Page;
import static constants.XPath.LogInPage.*;

public class LogInPage extends Page {
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

    public void fillUsername(String username){
        fillField(usernameField, username);
    }

    public void fillPassword(String password){
        fillField(passwordField, password);
    }

    public WebElement getLoginHeader() {
        return loginHeader;
    }

    public WebElement getUsernameTitleField() {
        return usernameTitleField;
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordTitleField() {
        return passwordTitleField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    public WebElement getCloseIcon() {
        return closeIcon;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }
}
