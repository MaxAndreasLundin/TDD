package max.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SeleniumTest
{
    @Test
    public void googleSearch() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver;
        driver = new FirefoxDriver();

        driver.get("https://google.com/");

        System.out.println(driver.getTitle()); // => "Google"
        System.out.println(driver.getCurrentUrl()); // => "Google"

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5 * 1000);


        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchBox.sendKeys(Keys.ENTER);
        System.out.println(searchBox.getAttribute("value"));
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // =>"Selenium


        driver.quit();
    }
}
