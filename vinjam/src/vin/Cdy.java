package vin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Cdy {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        WebElement d=driver.findElement(By.id("gh-ac"));
        Actions a= new Actions(driver);
        a.moveToElement(d).click().keyDown(Keys.SHIFT).sendKeys("insightq").build().perform();
        
	}

}
