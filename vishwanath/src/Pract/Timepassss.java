package Pract;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Timepassss {
	static WebDriver driver;
	static int a=0;
	public void m1() throws IOException {
		
		TakesScreenshot	 shital=(TakesScreenshot)driver;
		File ss=shital.getScreenshotAs(OutputType.FILE);
		a++;
		File destination= new File("C:\\dbdbdb\\vish"+a+" .png");
		FileHandler.copy(ss, destination);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Timepassss ab = new Timepassss();
		ab.m1();
		Thread.sleep(1000);
		
		
		driver.get("https://www.instagram.com/");
		ab.m1();
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/");
		ab.m1();
	}
}