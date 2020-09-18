package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	
	public WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//span[text()='Hello, Sign in']")
	public WebElement Hellosigin;
	
	@FindBy(name="email")
	public WebElement uid;
	
	@FindBy(id="continue")
	public WebElement uidclick;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(id="signInSubmit")
	public WebElement pwdclick;
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickHellosigin()
	{
		Hellosigin.click();
	}
	public void uidFill(String x)
	{
		uid.sendKeys(x);
	}
	public void clickuid()
	{
		uidclick.click();
	}
	public void pwdFill(String x)
	{
		pwd.sendKeys(x);
	}
	public void Clickpwd()
	{
		pwdclick.click();
	}
	
	

}
