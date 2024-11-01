package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Exercise {

    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");

    @BeforeClass
    public void beforeClass() {
        if (osName.contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
        } else {
            System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
        }

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
//TestNG order TCs by alphabet (0-9 A-Z)
    @Test
    public void TC_01_Register_With_Empty_Data() {

        By firstnameTextbox = By.xpath("//*[@id=txtFirstname]");
        By emailTextbox = By.xpath("//*[@id=txtEmail]");
        By cemailTextbox = By.xpath("//*[@id=txtCEmail]");
        By passwordTextbox = By.xpath("//*[@id=txtPassword]");
        By cpasswordTextbox = By.xpath("//*[@id=txtCPassword]");
        By phoneTextbox = By.xpath("//*[@id=txtPhone]");

    //Empty Firstname
        WebElement firstnameerrorElement = driver
                .findElement(RelativeLocator.with(By.id("txtFirstname-error")));
        System.out.println(firstnameerrorElement.getText());

    //Empty email
        WebElement emailerrorElement = driver
                .findElement(RelativeLocator.with(By.id("txtEmail-error")));
        System.out.println(emailerrorElement.getText());

    //Empty CEmail
        WebElement cemailerrorElement = driver
                .findElement(RelativeLocator.with(By.id("txtCEmail-error")));
        System.out.println(cemailerrorElement.getText());

    //Empty Password
        WebElement pwerrorElement = driver
                .findElement(RelativeLocator.with(By.id("txtPassword-error")));
        System.out.println(pwerrorElement.getText());

    //Empty CPassword
        WebElement cpwerrorElement = driver
                .findElement(RelativeLocator.with(By.id("txtCPassword-error")));
        System.out.println(cpwerrorElement.getText());

    //Empty Phone
        WebElement phoneerrorElement = driver
                .findElement(RelativeLocator.with(By.id("txtPhone-error")));
        System.out.println(phoneerrorElement.getText());
    }

    @Test
    public void TC_02_Register_With_Invalid_Email() {

    }

    @Test
    public void TC_03_Register_With_Invalid_ConfirmEmail() {

    }

    @Test
    public void TC_04_Register_With_Password_Less_Than_6_Characters() {

    }

    @Test
    public void TC_05_Register_With_Incorrect_ConfirmPassword(){

    }

    @Test
    public void TC_06_Register_With_Invalid_Phone() {

    }

    @Test
    public void TC_07_Css() {

    }

    @Test
    public void TC_08_XPath() {

    }

    @AfterClass
    public void afterClass () {
       // driver.quit();
    }
}
