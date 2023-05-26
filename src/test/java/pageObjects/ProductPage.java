package pageObjects;
import org.openqa.selenium.By;
import utils.ElementActions;

public class ProductPage extends ElementActions {

    public static By product1=By.xpath("//img[@alt='Hummingbird printed t-shirt']");
    public static void product_one_click() throws InterruptedException {
        ElementActions.click_Element(product1);
    }
    public static By title_product1=By.xpath("//*[@id=\"main\"]/div[1]/div[2]/h1");
    public static String product_one_title() throws InterruptedException {
        return ElementActions.get_Text(title_product1);
    }




}
