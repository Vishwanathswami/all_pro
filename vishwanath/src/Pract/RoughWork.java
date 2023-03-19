package Pract;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RoughWork {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement adult =driver.findElement(By.xpath("//*[@id='ddladult1']"));
	Select selm = new Select(adult);
	selm.selectByVisibleText("8");
	Thread.sleep(2000);
	WebElement child =driver.findElement(By.xpath("//*[@id='ddlchildren1']"));
	Select on = new Select(child);
	on.selectByVisibleText("8");
	Thread.sleep(2000);
	
	WebElement infant =driver.findElement(By.xpath("//*[@id='ddlinfants1']"));
	Select off = new Select(infant);
	off.selectByVisibleText("8");
Thread.sleep(5000);
	List<WebElement> types =driver.findElements(By.xpath("//*[@id='concessionaryType1']//option"));
	for(WebElement type:types)
		if(type.getText().equals("Armed Forces"))
			type.click();
		
	}

}
