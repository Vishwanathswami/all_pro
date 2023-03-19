package vishwanath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement day=	driver.findElement(By.id("day"));
	WebElement month=	driver.findElement(By.id("month"));
	WebElement year=	driver.findElement(By.id("year"));
	
Select selday=new Select(day);	
selday.selectByValue("8");
Select selmo=new Select(month);	
selmo.selectByValue("1");
Select selyear=new Select(year);	
selyear.selectByVisibleText("1996");



	}
}
