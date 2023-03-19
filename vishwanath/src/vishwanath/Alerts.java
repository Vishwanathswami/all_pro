package vishwanath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	

WebElement Duble=driver.findElement(By.xpath("//*[@id='double-click']"));
Actions acd = new Actions(driver);
acd.doubleClick(Duble).perform();
driver.switchTo().alert().accept();


driver.findElement(By.xpath("//*[@name='alert']")).click();
driver.switchTo().alert().accept();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@name='confirmation']")).click();
driver.switchTo().alert().accept();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@name='prompt']")).click();
driver.switchTo().alert().sendKeys("vishwanath");
driver.switchTo().alert().accept();
Thread.sleep(2000);

WebElement menu=driver.findElement(By.xpath("//*[@id='sub-menu']"));
acd.moveToElement(menu).perform();
driver.findElement(By.xpath("//*[@id='link2']")).click();
	}
	}


