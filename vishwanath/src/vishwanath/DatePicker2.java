package vishwanath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		Thread.sleep(1000);
		int i=0;
		while(i==0) {
			String years=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();	
		if(!(years.equals("January 1996"))) {
		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		else
			break;
		}
		driver.findElement(By.xpath("//a[(text()='8')]")).click();
		}
	}
	

