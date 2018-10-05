package vin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CC2 {
	public WebDriver driver;
	@Test(priority=0)
	public void vin(){
		driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		String s=driver.getTitle();
		Assert.assertEquals("Sign in - Google Accounts", s);
		
	}
	@Test(priority=1)
	public void jam(){
		driver.close();
		
	}

}
