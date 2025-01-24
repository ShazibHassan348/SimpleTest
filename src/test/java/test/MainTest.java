package test;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest{

    Browser browser = AqualityServices.getBrowser();

    @Test
    public void test(){
        browser.goTo("https://dev.app.nuport.io/login");
        int result = 2 + 3;
        Assert.assertEquals(result,5,"2+3 should equal 5");

        browser.quit();
        /// Maintest
    }



}
