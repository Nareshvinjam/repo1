package vin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nvi {
 
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	List<WebElement> v = driver.findElements(By.className("_58mt"));
	System.out.println(v.size());
	for(WebElement d:v){
	System.out.println("radio button are:"+d.getText());
	Thread.sleep(2000);
	d.click();
	}
	

	}

}
