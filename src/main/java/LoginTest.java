import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    public WebDriver driver;

    @Before
    public void getDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://oiff.com.ua/en/login.html");
        Thread.sleep(1000);


        driver.findElement(By.id("loginform-username"));
        driver.findElement(By.id("loginform-username")).sendKeys("grey.anastasiia@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("loginform-password"));
        driver.findElement(By.id("loginform-password")).sendKeys("qwerty12345");

        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        driver.findElement(By.linkText("ACCREDITATION CABINET")).sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        driver.findElement(By.linkText("GENERATE INVOICE FOR PAYMENT BY BANK TRANSFER FESTIVAL PASS")).sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        driver.findElement(By.linkText("PAY WITH CREDIT CARD FESTIVAL PASS")).sendKeys(Keys.ENTER);




    }

    @Test
    public void getDriverTest() throws InterruptedException {
//        Assert.assertNotNull(driver.findElement(By.className("success")));
//        Thread.sleep(1000);
    }

    @After
    public void exitandclaer() {
//        driver.quit();
    }

}
