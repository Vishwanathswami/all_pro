package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority = 2)
	public void verifylogin() {
		loginpage.loginMethod();
Assert.assertEquals(pimpage.titleofpage(), "PIM");
}
	@Test(priority = 1)
	public void verifyloginpageisDisplayed() {
		loginpage.titleoflogin();
		Assert.assertEquals(loginpage.titleoflogin(), "Login");
	}
	@Test(priority = 0)
	public void verifyurlofpage() {
Assert.assertEquals(loginpage.Currenturl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
