import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pricing {

    private static WebDriver webDriver;
    WebDriverWait wait;
    private static String baseUrl;
        @BeforeTest
        public void setUp() throws Exception {

        }

        @AfterTest
        public void tearDown() throws Exception {
            webDriver.quit();
        }

    @Test
    public void testPricing() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        baseUrl = "https://phptravels.com/";
        webDriver.get(baseUrl);
        webDriver.manage().window().maximize();
        Thread.sleep(2000);


        webDriver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div[1]/div/div/a[2]")).click();

        Thread.sleep(5000);


        String handle = webDriver.getWindowHandle();



        for (String handle1: webDriver.getWindowHandles()) {
            if (!handle1.equals(handle)) {
                webDriver.switchTo().window(handle1);
            }
        }

        WebElement firstName = webDriver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[3]/div[1]/div/div/div/input"));
        firstName.sendKeys("Edna");

        WebElement lastName = webDriver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/div[3]/div/div[1]/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/input"));
        lastName.sendKeys("Bogdanic");

        WebElement emailAddress = webDriver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailAddress.sendKeys("edna.bogdanic@example.com");


        WebElement streetAddress = webDriver.findElement(By.id("address"));
        streetAddress.sendKeys("MainAddress");


    }}




