package vin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrom {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chow\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.za/search?hl=en&biw=1366&bih=662&tbm=isch&sa=1&ei=Ze9BW5fqFpDWgQbJx6bIAg&q=deepika+padukone+photos&oq=deepika+padukone+photos&gs_l=img.12...0.0.0.4165.0.0.0.0.0.0.0.0..0.0....0...1c..64.img..0.0.0....0.tS2-xa_z6Ho");
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E://chow.png"));

	}

}
