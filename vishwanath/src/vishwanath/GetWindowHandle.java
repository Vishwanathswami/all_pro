package vishwanath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		String prwinid= driver.getWindowHandle();
		System.out.println(prwinid);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
Set< String> allwinid=driver.getWindowHandles();
for(String onewinid:allwinid) {
	
	driver.switchTo().window(onewinid);

		if(driver.getTitle().contains("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//* [text()='Contact Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//* [@class='middleColumn']//input[@id='Form_submitForm_FullName']")).sendKeys("vish");
		
	}
}
driver.switchTo().window(prwinid);
driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("sushil");

	}

}
