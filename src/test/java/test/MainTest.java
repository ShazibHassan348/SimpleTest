package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{

    @Test
    public void test(){
        int result = 2 + 3;
        Assert.assertEquals(result,5,"2+3 should equal 5");
        /// Maintest
    }



}
