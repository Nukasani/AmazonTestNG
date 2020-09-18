package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Loginpage;
import utilities.Utility;


public class TestwithDataprovider 
{
	@DataProvider(name="values")
	public Object[][] method1()
	{
		Object[][] OO= new Object[][]
				      {
				          {"chrome","sriharshanukasani@gmail.com","Harsha@5304"},
				          {"opera","sriharshanukasani@gmail.com","Harsha@5304"},
				          {"firefox","sriharshanukasani@gmail.com","Harsha@5304"}
		              };
		return(OO);
		}
	
	@Test(dataProvider="values")
	public void method2(String bn,String u,String p)
	{
		Utility ut=new Utility();
		WebDriver driver;
		driver=ut.openBrowser(bn);
		ut.launchSite("https://www.amazon.in/");
		Loginpage lp=new Loginpage(driver);
		lp.clickHellosigin();
		lp.uidFill(u);
		lp.clickuid();
		lp.pwdFill(p);
		lp.Clickpwd();
		ut.closeSite();
		
	}
	
	
	
	
		
	}


