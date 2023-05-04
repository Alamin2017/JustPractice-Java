package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;

public class ProductPage extends ElementActions {
    public WebDriver driver;
    public ProductPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }
    By product1=By.xpath("//img[@alt='Hummingbird printed t-shirt']");

    public void product_one_click() throws InterruptedException {
        click_Element(product1);
    }
    By title_product1=By.xpath("//*[@id=\"main\"]/div[1]/div[2]/h1");
    public String product_one_title() throws InterruptedException {
        return get_text_Element(title_product1);
    }




}
