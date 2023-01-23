import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Register {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait;

    @BeforeTest
    public void startUp(){
        driver.get("https://phptravels.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));}
    @AfterTest
    void tearDown() throws Exception {

    }

    @Test
    public void signUpTest(){
        String signUp = driver.findElement(By.linkText("Sign Up")).getAttribute("href");
        driver.get(signUp);
        WebElement firstName = driver.findElement(By.id("inputFirstName"));
        WebElement lastName = driver.findElement(By.id("inputLastName"));
        WebElement emailAddress = driver.findElement(By.id("inputEmail"));
        WebElement phoneNumber = driver.findElement(By.id("inputPhone"));
        WebElement companyName = driver.findElement(By.id("inputCompanyName"));
        WebElement streetAddress = driver.findElement(By.id("inputAddress1"));
        WebElement streetAddress2 = driver.findElement(By.id("inputAddress2"));
        WebElement city = driver.findElement(By.id("inputCity"));
        WebElement state = driver.findElement(By.id("stateinput"));
        WebElement postCode = driver.findElement(By.id("inputPostcode"));
        WebElement country = driver.findElement(By.id("inputCountry"));
        WebElement mobile = driver.findElement(By.id("customfield2"));
        WebElement password = driver.findElement(By.id("inputNewPassword1"));
        FluentWait<WebDriver> wait = new FluentWait(driver);
        firstName.sendKeys("Edna");
        lastName.sendKeys("Bogdanic");
        emailAddress.sendKeys("edna.bogdanic@stu.ibu.edu.ba");
        phoneNumber.sendKeys("062077370");
        companyName.sendKeys("Ptravels");
        streetAddress.sendKeys("dr.Silve");
        streetAddress2.sendKeys("12MainStreet");
        city.sendKeys("Sarajevo");
        state.sendKeys("BiH");
        postCode.sendKeys("71000");
        country.sendKeys("Bosnia&Herzegowina");
        mobile.sendKeys("038234567");
        password.sendKeys("pass123");

    }

}
