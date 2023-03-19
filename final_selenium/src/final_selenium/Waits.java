package final_selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Waits {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int i=1;
		while(i>0) {
			driver.findElement(By.xpath("//*[@id='q']//input["+i+"]")).click();
			i++;
			
			FluentWait<WebDriver>wait= new FluentWait<WebDriver>(driver).
			withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.alertIsPresent());
		}
	}

}
