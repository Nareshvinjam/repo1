package smoke;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Kop_1 {
	@Test
	public void Start(){
		ExtentHtmlReporter report= new ExtentHtmlReporter("./reporter/bann.html");
		ExtentReports re=new ExtentReports();
		re.attachReporter(report);
		ExtentTest logger=re.createTest("vinjam");
		logger.log(Status.INFO, "page tittle");
		logger.log(Status.PASS, "verfy");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\eclipse_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nareshvinjam@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9848000768");
		driver.findElement(By.xpath(".//*[@id='u_0_']")).click();
		
		
		
	
		
		driver.close();
		re.flush();
	}

}
