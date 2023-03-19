package vishwanath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://groww.in/");
driver.manage().window().maximize();
Thread.sleep(5000);

String winid =driver.getWindowHandle();
System.out.println(winid);

driver.findElement(By.xpath("//*[@id='homeBox2']")).click();
Set <String> allwinid= driver.getWindowHandles();
for(String onewinid:allwinid) {
	driver.switchTo().window(onewinid);
	if(driver.getTitle().contains("Stock Market LIVE - BSE, NSE & Nifty | Sensex Share Price, Indian Stock/Share Market & Stock Exchange | Groww")) {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("vish");
	}
}
 Thread.sleep(2000);
 driver.switchTo().window(winid);
 driver.findElement(By.xpath("//*[text()='Login/Register']")).click();

	}


}
