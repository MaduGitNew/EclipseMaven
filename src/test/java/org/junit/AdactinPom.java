package org.junit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom extends BaseClass{
	
	public AdactinPom() {
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
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(id="first_name")
	private WebElement fname;
	

	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardno;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	@FindBy(xpath="//input[@value='42U89BPI93']")
	private WebElement ordertext;

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
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}	
	
	public WebElement getOrderno() {
		return orderno;
	}
	
	public WebElement getOrdertext() {
		return ordertext;
	}

}
