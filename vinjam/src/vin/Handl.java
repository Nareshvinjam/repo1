package vin;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handl {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		String pgtitle=driver.getTitle();
		System.out.println("ist page is:"+pgtitle);
		driver.findElement(By.linkText("Terms")).click();
		Set <String> w=driver.getWindowHandles();
		Iterator<String> we=w.iterator();
		String q=we.next();
		System.out.println(q);
		String q1=we.next();
		driver.switchTo().window(q1);
		String lite=driver.getTitle();
		System.out.println("===============================================");
		System.out.println("2nd page is:"+lite);
				
	}

}
