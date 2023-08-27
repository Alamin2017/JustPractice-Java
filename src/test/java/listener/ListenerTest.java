package listener;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import static envsetup.BaseEnv.driver;
public class ListenerTest implements ITestListener {
    ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;
    public void configureReport() {
        htmlReporter = new ExtentSparkReporter("Extent_report" + "/test-report/ExtentListenerReport.html");
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);
        //add system information
        reports.setSystemInfo("Machine", "Lenovo");
        reports.setSystemInfo("OS", "10");
        reports.setSystemInfo("Browser", "Chrome");
        reports.setSystemInfo("User", "Al-Amin");
        //configuration to change look
        htmlReporter.config().setDocumentTitle("Extent Reporter Report");
        htmlReporter.config().setReportName("This is an ExtentTest Report");
        htmlReporter.config().setTheme(Theme.DARK);
    }
    public void onStart(ITestContext context) {
        configureReport();
        System.out.println("On Start method invoked");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("Name of test method successfully executed:" + result.getName());
        test = reports.createTest(result.getName());
        test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is:" + result.getName(), ExtentColor.GREEN));
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("Name of test method not executed" + result.getName());
        test = reports.createTest(result.getName());
        String testName=result.getName();
        test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is:" + result.getName(), ExtentColor.RED));
        try {
            test.addScreenCaptureFromPath(takeScreenshot(driver,testName));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void onTestSkipped(ITestResult result) {
        System.out.println("Name of test method skipped" + result.getName());
        test = reports.createTest(result.getName());
        test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped test case is:" + result.getName(), ExtentColor.YELLOW));
    }
    public void onFinish(ITestContext context) {
        System.out.println("On Finish method invoked");
        reports.flush();
    }
    public String takeScreenshot(WebDriver driver,String testName) throws IOException {
//        File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        File Destinationfile = new File(System.getProperty("user.dir")+"\\Fail-Screenshots\\"+testName+".png");
//        FileUtils.copyFile(scrfile, Destinationfile);
//        return Destinationfile.getAbsolutePath();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = (System.getProperty("user.dir")+"\\Fail-Screenshots\\"+testName+".png");
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);
        return dest;

    }
}
