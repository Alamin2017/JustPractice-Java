package testCases;

import Envpage.BaseEnv;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TestLogin extends BaseEnv {

    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("https://admin-demo.nopcommerce.com/");
        LoginPage lp=new LoginPage(driver);
        lp.setUserName("admin@yourstore.com");
        lp.setPassword("admin");
        lp.clickLogin();
        lp.clickLogout();
    }
    @Test
    public void ePassportTest() throws InterruptedException {
        driver.get("https://www.epassport.gov.bd/landing");
        Thread.sleep(10000);

    }

}
