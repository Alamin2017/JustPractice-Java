package utils;
import envPage.BaseEnv;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static envPage.BaseEnv.driver;

public class ElementActions  {

    public static WebElement getElement(By locator)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
    public static List<WebElement> getElements(By locator)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }
    public static void click_Element(By locator) throws InterruptedException {
        getElement(locator).click();
        Thread.sleep(2000);
    }
    public static String get_Text(By locator) throws InterruptedException {
        Thread.sleep(2000);
        return getElement(locator).getText();
    }
    public static boolean doDisplayed(By locator) throws InterruptedException {
        Thread.sleep(2000);
        return getElement(locator).isDisplayed();
    }
    public static void doEnterValue(By locator,String value) throws InterruptedException {
        getElement(locator).clear();
        Thread.sleep(2000);
        getElement(locator).sendKeys(value);
    }
}
