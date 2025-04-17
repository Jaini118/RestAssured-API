package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("== Starting test suite ==");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("== Test suite finished ==");
        System.out.println("Test report generated at: " + context.getOutputDirectory());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("✅ " + result.getName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("❌ " + result.getName() + " failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("⏭️ " + result.getName() + " skipped");
    }
}