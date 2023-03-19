package vishwanath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		 Thread.sleep(2000);
		 
driver.findElement(By.xpath("//*[text()='Admin']")).click();
Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,800)");
	
	}
}
