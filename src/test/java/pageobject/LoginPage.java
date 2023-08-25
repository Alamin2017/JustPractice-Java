package pageobject;
import org.openqa.selenium.By;
import utils.ElementActions;
public class LoginPage  {
    public static By signin_locator=By.xpath("//span[normalize-space()='Sign in']");
    public static By email_locator=By.xpath("//input[@class='form-control']");
    public static void clickSignInButton() throws InterruptedException {
        ElementActions.clickElement(signin_locator);
    }
    public static void enterEmail(String value) throws InterruptedException {
        ElementActions.doEnterValue(email_locator,value);
    }
}
