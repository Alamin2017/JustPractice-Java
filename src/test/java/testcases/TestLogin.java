package testcases;
import listener.Retry;
import testdata.DataBuilder;
import envsetup.BaseEnv;
import org.testng.annotations.Test;
import pageobject.LoginPage;
import testdata.LoginData;

public class TestLogin extends BaseEnv {
    @Test(retryAnalyzer = Retry.class)
    public void LoginTest() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        LoginPage.clickSignInButton();
        //LoginPage.enterEmail(DataBuilder.getData().getEmail());
        LoginPage.enterEmail(LoginData.userEmail);
        Thread.sleep(5000);
    }
}