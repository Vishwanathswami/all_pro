package vishwanath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUps1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String winid=driver.getWindowHandle();
		System.out.println(winid);
	driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
	Thread.sleep(1000);
	Set <String> allwin=driver.getWindowHandles();
	int number=allwin.size();
	if(number>1) {
	for(String onewin:allwin) {
		if(!(onewin.equals(winid))) {
			driver.switchTo().window(onewin);
			driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("vish323");
		}
	}
	}
	else
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("sush123");
}
}
