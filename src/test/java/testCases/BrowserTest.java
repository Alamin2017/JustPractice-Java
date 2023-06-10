package testCases;
import envPage.BaseEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class BrowserTest extends BaseEnv {
    @Test
    public void pathaoTest() throws InterruptedException {
        driver.get("https://pathao.com/?lang=en");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[normalize-space()='Start Earning']"));
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.scrollToElement(element).build().perform();
        Thread.sleep(2000);
    }
}
