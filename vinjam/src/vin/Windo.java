package vin;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Windo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		d.getWindowHandle();
		// Verify page title
		assertEquals("Google", d.getTitle());
		WebElement link1=d.findElement(By.linkText("Gmail"));
		Actions a=new Actions(d);
		a.moveToElement(link1).keyDown(Keys.CONTROL).click(link1).build().perform();
		Thread.sleep(4000);
		Set<String> o =d.getWindowHandles();
		Iterator<String>page=o.iterator();
		String s=page.next();
		String s1=page.next();
		d.switchTo().window(s1);
		System.out.println("page title is:"+d.getTitle());

	}

}
