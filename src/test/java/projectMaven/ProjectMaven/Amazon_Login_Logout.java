package projectMaven.ProjectMaven;

import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.Amazon_BaseClass;
import utility.ListenersLogic;
import utility.RetryLogic;


@Listeners(ListenersLogic.class)
public class Amazon_Login_Logout extends Amazon_BaseClass
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void withvalidCredentails() throws InterruptedException
	{
		Amazon_Home homepage=new Amazon_Home(driver);
		homepage.hoveroveronAccountsList(driver);
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.signinfromHomePage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Amazon_Login loginpage=new Amazon_Login(driver);
		loginpage.validUsername();
		loginpage.continueClick();
		loginpage.validPassword();
		loginpage.signinClick();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Amazon_Logout logoutpage = new Amazon_Logout(driver);
		logoutpage.hoveroveronAccountsList(driver);
		logoutpage.signOutfromLoginPage();
	}
}
