package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id='alert']")).click();
	WebDriverWait wait= new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id='h2']")), "Selenium Webdriver"));
}
}
