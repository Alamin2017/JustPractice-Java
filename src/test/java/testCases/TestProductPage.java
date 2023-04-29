package testCases;

import Envpage.BaseEnv;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.ProductPage;


public class TestProductPage extends BaseEnv {

    @Test(priority = 1)
    public void test_product() throws InterruptedException
    {
        driver.get("http://teststore.automationtesting.co.uk/");
        Thread.sleep(5000);
        ProductPage pp=new ProductPage(driver);
        pp.product_one_click();
        Thread.sleep(3000);
        String get_title=pp.product_one_title();
        Assert.assertEquals(get_title,"HUMMINGBIRD PRINTED T-SHIRT");
        Thread.sleep(3000);
    }
}
