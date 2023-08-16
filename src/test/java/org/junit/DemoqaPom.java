package org.junit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPom extends BaseClass{
	public DemoqaPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstname")
	private WebElement fname;
	
	@FindBy(id="lastname")
	private WebElement lname;
	
	@FindBy(id="userName")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

}
