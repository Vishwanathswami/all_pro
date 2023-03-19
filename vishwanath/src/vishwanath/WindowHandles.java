package vishwanath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String winid = driver.getWindowHandle();
	Set <String> allwinid=	driver.getWindowHandles();
	int noofwin=allwinid.size();
	if(noofwin>1) {
		for(String onewinid:allwinid) {
			if(!(onewinid.equals(winid))) {
				driver.switchTo().window(onewinid);
				driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("vishwanath");
			}
		}
	}
	else
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("sushil");

	}

}
