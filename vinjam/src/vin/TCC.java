package vin;

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

public class TCC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\eclipse_new\\chromedriver.exe");
		WebDriver v= new ChromeDriver();
		v.get("http://www.rediff.com/");
		v.manage().window().maximize();
		v.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		v.findElement(By.xpath(".//*[@id='srch_show_hide_btn']/div[2]/u")).click();
		v.findElement(By.xpath(".//*[@id='queryTop']/div/input[6]")).click();
Thread.sleep(3000);
		File i=((TakesScreenshot)v).getScreenshotAs(OutputType.FILE);
 try {
	FileUtils.copyFile(i, new File("D:\\F.PNG"));

 Alert alt=v.switchTo().alert();
 System.out.println(alt.getText());
 alt.accept();
 } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 

	}

}
