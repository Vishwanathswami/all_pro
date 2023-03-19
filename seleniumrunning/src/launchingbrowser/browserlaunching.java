package launchingbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserlaunching {
	public static void main(String args[]) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/");
			//Thread.sleep(2000);
			//driver.manage().window().maximize();
			//Thread.sleep(2000);
			System.out.println(driver.getTitle());
			driver.quit();
			
	}

}
