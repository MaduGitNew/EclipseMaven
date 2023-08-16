package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends BaseClass{
	public PageObjectModel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement room;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	
	public WebElement getRoomType() {
		return roomType;
	}
	
	public WebElement getRoom() {
		return room;
	}
	
	public WebElement getCheckin() {
		return checkin;
	}
	
	public WebElement getCheckout() {
		return checkout;
	}
	
	public WebElement getAdultroom() {
		return adultroom;
	}
	
	public WebElement getChildroom() {
		return childroom;
	}
	
	public WebElement getSubmit() {
		return submit;
	}
}
