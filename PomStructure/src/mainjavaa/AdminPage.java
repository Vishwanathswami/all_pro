package mainjavaa;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testjavaa.BaseTestt;

public class AdminPage extends BaseTestt {
	
//locators of page
	@FindBy(xpath = "//h6[text()='Admin']")
	WebElement admintitle;
	
	@FindBy(xpath = "//*[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement usernme;
	
	@FindBy(xpath = "//*[@type='checkbox'] ")
	List<WebElement> checkbox;
	
	
//initilization of locators and variables
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
// methods req to test
	
	public String adminverify() {
	return	admintitle.getText();
		
	}
	
	public void checkboxclick() {
		for(WebElement box:checkbox)
			box.click();
	}

}
