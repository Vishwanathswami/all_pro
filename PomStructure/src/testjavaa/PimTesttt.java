package testjavaa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PimTesttt extends BaseTestt {
	@BeforeClass
	public void log() {
		lgnpg.loginmethod();
	}
	
	@Test(priority = 3)
	public void veripg() {
		AssertJUnit.assertEquals(pmpg.titleofpg(), "PIM");
	}
	@Test(priority = 4)
	public void verifybox() {
		pmpg.selectbox();
		AssertJUnit.assertEquals(pmpg.boxisselected(), true);
	}
	
@Test(priority = 5)
	public void clickable() {
		pmpg.adminclickable();
		AssertJUnit.assertEquals(admin.adminverify(), "Admin");
	}

}
