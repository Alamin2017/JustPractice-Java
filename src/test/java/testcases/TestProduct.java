package testcases;
import envsetup.BaseEnv;
import listener.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.ProductPage;
public class TestProduct extends BaseEnv {
    @Test(retryAnalyzer = Retry.class)
    public void product_test() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        Thread.sleep(1000);
        ProductPage.productOneClick();
        Thread.sleep(1000);
        String Actual_Msg=ProductPage.productOneGetTitle();
        Thread.sleep(1000);
        Assert.assertEquals(Actual_Msg,"HUMMINGBIRD PRINTED T-SHIRT");
        Thread.sleep(1000);
    }
}

