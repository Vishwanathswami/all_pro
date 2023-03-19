package final_selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static WebDriver driver;
	
	public void BrolenLink(String urlLink) {
		try {
			URL url= new URL(urlLink);
			HttpURLConnection httpconnection=		(HttpURLConnection)url.openConnection();
			httpconnection.connect();
			if(httpconnection.getResponseCode()>=400)
				System.out.println(urlLink+"-->"+httpconnection.getResponseMessage()+"broken link");
			else
				System.out.println(urlLink+"-->"+httpconnection.getResponseMessage()+"valid url");
		}
		catch(Exception e) {
			System.out.println("hello");
		}
	}
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

 		driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (WebElement link : alllinks) {
			String urlLink = link.getAttribute("href");
		
		BrokenLinks ob = new BrokenLinks();
		ob.BrolenLink(urlLink);
	}
		driver.quit();
}
}