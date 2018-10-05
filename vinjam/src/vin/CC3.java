package vin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CC3 {
	public WebDriver driver;
	@BeforeSuite
	public void login(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("login sucess");
		}
	@Test
	public void login1(){
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println("naresh");
	}
   @AfterTest
   public void login2(){
	   WebElement ff=driver.findElement(By.id("lst-ib"));
	   ff.sendKeys("youtube");
	   ff.click();
	   System.out.println("done");
   }
   @AfterSuite
   public void logout(){
	   driver.close();
   }

}
