package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.AllureUtils;

import java.util.concurrent.TimeUnit;
@Log4j2
public class TestListener implements ITestListener {
    public TestListener() {
    }

    public void onTestStart(ITestResult iTestResult) {
        log.info("======================================== STARTING TEST {} ========================================", iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        log.info("======================================== FINISHED TEST {} Duration: {}s ========================================", iTestResult.getName(), this.getExecutionTime(iTestResult));
        /*WebDriver driver = (WebDriver) iTestResult.getTestContext().getAttribute("driver");
        AllureUtils.takeScreenshot(driver);*/
    }

    public void onTestFailure(ITestResult iTestResult) {
        log.info("======================================== FAILED TEST {} Duration: {}s ========================================", iTestResult.getName(), this.getExecutionTime(iTestResult));
        WebDriver driver = (WebDriver) iTestResult.getTestContext().getAttribute("driver");
        AllureUtils.takeScreenshot(driver);
    }

    public void onTestSkipped(ITestResult iTestResult) {
        log.info("======================================== SKIPPING TEST {} ========================================", iTestResult.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    public void onStart(ITestContext iTestContext) {
    }

    public void onFinish(ITestContext iTestContext) {
    }

    private long getExecutionTime(ITestResult iTestResult) {
        return TimeUnit.MILLISECONDS.toSeconds(iTestResult.getEndMillis() - iTestResult.getStartMillis());
    }
}
