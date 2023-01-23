import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SupportedSuppliers {
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

        String handle = webDriver.getWindowHandle();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        WebElement link = webDriver.findElement(By.xpath("/html/body/div[3]/section/div/div[3]/div/div[1]/a"));
        js.executeScript("arguments[0].click()", link);


        for (String handle1: webDriver.getWindowHandles()) {
            if (!handle1.equals(handle)) {
                webDriver.switchTo().window(handle1);
            }
        }

        Thread.sleep(2000);

        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div[1]/div[2]/div/a[2]")).click();
    }
}
