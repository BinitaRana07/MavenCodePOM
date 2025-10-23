package utility;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Amazon_BaseClass extends ListenersLogic
{
	@Parameters("browser")
	@BeforeMethod
	public void launch(String nameofBrowser) throws InterruptedException
	{
		if(nameofBrowser.equals("chrome"))
		{
			Reporter.log("Selected chrome Browser");
			driver=new ChromeDriver();
		}
		if(nameofBrowser.equals("firefox"))
		{
			Reporter.log("Selected firefox Browser");
			driver=new FirefoxDriver();
		}
		if(nameofBrowser.equals("safari"))
		{
			Reporter.log("Selected safari Browser");
			driver=new SafariDriver();
		}
		driver.get("https://www.amazon.in");
		Reporter.log("Amazon Website is loaded");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
			
	}
	
	@AfterMethod
	public void quit()
	{
		
	}
}
