package mainjavaa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testjavaa.BaseTestt;

public class Pimmpg extends BaseTestt {
	
	@FindBy(xpath = "//h6[text()='PIM']")
	WebElement title;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkinput;
	
	@FindBy(xpath = "//i[contains(@class,'oxd-icon bi-check oxd-checkbox-input-icon')]")
List<WebElement> checkall;
	
	@FindBy(xpath = "//*[text()='Admin']")
	WebElement admin;
	
	
	public Pimmpg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String titleofpg() {
		return title. getText();
	}
	
	public void selectbox() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        checkall.get(5).click();
	}
	
	public boolean boxisselected() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return	checkinput.get(5).isSelected();
	}
	
	public void adminclickable() {
		admin.click();
	}

}
