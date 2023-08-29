package envsetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseEnv {
    public static WebDriver driver;
    public static String browser = "chrome";
    @BeforeMethod
    public void setup() {

        switch (browser) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver(options);
                break;
            case "edge":
                EdgeOptions options1 = new EdgeOptions();
                options1.addArguments("--disable-notifications");
                driver = new EdgeDriver(options1);
                break;
            case "firefox":
                FirefoxOptions options2 = new FirefoxOptions();
                options2.addArguments("--disable-notifications");
                driver = new FirefoxDriver(options2);
                break;
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @AfterMethod
    public void teardown() {
        driver.close();
    }
}
