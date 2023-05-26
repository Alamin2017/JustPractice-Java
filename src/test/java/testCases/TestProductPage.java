package testCases;

import envPage.BaseEnv;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ProductPage;


public class TestProductPage extends BaseEnv {

    @Test(priority = 1)
    public void test_product() throws InterruptedException
    {
        driver.get("http://teststore.automationtesting.co.uk/");
        Thread.sleep(2000);
        ProductPage.product_one_click();
        Thread.sleep(2000);
        String get_title=ProductPage.product_one_title();
        Assert.assertEquals(get_title,"HUMMINGBIRD PRINTED T-SHIRT");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Hummingbird printed t-shirt']")).isDisplayed());
    }
}
