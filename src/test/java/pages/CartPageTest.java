package pages;

import constants.Signs;
import constants.XPath;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Locators.Item.*;
import static constants.XPath.CartPage.PRODUCTS_SUCCESS;
import static constants.XPath.CartPage.TOTAL_PRICE;
import static constants.XPath.Common.CART_BUTTON;
import static constants.Messages.CartMessages.*;
import static constants.Inputs.Cart.*;
import static constants.XPath.HomePage.ALL_PRODUCT_CARDS_A;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CartPageTest {
    private CartPage cartPage;
    private WebDriver driver;

    @Before
    public void regularTestSetUp(){
        driver = new FirefoxDriver();
        cartPage = new CartPage(driver);
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        addAnItemToCart();
        getToCart();
    }

    @After
    public void regularTestTearDown(){
        driver.quit();
    }

    @BeforeEach
    public void parameterizedTestSetUp(){
        driver = new FirefoxDriver();
        cartPage = new CartPage(driver);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        addAnItemToCart();
        getToCart();
    }

    @AfterEach
    public void parameterizedTestTearDown(){
        driver.quit();
    }
    private void addAnItemToCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement waitingOne = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_PRODUCT_XPATH)));
        driver.findElement(By.xpath(FIRST_PRODUCT_XPATH)).click();
        WebElement waitingTwo = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ADD_TO_CART_BUTTON_XPATH)));
        driver.findElement(By.xpath(ADD_TO_CART_BUTTON_XPATH)).click();
        driver.findElement(By.xpath(ADD_TO_CART_BUTTON_XPATH)).click();
    }

    private void getToCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement waiting = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CART_BUTTON)));
        driver.findElement(By.xpath(CART_BUTTON)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @Test
    public void testPlacingAnOrderValidData(){
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField(NAME_FIELD_INPUT);
        cartPage.fillCountryField(COUNTRY_FIELD_INPUT);
        cartPage.fillCityField(CITY_FIELD_INPUT);
        cartPage.fillCreditCardField(CREDIT_CART_FIELD_INPUT);
        cartPage.fillMonthField(MONTH_FIELD_INPUT);
        cartPage.fillYearField(YEAR_FIELD_INPUT);
        cartPage.clickOnPurchaseButton();
        assertEquals(REGULAR_MESSAGE,cartPage.getResultText());
    }
    @Test
    public void testTotalPriceWithNoProducts(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        cartPage.clickOnDeleteButton();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(PRODUCTS_SUCCESS), 1));
        cartPage.clickOnDeleteButton();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(PRODUCTS_SUCCESS), 0));
        assertEquals("",cartPage.getTotalPrice());
    }
    @Test
    public  void testTotalPriceWithTwoProducts(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(TOTAL_PRICE))));
        assertEquals("720",cartPage.getTotalPrice());
    }
    @CsvSource({
            INVALID_EMPTY_INPUT + "," + COUNTRY_FIELD_INPUT + "," + CITY_FIELD_INPUT + ","
                    + CREDIT_CART_FIELD_INPUT + "," + MONTH_FIELD_INPUT + "," + YEAR_FIELD_INPUT,
            NAME_FIELD_INPUT + "," + INVALID_EMPTY_INPUT + "," + CITY_FIELD_INPUT + ","
                    + CREDIT_CART_FIELD_INPUT + "," + MONTH_FIELD_INPUT + "," + YEAR_FIELD_INPUT,
            NAME_FIELD_INPUT + "," + COUNTRY_FIELD_INPUT + "," + INVALID_EMPTY_INPUT + ","
                    + CREDIT_CART_FIELD_INPUT + "," + MONTH_FIELD_INPUT + "," + YEAR_FIELD_INPUT,
            NAME_FIELD_INPUT + "," + COUNTRY_FIELD_INPUT + "," + CITY_FIELD_INPUT + ","
                    + INVALID_EMPTY_INPUT + "," + MONTH_FIELD_INPUT + "," + YEAR_FIELD_INPUT,
            NAME_FIELD_INPUT + "," + COUNTRY_FIELD_INPUT + "," + CITY_FIELD_INPUT + ","
                    + CREDIT_CART_FIELD_INPUT + "," + INVALID_EMPTY_INPUT + "," + YEAR_FIELD_INPUT,
            NAME_FIELD_INPUT + "," + COUNTRY_FIELD_INPUT + "," + CITY_FIELD_INPUT + ","
                    + CREDIT_CART_FIELD_INPUT + "," + MONTH_FIELD_INPUT + "," + INVALID_EMPTY_INPUT,
            INVALID_EMPTY_INPUT + "," + INVALID_EMPTY_INPUT + "," + INVALID_EMPTY_INPUT + ","
                    + INVALID_EMPTY_INPUT + "," + INVALID_EMPTY_INPUT + "," + INVALID_EMPTY_INPUT,
    })
    @ParameterizedTest(name = "index=> firstInput=''{0}'', secondInput=''{1}'', thirdInput=''{2}'', fourthInput=''{3}'', fifthInput=''{4}'', sixthInput=''{5}''")
    public void testPlacingAnOrderMissingData(String firstInput, String secondInput, String thirdInput,
                                              String fourthInput, String fifthInput,String sixthInput){
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField(firstInput);
        cartPage.fillCountryField(secondInput);
        cartPage.fillCityField(thirdInput);
        cartPage.fillCreditCardField(fourthInput);
        cartPage.fillMonthField(fifthInput);
        cartPage.fillYearField(sixthInput);
        cartPage.clickOnPurchaseButton();
        assertEquals(ALERT_MESSAGE,cartPage.getAlertText());
    }

    private String getLabelText(String xpath) {
        cartPage.clickOnPlaceOrderButton();
        WebElement waiting = new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

        if (XPath.CartPage.ORDER_HEADER.equals(xpath)) {
            return cartPage.getOrderHeaderText();
        } else if (XPath.CartPage.TOTAL_LABEL.equals(xpath)) {
            return cartPage.getTotalLabelText();
        } else if (XPath.CartPage.NAME_LABEL.equals(xpath)){
            return cartPage.getNameLabelText();
        } else if (XPath.CartPage.COUNTRY_LABEL.equals(xpath)){
            return cartPage.getCountryLabelText();
        } else if (XPath.CartPage.CITY_LABEL.equals(xpath)){
            return cartPage.getCityLabelText();
        } else if (XPath.CartPage.CREDIT_CARD_LABEL.equals(xpath)){
            return cartPage.getCreditCardLabelText();
        } else if (XPath.CartPage.MONTH_LABEL.equals(xpath)){
            return cartPage.getMonthLabelText();
        } else if (XPath.CartPage.YEAR_LABEL.equals(xpath)){
            return cartPage.getYearLabelText();
        }
        return "";
    }

    @CsvSource({
            XPath.CartPage.ORDER_HEADER +","+ Signs.CartPage.ORDER_HEADER,
            XPath.CartPage.TOTAL_LABEL + ","+ Signs.CartPage.TOTAL_LABEL,
            XPath.CartPage.NAME_LABEL +","+ Signs.CartPage.NAME_LABEL,
            XPath.CartPage.COUNTRY_LABEL +","+ Signs.CartPage.COUNTRY_LABEL,
            XPath.CartPage.CITY_LABEL +","+ Signs.CartPage.CITY_LABEL,
            XPath.CartPage.CREDIT_CARD_LABEL +","+ Signs.CartPage.CREDIT_CARD_LABEL,
            XPath.CartPage.MONTH_LABEL +","+ Signs.CartPage.MONTH_LABEL,
            XPath.CartPage.YEAR_LABEL +","+ Signs.CartPage.YEAR_LABEL,
    })

    @ParameterizedTest(name = "index=> xpath=''{0}'', expectedLabel=''{1}''")
    public void testSpellingMakingAnOrder(String xpath, String expectedLabel) {
        cartPage.clickOnPlaceOrderButton();
        assertEquals(expectedLabel, getLabelText(xpath));
    }

}
