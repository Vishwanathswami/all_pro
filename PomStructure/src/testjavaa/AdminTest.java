package testjavaa;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminTest extends BaseTestt {
	@BeforeClass
	public void log() {
		lgnpg.loginmethod();
	}
	
	

}
