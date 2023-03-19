package Pract;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FullPract {
	static WebDriver driver;
	static int a=1;
	public void screenshot() throws IOException {
	TakesScreenshot shot=	(TakesScreenshot)driver;
	File source=shot.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\dbdbdb\\"+a+".png");
	FileHandler.copy(source, destination);
	a++;
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FullPract as = new FullPract();
		as.screenshot();
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		as.screenshot();
		Thread.sleep(2000);
		driver.get("https://meet.google.com/");
		as.screenshot();
		
		
	}

}
