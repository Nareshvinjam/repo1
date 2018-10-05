package vin;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nari {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String ppt=driver.getWindowHandle();

		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Gmail")).click();
		Set<String> page=driver.getWindowHandles();
		Iterator<String> pg=page.iterator();
		System.out.println(page.size());
		while(pg.hasNext()){
			String g=pg.next();
			driver.switchTo().window(g);
			System.out.println(driver.getTitle());
			driver.switchTo().window(ppt);
			
		}
	

	}

}
