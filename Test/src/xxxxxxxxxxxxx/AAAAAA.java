package xxxxxxxxxxxxx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AAAAAA {
	@Test
	public void m1() {
		System.out.println("1st test");
		Assert.assertEquals(true, false);
		System.out.println("hello i am failing");
	}
	
	@Test
	public void m2() {
		System.out.println("2nd test");
		SoftAssert ass= new SoftAssert();
		SoftAssert.assertEquals(true,false);
		SoftAssert.assertAll();
	}
}
