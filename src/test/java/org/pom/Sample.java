package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample extends BaseClass{
	PageObjectModel element;
	
	@BeforeClass
	private void urlLaunch() {
		browserLaunch("chrome");
		maximize();
		launchUrl("https://adactinhotelapp.com/");
		element=new PageObjectModel();
	}
	@Test(priority=1)
	private void loginPage() {
		WebElement username = element.getUsername();
		username.sendKeys("Madusakthi");
		
		WebElement pwd = element.getPwd();
		pwd.sendKeys("123456");
		
		WebElement login = element.getLogin();
		login.click();
		
		String title = title();
		Assert.assertEquals(title, "Adactin.com - Search Hotel");
		System.out.println(title);
	}
	
	@Test(priority=2)
	private void bookHotel() {
		WebElement location = element.getLocation();
		dropDown(location, "text", "London");
		
		WebElement hotels = element.getHotels();
		dropDown(hotels, "text", "Hotel Sunshine");
		
		WebElement roomType = element.getRoomType();
		dropDown(roomType, "text", "Standard");
		
		WebElement room = element.getRoom();
		dropDown(room, "text", "3 - Three");
		
		WebElement checkin = element.getCheckin();
		checkin.sendKeys("18/07/2023");
		
		WebElement checkout = element.getCheckout();
		checkout.sendKeys("19/07/2023");
		
		WebElement adultroom = element.getAdultroom();
		dropDown(adultroom, "text", "4 - Four");
		
		WebElement childroom = element.getChildroom();
		dropDown(childroom, "text", "4 - Four");
		
		WebElement submit = element.getSubmit();
		submit.click();
	}
	
}
