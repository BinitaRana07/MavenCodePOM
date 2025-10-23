package projectMaven.ProjectMaven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1_LoginToFacebook 
{
	@Test
	public void withValidCred() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		LoginPage obj=new LoginPage(driver);
		obj.cookies_accepting();
		obj.un_valid();
		obj.pwd_valid();
		obj.login_button();
	}
}
