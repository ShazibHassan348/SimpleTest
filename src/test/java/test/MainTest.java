package test;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest{

    Browser browser = AqualityServices.getBrowser();
    WebDriver driver;

    @Before
    public void Setup(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.app.nuport.io/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

    }



    @Test
    public void test(){
        int result = 2 + 3;
        Assert.assertEquals(result,5,"2+3 should equal 5");


    }



}
