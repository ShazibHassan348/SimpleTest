package test;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    Browser browser = AqualityServices.getBrowser();


    public void setup(){
        browser.goTo("https://dev.app.nuport.io/login");

    }

    public void teardown(){
        browser.quit();
    }
}
