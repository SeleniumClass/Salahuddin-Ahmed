package com.gcritpagepactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class gcritPageFactory {
/**
 * @author SA
 *
 */
	
//All the xpath below
	@FindBy(how = How.XPATH, using = "//*[@contains(text(), 'My Account')]")
	//CacheLookup. Can be used to make script faster but may encounter issues. If so just comment out 
	private WebElement myAccount;
	
	@FindBy(how = How.XPATH, using = "//*[@name='email_address']")
	private WebElement emailAddress;
	
	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='ui-button-text'])[5]")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "(//*[starts-with(test(), 'Catalog')]")
	private WebElement catalog;
	
	@FindBy(how = How.XPATH, using = "(//*[starts-with(test(), 'new products')]")
	private WebElement newProducts;
	
//All the getter methods are below
	public WebElement getMyAccount() {
		return myAccount;
	}
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getCatalog() {
		return catalog;
	}
	
	public WebElement getNewProducts() {
		return newProducts;
	}

}
