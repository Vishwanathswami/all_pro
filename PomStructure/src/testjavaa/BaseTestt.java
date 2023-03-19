package testjavaa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjavaa.AdminPage;
import mainjavaa.LoginPg;
import mainjavaa.Pimmpg;

public class BaseTestt {
	public static WebDriver driver;
	protected LoginPg lgnpg;
	protected	Pimmpg pmpg;
	protected	AdminPage admin;

	
@BeforeClass
public void brwsrlaunch() {
	WebDriverManager.chromedriver().setup();
driver	= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().getPageLoadTimeout();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@BeforeClass
public void pageobject() {
lgnpg	= new LoginPg(driver);
pmpg=new Pimmpg(driver);
admin= new AdminPage(driver);
}

@AfterClass
public void teardownall() {
	driver.quit();
}
}
