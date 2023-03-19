package final_selenium;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		List<WebElement> AllLinks=driver.findElements(By.tagName("a"));
		int NoOfLink= AllLinks.size();
		System.out.println("number of links>>>"+NoOfLink);
		System.out.println();
		
		for(WebElement link:AllLinks) {
			String urllink=link.getAttribute("href");
			try {
			URL url=new URL(urllink);
			HttpsURLConnection httpsconnection= (HttpsURLConnection) url.openConnection();
			httpsconnection.setConnectTimeout(5000);
			httpsconnection.connect();
			if(httpsconnection.getResponseCode()!=200)
				System.out.println(urllink+"---->>"+"broken link");
			else
				System.out.println(urllink+"---->>"+"valid link");
			}
			catch(Exception e) {
				System.out.println();
			}
		}
		
		
	
		
		
		
	driver.close();	
	}
	

}
