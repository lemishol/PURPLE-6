package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import unassigned.Page;

import java.time.Duration;

import static constants.XPath.CartPage.*;
import static constants.XPath.LogInPage.PASSWORD_TITLE_FIELD;

public class CartPage extends Page {
    @FindBy(xpath = DELETE_BUTTON)
    private WebElement cartDeleteButton;

    @FindBy(xpath = PLACE_ORDER_BUTTON)
    private WebElement placeOrderButton;

    @FindBy(xpath = NAME_FIELD)
    private WebElement nameField;

    @FindBy(xpath = COUNTRY_FIELD)
    private WebElement countryField;

    @FindBy(xpath = CITY_FIELD)
    private WebElement cityField;

    @FindBy(xpath = CREDIT_CARD_FIELD)
    private WebElement creditCardField;

    @FindBy(xpath = MONTH_FIELD)
    private WebElement monthField;

    @FindBy(xpath = YEAR_FIELD)
    private WebElement yearField;

    @FindBy(xpath = CANCEL_BUTTON)
    private WebElement cancelButton;

    @FindBy(xpath = PURCHASE_BUTTON)
    private WebElement purchaseButton;

    @FindBy(xpath = EXIT_BUTTON)
    private WebElement exitButton;

    @FindBy(xpath = ORDER_HEADER)
    private WebElement orderHeader;

    @FindBy(xpath = TOTAL_LABEL)
    private WebElement totalLabel;

    @FindBy(xpath = NAME_LABEL)
    private WebElement nameLabel;

    @FindBy(xpath = COUNTRY_LABEL)
    private WebElement countryLabel;

    @FindBy(xpath = CITY_LABEL)
    private WebElement cityLabel;

    @FindBy(xpath = CREDIT_CARD_LABEL)
    private WebElement creditCardLabel;

    @FindBy(xpath = MONTH_LABEL)
    private WebElement monthLabel;

    @FindBy(xpath = YEAR_LABEL)
    private WebElement yearLabel;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    public void clickOnDeleteButton(){
        cartDeleteButton.click();
    }

    public void clickOnPlaceOrderButton(){
        placeOrderButton.click();
    }

    public void clickOnPurchaseButton(){
        purchaseButton.click();
    }

    public void fillNameField(String name){
        fillField(nameField,name);
    }

    public void fillCountryField(String country){
        fillField(countryField,country);
    }

    public void fillCityField(String city){
        fillField(cityField,city);
    }

    public void fillCreditCardField(String creditCardNumber){
        fillField(creditCardField,creditCardNumber);
    }

    public void fillMonthField(String month){
        fillField(monthField,month);
    }

    public void fillYearField(String year){
        fillField(yearField,year);
    }

    public String getAlertText(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        return driver.switchTo().alert().getText();
    }

    public String getResultText(){
        return driver.findElement(By.cssSelector("h2:nth-child(6)")).getText();
    }

    public String getOrderHeaderText(){
        return orderHeader.getText();
    }

    public String getTotalLabelText(){
        return totalLabel.getText();
    }

    public String getNameLabelText(){
        return nameLabel.getText();
    }

    public String getCountryLabelText(){
        return countryLabel.getText();
    }

    public String getCityLabelText(){
        return cityLabel.getText();
    }

    public String getCreditCardLabelText(){
        return creditCardLabel.getText();
    }

    public String getMonthLabelText(){
        return monthLabel.getText();
    }

    public String getYearLabelText(){
        return yearLabel.getText();
    }

}
