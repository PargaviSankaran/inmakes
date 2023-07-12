package org.bas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPOJO extends BaseClass{
	
	public AmazonPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_email")
	private WebElement mail;
	@FindBy(name = "password")
	private WebElement pass;
	@FindBy(id = "signInSubmit")
	private WebElement signin;
	
	
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSignin() {
		return signin;
	}

}
