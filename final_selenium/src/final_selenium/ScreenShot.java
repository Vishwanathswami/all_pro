package final_selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	static WebDriver driver;
	public void ssss() throws IOException {
		TakesScreenshot ss= (TakesScreenshot)driver;
	File src=	ss.getScreenshotAs(OutputType.FILE);
	File trg= new File("C:\\dbdbdb\\.png");
	FileHandler.copy(src, trg);
	
		
	}
public static void main(String[]args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	ScreenShot aa= new ScreenShot();
	aa.ssss();
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File trg = new File("C:\\\\dbdbdb\\\\.png");
	FileHandler.copy(src, trg);
	
}
}

