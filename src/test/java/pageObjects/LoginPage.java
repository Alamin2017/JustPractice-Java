package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static envPage.BaseEnv.driver;
public class LoginPage  {

    public static By signIn=By.xpath("//span[normalize-space()='Sign in']");
    public static WebElement signinButton()
    {
        return driver.findElement(signIn);
    }

}
