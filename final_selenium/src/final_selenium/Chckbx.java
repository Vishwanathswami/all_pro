package final_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chckbx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		Thread.sleep(5000);
//		List<WebElement> chkbox=driver.findElements(By.xpath("//*[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']"));
//		for(WebElement box:chkbox)
//			box.click();
//		
//	Thread.sleep(5000);
		boolean chk = driver.findElement(By.xpath("//div[text()='irm31']//parent::div//parent::div//span"))
				.isSelected();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='irm31']//parent::div//parent::div//span")).click();
		Thread.sleep(5000);
		
		boolean chk1 = driver.findElement(By.xpath("//div[text()='irm31']//parent::div//parent::div//span")).isSelected();
System.out.println(chk);
System.out.println(chk1);

driver.close();

	}

}
