package final_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	String parent=	driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
	Set<String> allWin=driver.getWindowHandles();
	for(String each:allWin) {
		if(!each.equals(parent)) { 
			driver.switchTo().window(each);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@class='d-flex web-menu-btn']//*[text()='Contact Sales']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='Form_getForm_FullName']")).sendKeys("vish");
		}
	}
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	
	
	driver.quit();
	}
}
