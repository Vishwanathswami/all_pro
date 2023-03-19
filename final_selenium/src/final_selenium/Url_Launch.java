package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_Launch {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
 String s=driver.getTitle();
 System.out.println(s);
 String ss= driver.getCurrentUrl();
 System.out.println(ss);
 Thread.sleep(1000);
 String txt=driver.findElement(By.xpath("//*[@id='email']")).getText();
 System.out.println(txt);

	}

}
