package testCases;
import envPage.BaseEnv;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
public class TestLogin extends BaseEnv {
    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        Thread.sleep(2000);
        LoginPage.signinButton().click();
        Thread.sleep(2000);

    }

}
