package vishwanath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe.");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@name='sex']//parent::span//input")).click();
	
}
}
