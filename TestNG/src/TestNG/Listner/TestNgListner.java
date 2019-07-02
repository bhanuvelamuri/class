package TestNG.Listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListner implements ITestListener {
	@Override
	public void onFinish(ITestContext Result) {
		System.out.println("End Test Class" + Result.getName());
	}
	@Override
	public void onStart(ITestContext Result) {
		System.out.println("Start Test Class" + Result.getName());
	}
	@Override
	public void onTestStart(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("Start Test" + Result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("the name of the test case passed is" + Result.getName());
	}
	@Override
	public void onTestFailure(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("the name of the test case failed is" + Result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult Result) {
		// TODO Auto-generated method stub
		System.out.println("the name of the test case skipped is" + Result.getName());
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		// TODO Auto-generated method stub
		
	}

}
