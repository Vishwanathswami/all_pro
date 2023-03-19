package testng_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoTationSequence {
	@BeforeSuite
	public void m_1() {
		System.out.println("m1"); 
		
	}
	@BeforeTest
	public void m_2() {
		System.out.println("m2");
		
	}
	@BeforeClass
	public void m_3() {
		System.out.println("m3");
		
	}
	@BeforeMethod
	public void m_4() {
		System.out.println("m4");
		
	}
	@Test
	public void m_0() {
		System.out.println("000");
		
	}
	@AfterMethod
	public void m_6() {
		System.out.println("m6");
		
	}
	@AfterClass
	public void m_7() {
		System.out.println("m7");
		
	}
	@AfterTest
	public void m_8() {
		System.out.println("m8");
		
	}
	@AfterSuite
	public void m_9() {
		System.out.println("m9");
		
	}
	

}
