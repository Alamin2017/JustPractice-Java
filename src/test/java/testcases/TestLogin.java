package testcases;
import envsetup.BaseEnv;
import org.testng.annotations.Test;
import pageobject.LoginPage;
public class TestLogin extends BaseEnv {
    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        logger.info("browse the url");
        LoginPage.clickSignInButton();
        logger.info("click the signin button");
        LoginPage.enterEmail("alaminer34@gmail");
        logger.info("type the email");
    }
}
