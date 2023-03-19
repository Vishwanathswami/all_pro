package testjavaa;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import mainjavaa.LoginPg;

public class LoginTestttt extends BaseTestt {
	
	@Test(priority = 0)
	public void verifyurl() {
		AssertJUnit.assertEquals(lgnpg.curnturl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 1)
	public void display() {
		lgnpg.titleofpage();
		AssertJUnit.assertEquals(lgnpg.titleofpage(), "Login");
	}
	
	@Test(priority = 2)
	public void verifylogin() {
		lgnpg.loginmethod();
		AssertJUnit.assertEquals(pmpg.titleofpg(), "PIM");
	}
	
	

}
