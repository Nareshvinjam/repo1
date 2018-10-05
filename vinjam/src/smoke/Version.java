package smoke;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Version{
	
@Test	
public void Verfly() throws IOException{
	System.out.println("login amazon");
	ExtentHtmlReporter report=new ExtentHtmlReporter("./reporter/bannu.html");
	ExtentReports extent= new ExtentReports();
	extent.attachReporter(report);
	ExtentTest logger= extent.createTest("Verfly");
	logger.log(Status.INFO, "login to amazon");
	logger.log(Status.PASS, "titleverfly");
	extent.flush();
	ExtentTest logger2=extent.createTest("loggoff");
	logger2.log(Status.PASS, "titleverfly");
	//logger2.fail("fail becauuse of no reson", MediaEntityBuilder.createscreencapturefrompath(""));
	//logger2.addScreenCaptureFromPath("C:\\Users\\HOME\\Downloads\\phots\\DSC00168.JPEG");
	extent.flush();
	
		
		
	}

}
