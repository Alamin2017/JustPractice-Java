package testCases;
import envPage.BaseEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class BrowserTest extends BaseEnv {
    @Test
    public void pathaoTest() throws InterruptedException {
        driver.get("https://pathao.com/?lang=en");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//h2[normalize-space()='Earn with your car, bike or bicycle']"));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println(element.getText());
        Thread.sleep(2000);
    }
}
