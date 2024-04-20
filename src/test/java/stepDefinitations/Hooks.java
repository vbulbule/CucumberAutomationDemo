package stepDefinitations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void before() {
		
		System.out.println("------------before-----------------");
		System.out.println("Opening the Chrome Browser");
		System.out.println("------------before end-----------------");
	}
	
	@Before("@insurance")
	public void beforeForInsurance() {
		System.out.println("------------before insurance-----------------");
		System.out.println("Setting data for Insurance test case");
		System.out.println("------------before end insurance -----------------");
	}
	
	
	@Before("@carloan")
	public void beforeForcarloan() {
		System.out.println("------------before carloan-----------------");
		System.out.println("Setting data for carloan test case");
		System.out.println("------------before end carloan -----------------");
	}
	
	@After("@insurance")
	public void afterInsurance() {
		System.out.println("------------after insurance-----------------");
		System.out.println("clean the insurance databse");
		System.out.println("-----------------------------------");
	}
	
	@After("@carloan")
	public void aftercarloan() {
		System.out.println("------------after carloan-----------------");
		System.out.println("clean the carloan databse");
		System.out.println("-----------------------------------");
	}
	
	@After
	public void after() {
		System.out.println("------------after-----------------");
		System.out.println(" close the browser");
		System.out.println("-----------------------------------");
	}

}
