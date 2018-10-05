package vin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pic {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.za/imghp?hl=en&tab=wi");
        driver.manage().window().maximize();
       WebElement g= driver.findElement(By.id("lst-ib"));
       g.sendKeys("kirthi");
       Thread.sleep(2000);
       g.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(3000);
       g.sendKeys(Keys.ENTER);
   File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(f, new File("E:\\chow\\vinjam\\src\\nam.png"));
   
	}

}
