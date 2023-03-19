package final_selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsFluent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.alertIsPresent());
		
		FluentWait<WebDriver>wit= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		wit.until(ExpectedConditions.alertIsPresent());
		
	}

}
