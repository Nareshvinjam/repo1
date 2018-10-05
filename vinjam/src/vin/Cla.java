package vin;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Cla {
	public WebDriver driver;
	@Test
	public void altt(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\eclipse_new\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='srch_show_hide_btn']/div[2]/u")).click();
		driver.findElement(By.xpath(".//*[@id='queryTop']/div/input[6]")).click();
		assertEquals(driver.getCurrentUrl(), "http:\\naresh.com");
	}
	@AfterTest
public void sec(ITestResult Result) throws InterruptedException{
	if(ITestResult.FAILURE==Result.getStatus()){
		try {
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("./Reporter/vin4.png"));
			Thread.sleep(3000);
			
		
			
		} catch (IOException e) {
			System.out.println("sucessful:"+e);
			e.printStackTrace();
			
		}
		
	}
	
}
}
