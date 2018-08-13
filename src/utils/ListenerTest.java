/*package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
     System.out.println(" Tests Passed" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" Tests failed" + result.getName());
		GetScreenshot.capture(result.getName());     //calling capture method from get screenshot class and here getName() gets the name of testcase that is executing.
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println(" Tests skipped" + result.getName());

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
*/