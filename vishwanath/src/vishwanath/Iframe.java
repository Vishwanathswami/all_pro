package vishwanath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Iframe {
	static WebDriver driver;
	public void scshot() throws IOException {
	TakesScreenshot	 shital=(TakesScreenshot)driver;
	File ss=shital.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\dbdbdb\\vish.png");
	FileHandler.copy(ss, destination);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(element);
		Thread.sleep(2000);
	WebElement slider=	driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
Actions ab = new Actions(driver);
ab.clickAndHold(slider).build().perform();
Thread.sleep(2000);
ab.moveToElement(slider, 300, 0).release().build().perform();
Thread.sleep(5000);

driver.switchTo().parentFrame();
Thread.sleep(5000);
driver.findElement(By.xpath("//a[text()='Demos']")).click();

Iframe xyz = new Iframe();
xyz.scshot();

	}

}
