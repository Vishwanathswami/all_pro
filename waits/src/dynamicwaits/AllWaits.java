package dynamicwaits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllWaits {
	static WebDriver driver;
	public void m1() {
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int a=1;
		while(a<3) {
			driver.findElement(By.xpath("(//*[@id='q']//input["+a+"])")).click();
			a++;
		}	
	}
	public void m2() {
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public void m3() {
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		FluentWait aa = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(7)).ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//*[@id='alert']")).click();
aa.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
	}
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
driver= new ChromeDriver();
driver.manage().window().maximize();
AllWaits s = new AllWaits();
s.m1();
s.m2();
s.m3();
driver.close();
}
}
