package projectMaven.ProjectMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.asserts.SoftAssert;

public class Amazon_Home 
{
	WebDriver driver;
	//SoftAssert s1=new SoftAssert();
	
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private  WebElement accountandlist;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signin;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	//step 2
	public void hoveroveronAccountsList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	public void signinfromHomePage()
	{
		signin.click();
	}
	
	public void SearchProduct()
	{
		search.sendKeys("Shoes"+Keys.ENTER);
		/*List<WebElement> product=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		s1.assertEquals(product.size()>50, true,"Sorry expected Behaviour is not matching with actual behaviour");
		s1.assertAll();*/
	}
	
	//Step 3
	public Amazon_Home(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

}
