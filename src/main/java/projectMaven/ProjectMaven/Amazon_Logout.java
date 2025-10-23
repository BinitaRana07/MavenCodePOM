package projectMaven.ProjectMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Logout 
{
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private  WebElement accountandlist;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	
	public void hoveroveronAccountsList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void signOutfromLoginPage()
	{
		signout.click();
	}
	
	public Amazon_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
