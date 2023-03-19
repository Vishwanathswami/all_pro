package testng_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2Class {
	@Test(groups =  {"smoke"})
	public void m1() {
		System.out.println("1");
	}
	
	@Test(groups= {"regression"})
	public void m2() {
		System.out.println("2");
	}
	@Test(groups =  {"smoke"})
	public void m3() {
		System.out.println("3");
	}
	@Test(groups= {"unit"})
	public void m4() {
		System.out.println("4");
	}
	@Test(groups =  {"smoke"})
	public void m5() {
		System.out.println("5");
	}
	@Test(groups= {"regression"})
	public void m6() {
		System.out.println("6");
	}

}
