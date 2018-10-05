package smoke;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Bin {
WebDriver driver;
ExtentReports extent;
ExtentTest logger;

@BeforeMethod
public void main(){
	ExtentHtmlReporter report=new ExtentHtmlReporter("./reporter/na.html");
	extent= new ExtentReports();
	extent.attachReporter(report);
    logger= extent.createTest("Verfly");
	logger.log(Status.PASS, "verfly");
}
@Test
public void naresh(){
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\eclipse_new\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nareshvinjam@gmail.com");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9848000768");
	driver.findElement(By.xpath(".//*[@id='u_0_']")).click();
	
}

		
@AfterMethod
public void method(ITestResult result) throws InterruptedException{
	if(ITestResult.FAILURE==result.getStatus()){
		try {
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("./Reporter/vin7.png"));
			Thread.sleep(3000);
			logger.addScreenCaptureFromPath("./Reporter/vin7.png");
		
			
		} catch (IOException e) {
			System.out.println("sucessful:"+e);
			e.printStackTrace();
		}
		
	}
	
	
	driver.close();
	extent.flush();
}


}

