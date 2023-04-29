package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import java.util.List;
public class ElementActions  {
    public  WebDriver driver;
    public ElementActions(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement getElement(By locator)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
    public List<WebElement> getElements(By locator)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }
    public void click_Element(By locator) throws InterruptedException {
        getElement(locator).click();
        Thread.sleep(2000);
    }
    public String get_text_Element(By locator) throws InterruptedException {
        Thread.sleep(2000);
        return getElement(locator).getText();
    }
    public boolean doDisplayed(By locator) throws InterruptedException {
        Thread.sleep(2000);
        return getElement(locator).isDisplayed();
    }
    public void doEnterValue(By locator,String value) throws InterruptedException {
        Thread.sleep(2000);
        getElement(locator).sendKeys(value);
    }

}
