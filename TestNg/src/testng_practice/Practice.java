package testng_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




@Listeners(utility.listner.class)
public class Practice {
     static WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	   driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void Test_1() {
	String urlofpage=	driver.getCurrentUrl();
	SoftAssert sfass= new SoftAssert();
	sfass.assertEquals(urlofpage, "https://www.amazon.");
	System.out.println("next line of code");
	sfass.assertAll();
	}
	
	
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}

}
