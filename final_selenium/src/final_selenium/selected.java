package final_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selected {
//	https://www.facebook.com/r.php?locale=en_GB&display=page
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page\r\n"
				+ "");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	boolean chk=	driver.findElement(By.xpath("//*[@name='sex' and @value='1']")).isSelected();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='sex' and @value='1']")).click();
		Thread.sleep(2000);
	boolean chk1=	driver.findElement(By.xpath("//*[@name='sex' and @value='1']")).isSelected();
	boolean enable= driver.findElement(By.xpath("//*[@name='sex' and @value='1']")).isEnabled();
	boolean dis= driver.findElement(By.xpath("//*[@name='sex' and @value='1']")).isDisplayed();
	
String output=	driver.findElement(By.xpath("//*[@name='sex' and @value='1']")).getAttribute("class");
	System.out.println(output);
System.out.println(chk);
System.out.println(chk1);
System.out.println(enable);
System.out.println(dis);
		driver.close();
	}

}
