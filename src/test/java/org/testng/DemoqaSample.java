package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoqaSample extends BaseClass{	
	static DemoqaPom element;
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch("chrome");
		maximize();
		System.out.println("1)Browser launched successfully");
		element=new DemoqaPom();
	}
	
	@BeforeMethod
	public void urlLaunch() {
		launchUrl("https://demoqa.com/register");
		System.out.println("2)URL launched successfully");
	}
	
	@Test
	public void login() {
		WebElement fname = element.getFname();
		fname.sendKeys("Madu");
		Assert.assertEquals("Madu", fname.getAttribute("value"));
		
		WebElement lname = element.getLname();
		lname.sendKeys("Sakthi");
		Assert.assertEquals("Sakthi", lname.getAttribute("value"));
		
		WebElement username = element.getUsername();
		username.sendKeys("Madumitha");
		Assert.assertEquals("Madumitha", username.getAttribute("value"));
		
		WebElement pwd = element.getPwd();
		pwd.sendKeys("12345");
		Assert.assertEquals("12345", pwd.getAttribute("value"));
		
		System.out.println("3) Text fields are filled successfully");
	}
	
	@AfterMethod
	public void readTitle(){
		String title = title();
		System.out.println("Page title: "+title);
		System.out.println("4) Got the title successfully");
	}
	
	@AfterClass
	public static void quitUrl() {
		closeWindow();
		System.out.println("5)Url closed successfully");
	}
		
}
