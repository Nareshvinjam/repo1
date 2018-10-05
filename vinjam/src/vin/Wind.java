package vin;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Wind {
	WebDriver d;
	@Test
	public void testNewtab() throws Exception
	{
		// Load web page
		d.get("https://www.google.com/");
		// Verify page title
		assertEquals("Google", d.getTitle());
		WebElement link1=d.findElement(By.linkText("Gmail"));
		Actions a=new Actions(d);
		a.moveToElement(link1).keyDown(Keys.CONTROL).click(link1).build().perform();
		Thread.sleep(4000);
		ArrayList<String> al=new ArrayList<>(d.getWindowHandles());
		// Switch driver focus Google to Gmail
		d.switchTo().window(al.get(0));
		Thread.sleep(3000);
		// Switch driver focus Gmail to Google
		d.switchTo().window(al.get(1));
		Thread.sleep(2000);
	}
	@BeforeMethod
	public void setUp() throws Exception 
	{
		//System.setProperty("webdriver.gecko.driver", "E:\\Driver Server\\geckodriver.exe");  
	    //d = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\Driver Server\\chromedriver.exe");
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}

}
