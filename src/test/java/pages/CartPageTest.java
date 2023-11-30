package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.XPath.Common.CART_BUTTON;
import static org.junit.Assert.assertEquals;

import pages.CartPage.*;

public class CartPageTest {
    private CartPage cartPage;
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        cartPage=new CartPage(driver);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.quit();
    }
    private void addAnItemToCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.findElement(By.xpath("//*[@class='card-title']//*[@href='prod.html?idp_=1']")).click();
    }

    private void getToCart(){
        driver.findElement(By.xpath(CART_BUTTON)).click();
        cartPage.clickOnPlaceOrderButton();
    }

    @Test
    public void testPlacingAnOrderValidData(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        cartPage.fillNameField("Charles Leclerc");
        cartPage.fillCountryField("Principality of Monaco");
        cartPage.fillCityField("Monaco");
        cartPage.fillCreditCardField("374245455400126");
        cartPage.fillMonthField("8");
        cartPage.fillYearField("2027");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getResultText();
        String expectedResult = "Thank you for your purchase!";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlacingAnOrderInvalidDataNoName(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        getToCart();
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField("");
        cartPage.fillCountryField("Principality of Monaco");
        cartPage.fillCityField("Monaco");
        cartPage.fillCreditCardField("374245455400126");
        cartPage.fillMonthField("8");
        cartPage.fillYearField("2027");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlacingAnOrderInvalidDataNoCountry(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        getToCart();
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField("Charles Leclerc");
        cartPage.fillCountryField("");
        cartPage.fillCityField("Monaco");
        cartPage.fillCreditCardField("374245455400126");
        cartPage.fillMonthField("8");
        cartPage.fillYearField("2027");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlacingAnOrderInvalidDataNoCity(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        getToCart();
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField("Charles Leclerc");
        cartPage.fillCountryField("Principality of Monaco");
        cartPage.fillCityField("");
        cartPage.fillCreditCardField("374245455400126");
        cartPage.fillMonthField("8");
        cartPage.fillYearField("2027");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlacingAnOrderInvalidDataNoCreditCard(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        cartPage.fillNameField("Charles Leclerc");
        cartPage.fillCountryField("Principality of Monaco");
        cartPage.fillCityField("Monaco");
        cartPage.fillCreditCardField("");
        cartPage.fillMonthField("8");
        cartPage.fillYearField("2027");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlacingAnOrderInvalidDataNoYear(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        cartPage.fillNameField("Charles Leclerc");
        cartPage.fillCountryField("Principality of Monaco");
        cartPage.fillCityField("Monaco");
        cartPage.fillCreditCardField("374245455400126");
        cartPage.fillMonthField("8");
        cartPage.fillYearField("");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlacingAnOrderInvalidDataNoMonth(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        getToCart();
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField("Charles Leclerc");
        cartPage.fillCountryField("Principality of Monaco");
        cartPage.fillCityField("Monaco");
        cartPage.fillCreditCardField("374245455400126");
        cartPage.fillMonthField("");
        cartPage.fillYearField("2027");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testPlacingAnOrderInvalidDataNothing(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        getToCart();
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField("");
        cartPage.fillCountryField("");
        cartPage.fillCityField("");
        cartPage.fillCreditCardField("");
        cartPage.fillMonthField("");
        cartPage.fillYearField("");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPlacingAnOrderInvalidDataLargeName(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        getToCart();
        cartPage.clickOnPlaceOrderButton();
        cartPage.fillNameField("Charles Marc Hervé Perceval Leclerc");
        cartPage.fillCountryField("Principality of Monaco");
        cartPage.fillCityField("Monaco");
        cartPage.fillCreditCardField("374245455400126");
        cartPage.fillMonthField("8");
        cartPage.fillYearField("2027");
        cartPage.clickOnPurchaseButton();
        String actualResult = cartPage.getAlertText();
        String expectedResult = "Please fill out Name and Creditcard.";
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testHeaderSpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "Place order";
        WebElement usernameElement = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModalLabel")));
        String actualResult = cartPage.getOrderHeaderText();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testTotalSpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "Total:";
        WebElement usernameElement = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.id("totalm")));
        String actualResult = cartPage.getTotalLabelText();
        assertEquals(expectedResult,actualResult);
    }


    @Test
    public void testNameSpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "Name:";
        String actualResult = cartPage.getNameLabelText();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCountrySpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "Country:";
        String actualResult = cartPage.getCountryLabelText();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCitySpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "City:";
        String actualResult = cartPage.getCityLabelText();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCreditCardSpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "Credit card:";
        String actualResult = cartPage.getCreditCardLabelText();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testMonthSpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "Month:";
        String actualResult = cartPage.getMonthLabelText();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testYearSpelling(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addAnItemToCart();
        getToCart();
        String expectedResult = "Year:";
        String actualResult = cartPage.getYearLabelText();
        assertEquals(expectedResult,actualResult);
    }
}
