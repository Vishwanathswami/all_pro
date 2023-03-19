package final_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDow {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	List<WebElement> days=	driver.findElements(By .xpath("//*[@id='day']//option"));
	for(WebElement day:days)
		if(day.getText().equals("8"))
			day.click();
	Thread.sleep(2000);
	List<WebElement> months=driver.findElements(By.xpath("//*[@id='month']//option"));
	for(WebElement month:months)
		if(month.getText().equals("Jan"))
			month.click();
	
	Thread.sleep(2000);
WebElement years= driver.findElement(By.xpath("//*[@id='year']"));
	Select selyear= new Select(years);
	selyear.selectByValue("1996");
	
	}

}
