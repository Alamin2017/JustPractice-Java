package envPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
public class BaseEnv {
    public static WebDriver driver;
    public static String browser="Chrome";
    @BeforeMethod
    public void setup()
    {
        switch (browser)
        {
            case "Chrome":
//                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "Edge":
//                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case "ie":
//                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void teardown() {
        driver.close();
    }

}
