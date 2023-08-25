package testcases;
import envsetup.BaseEnv;
import org.testng.annotations.Test;
import pageobject.LoginPage;
public class TestLogin extends BaseEnv {
    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        LoginPage.clickSignInButton();
        LoginPage.enterEmail("alamincse12@gmail");
    }

}
