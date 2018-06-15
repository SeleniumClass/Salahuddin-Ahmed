package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageFactory {
	
/**
* @author Salahuddin Ahmed
*
*/

//Login function Xpath below
	//For annotation use the following syntax - suggested by Java
	//For encapsulation change default (WebElement signInbtn;) by adding the word 'private' in front of (WebElement signInbtn;) as shown below
	
	@FindBy(how = How.XPATH, using = "//*[@contains(text(), 'My Account')]")
	//CacheLookup. Can be used to make script faster but may encounter issues. If so just comment out 
	private WebElement myAccount;

	@FindBy(how = How.XPATH, using = "//*[@name='email_address']")
	private WebElement emailAddress;

	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "(//*[@class='ui-button-text'])[5]")
	private WebElement loginButton;

//All the getter method below
	public WebElement getMyaccount() {
		return myAccount;
	}

	public WebElement getEmailaddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginButton;
	}

		
}


	

	
	


