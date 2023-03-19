package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
//All the locators of page
	@FindBy(xpath = "//*[@name='username']")
	WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	WebElement password;

	@FindBy(xpath = "//*[text()=' Login ']")
	WebElement btnlogin;

	@FindBy(xpath = "//h5[text()='Login']")
	WebElement txtloginpage;

//Intilization of locators/variables
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// methods required to perform test step
	public void loginMethod() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnlogin.click();

	}

	public String titleoflogin() {
		return txtloginpage.getText();

	}
	public String Currenturl() {
		return driver.getCurrentUrl();
	}

}
