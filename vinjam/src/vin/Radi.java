package vin;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Radi {
	public WebDriver n;
	@Test
public void naresh() throws InterruptedException{
  n=new FirefoxDriver();
  n.manage().window().maximize();
  n.get("https://www.google.com/");
  n.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  WebElement vin=n.findElement(By.linkText("Gmail"));
  Actions a=new Actions(n);
  //a.moveToElement(vin).build().perform().click(vin);
  a.moveToElement(vin).keyDown(Keys.CONTROL).click(vin).build().perform();
  Thread.sleep(4000);
  ArrayList<String> al=new ArrayList<String>(n.getWindowHandles());
  n.switchTo().window(al.get(1));
  Thread.sleep(3000);
  n.switchTo().window(al.get(0));
  Thread.sleep(2000); 
	
}
}
