package vin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CC4 {
	public WebDriver driver;
	public void home(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		}
	public void reg(){
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("vinjam");
		driver.findElement(By.name("lastName")).sendKeys("naresh");
		driver.findElement(By.name("phone")).sendKeys("7036792515");
		driver.findElement(By.id("userName")).sendKeys("nareshvinjam@gmail.com");
		}
	public void mai() throws InterruptedException{
		driver.findElement(By.name("address1")).sendKeys("konijerala");
		driver.findElement(By.name("city")).sendKeys("Hyderbad");
		driver.findElement(By.name("state")).sendKeys("Andhra Pradesh");
		driver.findElement(By.name("postalCode")).sendKeys("507305");
		Select s=new Select (driver.findElement(By.name("country")));
		s.selectByVisibleText("OMAN");
		List<WebElement>j=s.getOptions();
		System.out.println(j.size());
		System.out.println("================================");
		for(WebElement jj:j){
			System.out.println(jj.getText());
		
		}
		
	}
	public void cnf(){
		driver.findElement(By.id("email")).sendKeys("vinjam");
		driver.findElement(By.name("password")).sendKeys("vinjam@");
		driver.findElement(By.name("confirmPassword")).sendKeys("vinjam@");
		driver.findElement(By.name("register")).click();
	}
	public void TearDown(){
		driver.close();
	}
	}


