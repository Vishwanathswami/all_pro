package mainjavaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testjavaa.BaseTestt;

public class LoginPg extends BaseTestt {
	
//locators of all page
	@FindBy(xpath = "//*[@name='username']")
	WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	WebElement pass;

	@FindBy(xpath = "//*[text()=' Login ']")
	WebElement btnlogin;
	
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement title;
	
//initilization of locators and variables
	
	public LoginPg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
// methods req to page
	public void loginmethod() {
		username.sendKeys("Admin");
		pass.sendKeys("admin123");
		btnlogin.click();
	}
	
	public String curnturl() {
		return driver.getCurrentUrl();
	}
	
	public String titleofpage() {
	return	title.getText();
		
	}
}
