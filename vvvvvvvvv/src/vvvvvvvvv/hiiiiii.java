package vvvvvvvvv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(utility.Listener.class)
public class hiiiiii {
	static WebDriver driver;
	@BeforeTest(groups = "browser Launch")
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1,groups = "smoke")
	public void verifyurlofPage() {
	String url=	driver.getCurrentUrl();
		SoftAssert softassert= new SoftAssert();
		Assert.assertEquals(url, "https://www.flipkart.com/","verifyurl");
		System.out.println("next line after softassert");
		softassert.assertAll();
	}
	
	@Test(priority = 2,groups = "smoke")
	public void verifyTitleOfPage() {
		String pgetxt= driver.findElement(By.xpath("//*[@class='_36KMOx']")).getText();
		SoftAssert softassert=new SoftAssert();
		Assert.assertEquals(pgetxt, "Login","verify title");
		softassert.assertAll();
	}
	
	@Test(priority = 3,groups = "regression")
	public void verifyUpperIconsGrocery() {
		driver.findElement(By.xpath("//*[text()='✕']")).click();
	String icontxt=	driver.findElement(By.xpath("//*[text()='Grocery']")).getText();
	Assert.assertEquals(icontxt, "Grocery","icon is present");
	}
	
	@Test(priority = 4,groups = "regression")
	public void verifyUpperIconsTopOffers() {
	String icontxt=	driver.findElement(By.xpath("//div[text()='Top Offers']")).getText();
	Assert.assertEquals(icontxt, "Top Offers","icon is present");
	
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
