package Task5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        String testUrl = "https://www.demoblaze.com/index.html";

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testUrl);
        driver.findElement(By.id("login2")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(d -> driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button")).click();
        try{
            sleep(5000);
            driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
            System.out.println("test failed");
        }
        catch (Exception e){
            System.out.println("test successful");
        }
        finally {
            driver.quit();

        }
    }
}
