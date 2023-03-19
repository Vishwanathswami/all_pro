package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practce2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//simple alert
		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
//timerAlert
		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
//confirmatonalert
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
//promtAlert
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("sushil");
		driver.switchTo().alert().accept();
}
}