package testCases;
import envPage.BaseEnv;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class BrowserTest extends BaseEnv {
    @Test
    public void GPTest() throws InterruptedException {
        driver.get("https://www.grameenphone.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"home-second-section-slider\"]/div[1]/div/div[9]/div/div[1]/a")).click();
        Thread.sleep(2000);
    }
}
