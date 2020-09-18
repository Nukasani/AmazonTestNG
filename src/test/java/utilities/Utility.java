package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility 
{
	
	public WebDriver driver;
	
	public WebDriver openBrowser(String bn)
	{
		if(bn.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(bn.equalsIgnoreCase("opera"))
		{
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		return(driver);
	}
			
		public void launchSite(String x)
		{
			driver.get(x);
		}
		public void closeSite()
		{
			driver.close();
		}
	}


