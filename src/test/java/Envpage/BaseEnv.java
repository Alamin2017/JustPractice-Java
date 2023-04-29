package Envpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.time.Duration;
public class BaseEnv {
    public static WebDriver driver;
    public static String browser="chrome";
    @BeforeMethod
    public void setup()
    {
        switch (browser)
        {
            case "chrome":
                ChromeOptions ops = new ChromeOptions();
                ops.addArguments("--disable-notifications");
                ops.addArguments("--remote-allow-origins=*");
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver(ops);
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void teardown() throws IOException {
        driver.close();
    }

}
