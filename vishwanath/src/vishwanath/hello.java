package vishwanath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("asd");
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 inputtext _9npi inputtext _9npi')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		
	}

}
