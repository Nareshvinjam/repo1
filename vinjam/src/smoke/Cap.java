package smoke;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Cap {
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;

@Test
public void chow(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\eclipse_new\\chromedriver.exe");
	driver= new ChromeDriver();
	report=new ExtentReports("C:\\chow\\Report\\naresh.html",true);
	logger=report.startTest("chow");
	driver.manage().window().maximize();
	logger.log(LogStatus.INFO, "browser start");
	driver.get("http://learn-automation.com/");
	String title=driver.getTitle();
	Assert.assertTrue(title.contains("Selenium"));
	logger.log(LogStatus.PASS, "chow");
	driver.get("C:\\chow\\Report\\naresh.html");
	
}



}
