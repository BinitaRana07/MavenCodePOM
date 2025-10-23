package projectMaven.ProjectMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login 
{
	WebDriver driver;
	//step 1
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signinbutton;
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	
	
	
	
	public void validUsername()
	{
		username.sendKeys("7210305971");
	}
	public void continueClick()
	{
		continuebutton.click();
	}
	public void validPassword()
	{
		password.sendKeys("testingamazon");
	}
	public void signinClick()
	{
		signinbutton.click();
	}
	public Amazon_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
}
