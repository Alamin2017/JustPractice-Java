package testcases;
import envsetup.BaseEnv;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.ProductPage;
public class TestProduct extends BaseEnv {
    @Test(priority = 1)
    public void productTest() throws InterruptedException
    {
        driver.get("http://teststore.automationtesting.co.uk/");
        Thread.sleep(1000);
        ProductPage.productOneClick();
        Thread.sleep(1000);
        String get_title=ProductPage.productOneGetTitle();
        Assert.assertEquals(get_title,"HUMMINGBIRD PRINTED T-SHIRT");
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Hummingbird printed t-shirt']")).isDisplayed());
    }
}
