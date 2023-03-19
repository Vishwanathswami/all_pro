package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Calender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("datepicker2")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='datepick']//select[@title='Change the year']//option[1]")).click();
		Thread.sleep(1000);
		WebElement year=driver.findElement(By.xpath("//*[@class='datepick']//select[@title='Change the year']"));
		Select selyear=new Select(year);
		selyear.selectByVisibleText("1996");
		Thread.sleep(1000);
	WebElement month=	driver.findElement(By.xpath("//*[@class='datepick']//select[@title='Change the month']"));
	Select selmonth= new Select(month);
	selmonth.selectByVisibleText("January");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@title='Select Monday, Jan 8, 1996']")).click();
	}

}
