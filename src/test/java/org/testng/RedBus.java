package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBus extends BaseClass{
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch("chrome");
		maximize();
		System.out.println("1)Browser launched successfully");
	}
	
	@BeforeMethod
	public void urlLaunch() {
		launchUrl("https://www.redbus.in/");
		System.out.println("2)URL launched successfully");
	}
	
	@Test
	public void login() throws InterruptedException {
		WebElement source = findElement("id", "src");
		source.sendKeys("Chennai");
		Assert.assertEquals("Chennai", source.getAttribute("value"));
		System.out.println("3.1) Source field entered successfully");
				
		WebElement destination = findElement("id", "dest");
		destination.sendKeys("Trichy");
		Assert.assertEquals("Trichy", destination.getAttribute("value"));		
		System.out.println("3.2) Destination field entered successfully");
	}
	
	@AfterMethod
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



