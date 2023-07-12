package org.junit.testing;

import java.sql.Date;

import org.bas.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitProjectBrowser extends BaseClass{
	
	@Test
	public void tc1() {
		System.out.println("case 1");
		launchUrl("https://mail.google.com/mail/");
	}
	
	@BeforeClass
	public static void LaunchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@Before
	public void StartDate() {
		System.out.println("Start Date & time");
	}
	
	@Test
	public void tc2() {
		System.out.println("case 2");
		launchUrl("https://www.facebook.com/");
	}
	
	@AfterClass
	public static void CloseTheBrowser() {
		closeEntireBrowser();
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
		launchUrl("https://www.youtube.com/");
	}
	
	@Test
	public void tc4() {
		System.out.println("case 4");
		launchUrl("https://inmakes.com/");
	}

}
