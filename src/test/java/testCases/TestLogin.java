package testCases;

import envPage.BaseEnv;
import org.testng.annotations.Test;

public class TestLogin extends BaseEnv {

    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        Thread.sleep(2000);
    }
    @Test
    public void PassportTest() throws InterruptedException {
        driver.get("https://www.epassport.gov.bd/landing");
        Thread.sleep(2000);

    }

}
