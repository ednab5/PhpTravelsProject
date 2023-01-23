import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestExistance {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait;


    @BeforeTest
    public void startUp(){
        driver.get("https://phptravels.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void logoExists(){
        WebElement logo = driver.findElement(By.className("logo"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    public void NavbarMenuItemsExist(){
        WebElement navbarMenu = driver.findElement(By.className("jfHeader-menuList"));
        Assert.assertTrue(navbarMenu.isDisplayed());
    }

    @Test
    public void PricingExists(){
        WebElement pricing=driver.findElement(By.xpath("//a[@href='https://phptravels.com/pricing/']"));
                Assert.assertTrue(pricing.isDisplayed());
    }
    @Test
    void Companyfeatures(){

        WebElement pricing=driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/ul/li[5]/a"));
        Assert.assertTrue(pricing.isDisplayed());
    }

    @Test
    public void linksExist() throws InterruptedException{

        WebElement facebookLink = driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/div[2]/a[1]"));
        WebElement twitterLink = driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/div[2]/a[2]"));
        WebElement linkedinLink = driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/div[2]/a[3]"));
        WebElement youtube= driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/div[2]/a[4]"));
        WebElement instagram= driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/div[2]/a[5]"));
        Assert.assertTrue(facebookLink.isDisplayed());
        Assert.assertTrue(twitterLink.isDisplayed());
        Assert.assertTrue(linkedinLink.isDisplayed());
        Assert.assertTrue(youtube.isDisplayed());
        Assert.assertTrue(instagram.isDisplayed());
        Thread.sleep(3000);

       

    }

}

