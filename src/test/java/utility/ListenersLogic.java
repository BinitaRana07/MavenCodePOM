package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersLogic implements ITestListener
{
	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Listener Logic is started");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("/Users/vinnirana/eclipse-workspace/MyJavaProject/src/module2/ProjectMaven/Screenshots/Pass/TestCasePass.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Reporter.log("Screenshot taken successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		Reporter.log("Listener Logic is started");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("/Users/vinnirana/eclipse-workspace/MyJavaProject/src/module2/ProjectMaven/Screenshots/Failed/TestCaseFailed.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Reporter.log("Screenshot taken successfully");
	}
	
}
