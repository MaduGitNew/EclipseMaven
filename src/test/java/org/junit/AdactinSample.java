package org.junit;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinSample extends BaseClass{
	static AdactinPom element;
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch("chrome");
		maximize();
		System.out.println("1)Browser launched successfully");
		element=new AdactinPom();
	}
	
	@Before
	public void urlLaunch() {
		launchUrl("http://adactinhotelapp.com/");
		System.out.println("2)URL launched successfully");
	}
	
	@Test
	public void login() {
		WebElement username = element.getUsername();
		username.sendKeys("Madusakthi");
		
		WebElement pwd = element.getPwd();
		pwd.sendKeys("123456");
		
		WebElement login = element.getLogin();
		login.click();
		
		WebElement location = element.getLocation();
		dropDown(location, "text", "London");
		
		WebElement hotels = element.getHotels();
		dropDown(hotels, "text", "Hotel Sunshine");
		
		WebElement roomType = element.getRoomType();
		dropDown(roomType, "text", "Standard");
		
		WebElement room = element.getRoom();
		dropDown(room, "text", "3 - Three");
		
		WebElement checkin = element.getCheckin();
		checkin.sendKeys("23/07/2023");
		
		WebElement checkout = element.getCheckout();
		checkout.sendKeys("24/07/2023");
		
		WebElement adultroom = element.getAdultroom();
		dropDown(adultroom, "text", "4 - Four");
		
		WebElement childroom = element.getChildroom();
		dropDown(childroom, "text", "4 - Four");
		
		WebElement submit = element.getSubmit();
		submit.click();
		
		WebElement radiobutton = element.getRadiobutton();
		radiobutton.click();
		
		WebElement continuebtn = element.getContinuebtn();
		continuebtn.click();
		
		WebElement fname = element.getFname();
		fname.sendKeys("Anikaa");
		
		WebElement lname = element.getLname();
		lname.sendKeys("Gowtham");
		
		WebElement address = element.getAddress();
		address.sendKeys("Chennai");
		
		WebElement cardno = element.getCardno();
		cardno.sendKeys("1234567890123456");
		
		WebElement cardtype = element.getCardtype();
		dropDown(cardtype, "text", "Master Card");
		
		WebElement expmonth = element.getExpmonth();
		dropDown(expmonth, "text", "September");
		
		WebElement expyear = element.getExpyear();
		dropDown(expyear, "text", "2027");
		
		WebElement cvvnumber = element.getCvvnumber();
		cvvnumber.sendKeys("123456");
		
		WebElement booknow = element.getBooknow();
		booknow.click();
		
		System.out.println("Hotel booked");
//		
//		WebElement orderno = element.getOrderno();
//		String attribute = orderno.getAttribute("name");
//		System.out.println("Order number: "+attribute);
//		
		System.out.println("3) Fields are filled successfully");
	}
	
	@After
	public void readTitle(){
		String title = title();
		System.out.println("Page title: "+title);
		System.out.println("4) Got the title successfully");
	}
	
	@AfterClass
	public static void quitUrl() throws InterruptedException {
		Thread.sleep(3000);
		closeWindow();
		System.out.println("5)Url closed successfully");
	}
		
}
