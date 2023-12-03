package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    protected void fillField(WebElement element, String inputText){
        element.clear();
        element.sendKeys(inputText);
    }

    protected String getText(WebElement element){
        return element.getText();
    }
}
