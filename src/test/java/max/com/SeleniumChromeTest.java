package max.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.fail;

public class SeleniumChromeTest {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void webPageTest() {
        driver.get("https://www.sweclockers.com/");
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rtx 3090");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Apple M1 Ultra utpresterar inte Nvidia Geforce RTX 3090")).click();
        String expected = "Apple M1 Ultra utpresterar inte Nvidia Geforce RTX 3090";
        String actual = driver.getTitle();
        System.out.println("Page title is: " + driver.getTitle());
        Assertions.assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
