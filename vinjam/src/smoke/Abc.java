package smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Abc {
	@Test
	public void naresh(){
		ExtentHtmlReporter report= new ExtentHtmlReporter("./Reporter/v.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		ExtentTest logger=extent.createTest("vinjam");
		logger.log(Status.INFO, "verfied");
		logger.log(Status.PASS, "Tittle verfied");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\eclipse_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		logger.log(Status.PASS, "Fb opened");
		extent.flush();
	}

}
