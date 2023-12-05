package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.LinkedList;
import java.util.List;

import static constants.XPath.HomePage.*;

public class HomePage extends BasePage {
    @FindBy(xpath=CAROUSEL_PREVIOUS_ITEM_BUTTON)
    private WebElement carouselPrevButton;
    @FindBy(xpath=CAROUSEL_NEXT_ITEM_BUTTON)
    private WebElement carouselNextButton;
    @FindBy(xpath=CATEGORIES_A)
    private WebElement categoriesA;
    @FindBy(xpath=CATEGORIES_LAPTOPS)
    private WebElement categoriesL;
    @FindBy(xpath=CATEGORIES_MONITORS)
    private WebElement categoriesM;
    @FindBy(xpath=CATEGORIES_PHONES)
    private WebElement categoriesP;
    @FindBy(xpath=PREVIOUS_PAGE_BUTTON)
    private WebElement prevPageButton;
    @FindBy(xpath=NEXT_PAGE_BUTTON)
    private WebElement nextPageButton;
    @FindBys(@FindBy(xpath = ALL_PRODUCT_CARDS_IMAGES_A))
    private List<WebElement> allProdImgA;
    @FindBys(@FindBy(xpath=ALL_PRODUCT_CARDS_A))
    private List<WebElement> allProdA;
    @FindBys({
        @FindBy(xpath=ALL_PRODUCT_CARDS_IMAGES_A),
        @FindBy(css="#tbodyid > div:nth-child(1) > div > a")
    })
    private WebElement firstProdImgA;
    @FindBys({
            @FindBy(xpath=ALL_PRODUCT_CARDS_A),
            @FindBy(css="#tbodyid > div:nth-child(1) > div > div > h4 > a")
    })
    private WebElement firstProdA;
    @FindBy(xpath=SLIDER_1)
    private WebElement slider1;
    @FindBy(xpath=SLIDER_2)
    private WebElement slider2;
    @FindBy(xpath=SLIDER_3)
    private WebElement slider3;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickCarouselPrevButton(){
        carouselPrevButton.click();
    }
    public void clickCarouselNextButton(){
        carouselNextButton.click();
    }
    public void clickCategoriesA(){
        categoriesA.click();
    }
    public void clickCategoriesP(){
        categoriesP.click();
    }
    public void clickCategoriesL(){
        categoriesL.click();
    }
    public void clickCategoriesM(){
        categoriesM.click();
    }
    public void clickPrevPageButton(){
        prevPageButton.click();
    }
    public void clickNextPageButton(){
        prevPageButton.click();
    }
    public void clickFirstProdImgA(){
        firstProdImgA.click();
    }
    public void clickFirstProdA(){
        firstProdA.click();
    }
    public void clickSlider1(){
        slider1.click();
    }
    public void clickSlider2(){
        slider2.click();
    }
    public void clickSlider3(){
        slider3.click();
    }
    public List<String> getAllProdNames(){
        List<String> AllNames = new LinkedList<String>();
        for (WebElement i:allProdA) {

            AllNames.add(getText(i));
        }
        return AllNames;
    }

    public long getScrollPosition(){
        JavascriptExecutor j = (JavascriptExecutor) driver;
        return (long) j.executeScript("return window.pageYOffset;");
    }
}
