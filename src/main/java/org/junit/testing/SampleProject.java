package org.junit.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleProject {
	
	@Test
	public void tc1() {
		System.out.println("case 1");
	}
	
	@Test
	public void tc6() {
		System.out.println("case 6");
	}
	
	@BeforeClass
	public static void LaunchTheBrowser() {
		System.out.println("Browser Launch.");
	}
	
	@Before
	public void StartDate() {
		System.out.println("Start Date & time");
	}
	
	@Test
	public void tc2() {
		System.out.println("case 2");
	}
	
	@AfterClass
	public static void CloseTheBrowser() {
		System.out.println("Browser Closed.");
	}
	
	@After
	public void EndDate() {
		System.out.println("End Date & time");
	}
	
	@Ignore
	@Test
	public void tc3() {
		System.out.println("case 3");
	}
	
	@Test
	public void tc5() {
		System.out.println("case 5");
	}
	
	@Test
	public void tc4() {
		System.out.println("case 4");
	}

}
