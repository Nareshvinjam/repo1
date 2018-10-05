package vin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ncd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.aponline.gov.in/CitizenPortal/UserInterface/Citizen/LoginForm.aspx");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.id("userId")).sendKeys("naresh");
		driver.findElement(By.id("password")).sendKeys("naresh");
		driver.findElement(By.id("ImageButton1")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
	}

}
