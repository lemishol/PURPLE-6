package pages;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;
import static constants.XPath.HomePage.*;

public class HomePageTest {
    private HomePage homePage;
    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void testPositionWithNext(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SLIDER_3)));
        long expected = homePage.getScrollPosition();
        homePage.clickSlider3();
        for (int i =0; i<10; i++){
            homePage.clickCarouselNextButton();
        }
        long actual = homePage.getScrollPosition();
        assertEquals(expected, actual);
    }
    @Test
    public void testPositionWithPrevious(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SLIDER_2)));
        long expected = homePage.getScrollPosition();
        homePage.clickSlider2();
        for (int i =0; i<10; i++){
            homePage.clickCarouselPrevButton();
        }
        long actual = homePage.getScrollPosition();
        assertEquals(expected, actual);
    }
    @Test
    public void testPrevPageButtonOnA(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CATEGORIES_A)));
        homePage.clickCategoriesA();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(ALL_PRODUCT_CARDS_A), 9));
        List<String> expected = homePage.getAllProdNames();
        homePage.clickPrevPageButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> actual = homePage.getAllProdNames();
        assertEquals(expected, actual);
    }
    @Test
    public void testPrevPageButtonOnM(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CATEGORIES_MONITORS)));
        homePage.clickCategoriesM();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(ALL_PRODUCT_CARDS_A), 2));
        List<String> expected = homePage.getAllProdNames();
        homePage.clickPrevPageButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> actual = homePage.getAllProdNames();
        assertEquals(expected, actual);
    }
    @Test
    public void testPrevPageButtonOnL(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CATEGORIES_LAPTOPS)));
        homePage.clickCategoriesL();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(ALL_PRODUCT_CARDS_A), 6));
        List<String> expected = homePage.getAllProdNames();
        homePage.clickPrevPageButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> actual = homePage.getAllProdNames();
        assertEquals(expected, actual);
    }
    @Test
    public void testPrevPageButtonOnP(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CATEGORIES_PHONES)));
        homePage.clickCategoriesP();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(ALL_PRODUCT_CARDS_A), 7));
        List<String> expected = homePage.getAllProdNames();
        homePage.clickPrevPageButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> actual = homePage.getAllProdNames();
        assertEquals(expected, actual);
    }
    }

