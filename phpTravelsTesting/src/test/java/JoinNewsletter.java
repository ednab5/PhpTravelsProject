import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JoinNewsletter {
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
    public void testNewsletter() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        baseUrl = "https://phptravels.com/";
        webDriver.get(baseUrl);
        webDriver.manage().window().maximize();
        Thread.sleep(2000);

        String handle = webDriver.getWindowHandle();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement link = webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/div/div/div[2]/button"));
        js.executeScript("arguments[0].click()", link);


        for (String handle1: webDriver.getWindowHandles()) {
            if (!handle1.equals(handle)) {
                webDriver.switchTo().window(handle1);
            }
        }
        Thread.sleep(3000);

        WebElement email = webDriver.findElement(By.id("address"));
        email.sendKeys("exampleexample");

    }
}
