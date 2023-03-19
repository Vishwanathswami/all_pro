package vishwanath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(2000);
WebElement day =driver.findElement(By.xpath("//*[@id='day']"));
WebElement month =driver.findElement(By.xpath("//*[@id='month']"));
List<WebElement> years =driver.findElements(By.xpath("//*[@id='year']//option"));
for(WebElement year:years) {
	if(year.getText().equals("1996"))
		year.click();
}
	

Select selday=new Select(day);
selday.selectByIndex(7);
Thread.sleep(1000);
Select selmonnth=new Select(month);
selmonnth.selectByValue("12");
Thread.sleep(1000);



	}

}
