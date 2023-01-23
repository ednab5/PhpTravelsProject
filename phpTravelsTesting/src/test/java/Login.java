import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Login {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait;

    @BeforeTest
    public void startUp(){
        driver.get("https://phptravels.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    }
    @AfterTest
    void tearDown() throws Exception {
    }

    @Test
    public void loginTest(){
        String login = driver.findElement(By.linkText("Login")).getAttribute("href");
        driver.get(login);
        WebElement email = driver.findElement(By.id("inputEmail"));
        WebElement password= driver.findElement(By.id("inputPassword"));
        FluentWait<WebDriver> wait = new FluentWait(driver);
        email.sendKeys("edna.bogdanic@stu.ibu.edu.ba");
        password.sendKeys("12345");
        driver.switchTo().frame(0);
        WebElement captcha= driver.findElement(By.className("recaptcha-checkbox-border"));
        captcha.click();
    }

}

