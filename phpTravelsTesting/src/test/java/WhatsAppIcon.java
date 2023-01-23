import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class WhatsAppIcon {
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
    public void whatsapptest() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\chrome\\chromedriver.exe");
        webDriver = new ChromeDriver();
        baseUrl = "https://phptravels.com/";
        webDriver.get(baseUrl);
        webDriver.manage().window().maximize();
        Thread.sleep(3000);

        String handle = webDriver.getWindowHandle();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement link = webDriver.findElement(By.xpath("/html/body/a"));
        js.executeScript("arguments[0].click()", link);
        Thread.sleep(3000);


        for (String handle1: webDriver.getWindowHandles()) {
            if (!handle1.equals(handle)) {
                webDriver.switchTo().window(handle1);
            }
        }

        String header=webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/section/div/div/div/div[2]/div[1]/h3")).getText();

        WebElement textheader=webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div/nav/ul"));
        Assert.assertTrue(textheader.isDisplayed());
        webDriver.navigate().refresh();
        Thread.sleep(3000);

    }
}
