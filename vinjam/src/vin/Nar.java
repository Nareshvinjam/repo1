package vin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nar {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.justdial.com/Travel/Train-Booking");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("departDate")).click();
		for(int i=1;i<2;i++){
		String d=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div["+i+"]/div/div/span[1]")).getText();
		System.out.println(d);
		if(d.equalsIgnoreCase("november")){
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[2]/a")).click();
			break;
			}
		i++;
		String d1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div["+i+"]/div/div/span[1]")).getText();
		System.out.println(d1);
		if(d.equalsIgnoreCase("november")){
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[2]/a")).click();
			break;
		}
       driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
       i=0;
		}
	}
}

