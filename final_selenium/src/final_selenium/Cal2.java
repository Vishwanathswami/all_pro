package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cal2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.id("datepicker1")).click();
	Thread.sleep(1000);
	int i=0;
	while(i==0) {
		String title=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		if(!(title.equals("January 1996"))) {
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else
			break;
	}
	driver.findElement(By.xpath("//a[(text()='8')]")).click();
	
	Actions act = new Actions(driver); 
	act.perform();
	
}
}
