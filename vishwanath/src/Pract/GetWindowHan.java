package Pract;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
Thread.sleep(5000);

String winid = driver.getWindowHandle();
System.out.println(winid);

driver.findElement(By.xpath("//*[@title='Take a look at Instagram']")).click();
Set<String> allwinid = driver.getWindowHandles();
for(String onewinid:allwinid) {
	driver.switchTo().window(onewinid);
	if(driver.getTitle().contains("Instagram")) {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("vish");
	}
}
Thread.sleep(5000);
driver.switchTo().window(winid);
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("nagnath");
}
}


