package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//*[text()=' Login ']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[text()='Admin']")).click();
Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor)driver; 
WebElement cc=driver.findElement(By.xpath("//*[text()='Dominic.Chase']"));
//js.executeScript("arguments[0].scrollIntoView()",cc );
js.executeScript("arguments[0].click()",cc);

		driver.quit();
	}

}
