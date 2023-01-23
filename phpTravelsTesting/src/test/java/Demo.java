import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Demo {
    private static WebDriver webDriver;
    WebDriverWait wait;
    private static String baseUrl;

    @BeforeTest
    public void startUp(){

    }
    @AfterTest
    void tearDown() throws Exception {

    }


    @Test
    public void demoTest() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        baseUrl = "https://phptravels.com/";
        webDriver.get(baseUrl);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);

        webDriver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div[1]/div/div/a[1]")).click();

        Thread.sleep(2000);

        WebElement firstname = webDriver.findElement(By.name("first_name"));
        firstname.sendKeys("Hanah");

        WebElement lastname = webDriver.findElement(By.name("last_name"));
        lastname.sendKeys("Sijercic");

        WebElement business_name = webDriver.findElement(By.name("business_name"));
        business_name.sendKeys("Pizza Factor");

        WebElement emailAddress = webDriver.findElement(By.name("email"));
        emailAddress.sendKeys("hanah.sijercic@example.com");

        WebElement result = webDriver.findElement(By.id("number"));
        result.sendKeys("RESULT");

    }
    @Test
    public void AppResponsiveQuestionExist(){
        WebElement appresponsive = webDriver.findElement(By.xpath("//*[@id=\"content\"]/section[2]/div/div/div[2]/h3[3]"));
        Assert.assertTrue(appresponsive.isDisplayed());
    }

}
