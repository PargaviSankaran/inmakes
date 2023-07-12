package org.junit.testing;

import org.bas.BaseClass;
import org.bas.LoginPOJO;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssertProject extends BaseClass {
	
	@Test
	public void tc1() {
		System.out.println("Test case 1");
	}
	@BeforeClass
	public static void launchTheBrowser() {
	launchBrowser();
	windowMaximize();
	}
	
	@Test
	public void tc5() throws InterruptedException {
		System.out.println("Test case 5");
		launchUrl("https://en-gb.facebook.com/");
		String title = pageTitle();
		String Url = pageUrl();
		LoginPOJO f = new LoginPOJO();
		passText("Paruu@gmail.com", f.getEmail());
		Assert.assertTrue("Check page title", title.contains("Facebook"));
		Assert.assertEquals("Check ur Url", Url, Url.contains("en-gb.facebook.com"));
		passText("Sharmi", f.getPassword());
	}
	@AfterClass
	public static void CloseTheBrowser() {
		closeEntireBrowser();
	}
	@Test
	public void tc3() {
		System.out.println("Test case 3");
	}
	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}
	@Test
	public void tc4() {
		System.out.println("Test case 4");
	}

}