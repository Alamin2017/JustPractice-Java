package pageobject;
import org.openqa.selenium.By;
import utils.ElementActions;
public class ProductPage  {
    public static By product_locator=By.xpath("//img[@alt='Hummingbird printed t-shirt']");
    public static By titleProduct_locator=By.xpath("//*[@id=\"main\"]/div[1]/div[2]/h1");
    public static void productOneClick() throws InterruptedException {
        ElementActions.clickElement(product_locator);
    }
    public static String productOneGetTitle() throws InterruptedException {
        return ElementActions.getText(titleProduct_locator);
    }
}
