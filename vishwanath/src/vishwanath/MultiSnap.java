package vishwanath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultiSnap {
static	WebDriver driver;
public void snap(String s) throws IOException {
	TakesScreenshot ss =(TakesScreenshot)driver;
	File snapp= ss.getScreenshotAs(OutputType.FILE);
	String ssss ="C:\\dbdbdb\\"+s+".png";
	File destination=new File(ssss);
	FileHandler.copy(snapp, destination);
	
}
	public static void main(String[] args) throws InterruptedException, IOException {
		MultiSnap shot = new MultiSnap();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		shot.snap("login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		shot.snap("password");
		
		
	}

}
