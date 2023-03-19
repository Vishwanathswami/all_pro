package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@name='username']") private WebElement username;
	@FindBy(xpath = "//*[@name='password']") private WebElement password;
	@FindBy(xpath = "//*[@type='submit']") private WebElement button;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Addusername(String usern) {
		username.clear();
		username.sendKeys("Admin");
		
	}
	public void AddPass(String pass) {
		password.sendKeys("admin123");
	}
public void loginbutton() {
	button.click();
}
}
