package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static envsetup.BaseEnv.driver;
public class ElementActions {
    public static WebElement getElement(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e) {
            System.out.println("Locator not found within 20 seconds");
        }
        return driver.findElement(locator);
    }
    public static List<WebElement> getElements(By locator) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e){
            System.out.println("Locators not found within 20 seconds");
        }
        return driver.findElements(locator);
    }
    public static void clickElement(By locator) throws InterruptedException {
        getElement(locator).click();
        Thread.sleep(1000);
    }
    public static String getText(By locator) throws InterruptedException {
        Thread.sleep(1000);
        return getElement(locator).getText();
    }
    public static void doEnterValue(By locator, String value) throws InterruptedException {
        Thread.sleep(1000);
        getElement(locator).clear();
        Thread.sleep(1000);
        getElement(locator).sendKeys(value);
    }
}
