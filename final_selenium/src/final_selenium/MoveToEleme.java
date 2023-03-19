package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToEleme {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement source=	driver.findElement(By.xpath("//*[text()='right click me']"));
	Actions act = new Actions(driver);
	act.contextClick(source).perform();
	driver.findElement(By.xpath("//*[text()='Quit']")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	WebElement target=driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
	act.doubleClick(target).perform();
	driver.switchTo().alert().accept();
	}

}
