package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
WebElement source=driver.findElement(By.xpath("//*[text()=' 5000 ']"));
WebElement target= driver.findElement(By.xpath("//*[@id='amt7']"));
Actions act = new Actions (driver);
act.dragAndDrop(source, target).perform();
Thread.sleep(5000);
WebElement aa= driver.findElement(By.xpath("//*[text()=' 5000']"));
act.clickAndHold(aa).perform();
Thread.sleep(2000);
WebElement bb= driver.findElement(By.xpath("//*[@id='amt8']"));
act.moveToElement(bb).release().perform();



}

}
