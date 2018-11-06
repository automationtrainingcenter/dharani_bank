package in.srssprojects.kexim_bank;

import java.io.File;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TestNgListener extends TestExecution implements ISuiteListener, ITestListener{

	@Override
	public void onStart(ISuite suite) {
		report = new ExtentReports(new File(getFilePath("reports", suite.getName()+getDate()+".html")).getAbsolutePath());
	}

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
	}

	
	
	@Override
	public void onTestStart(ITestResult result) {
		test = report.startTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		report.endTest(test);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.INFO, test.addScreenCapture(getScreenshot("screenshots", result.getName())));
		report.endTest(test);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		report.endTest(test);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
