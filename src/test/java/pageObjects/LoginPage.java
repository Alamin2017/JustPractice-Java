package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementActions;
public class LoginPage  {
    public WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        super();
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;
    @FindBy(id="Password")
    @CacheLookup
    WebElement txtPassword;
    @FindBy(xpath="//button[normalize-space()='Log in']")
    @CacheLookup
    WebElement btnLogin;
    @FindBy(xpath="//a[contains(text(),'Logout')]")
    @CacheLookup
    WebElement btnLogout;
    public void setUserName(String uname) throws InterruptedException {

        txtEmail.clear();;
        txtEmail.sendKeys(uname);
        Thread.sleep(3000);
    }
    public void setPassword(String pwd) throws InterruptedException {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
        Thread.sleep(3000);
    }
    public void clickLogin() throws InterruptedException {
        btnLogin.click();
        Thread.sleep(3000);
    }
    public void clickLogout() throws InterruptedException {
        btnLogout.click();
        Thread.sleep(3000);
    }


}
