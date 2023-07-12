package org.bas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass{
	public LoginPOJO() {
		PageFactory.initElements(driver, this);
		
	}
	
    @FindBy(id = "email")
	private WebElement email;
	@FindBy(name = "pass")
	private WebElement password;
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginbtn;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
}
