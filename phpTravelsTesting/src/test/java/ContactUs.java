import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

import static org.testng.Assert.assertEquals;

public class ContactUs {
    private static WebDriver webDriver;
    WebDriverWait wait;
    private static String baseUrl;

    ContactUs() {
    }

    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        webDriver.quit();
    }

    @Test
    void test () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        baseUrl = "https://phptravels.com";


        webDriver.get(baseUrl);
        webDriver.manage().window().maximize();

        webDriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/ul/li[5]/a")).click();

        Thread.sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/ul/li[5]/div/ul/li[2]/ul/li[2]/a")).click();

        Thread.sleep(2000);

        String header=webDriver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/p")).getText();
        assertEquals("Contact us anytime and we will be happy to assist you.",header);

        webDriver.navigate().refresh();
        Thread.sleep(3000);

    }
}
