package Resources.FirstE2EProject;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersReporting extends Driver_information implements ITestListener {

	//Driver_information di = new Driver_information();
	

	public void onTestFailure(ITestResult result) {
		try {
			getscreenshot(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void onTestSuccess(ITestResult result) {
		
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
