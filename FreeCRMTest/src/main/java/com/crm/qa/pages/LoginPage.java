package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Object Repository
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement login_btn;
	
	@FindBy(xpath = "//a[contains(text(),\"Sign Up\")]")
	WebElement sign_up;
	
	@FindBy(xpath = "//div[@class=\"navbar-header\"]//img[@class=\"img-responsive\"]")
	WebElement crm_logo;
	
    //Initialize Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo() {
		return crm_logo.isDisplayed();
	}
	
	public HomePage login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		login_btn.click();
		
		return new HomePage();
	}
	
 
}
