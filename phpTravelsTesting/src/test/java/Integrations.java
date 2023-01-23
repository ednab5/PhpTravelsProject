import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Integrations {
    private static WebDriver webDriver;
    private static String baseUrl;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @Test
    void integration() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        baseUrl = "https://phptravels.com/";
        webDriver.get(baseUrl);

        webDriver.manage().window().maximize();
        Thread.sleep(2000);


        webDriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/ul/li[4]/a")).click();
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("/html/body/div[2]/div/div[3]/ul/li[4]/div/div/ul/li[7]/ul/li[2]/a")).click();
        Thread.sleep(2000);


        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));

        webDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/a[1]")).click();
    }

}
