package org.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchSample {
public static void main(String[] args) {
	//set the property of a browser
	WebDriverManager.chromedriver().setup();
	
	//initialization
	WebDriver driver=new ChromeDriver();
	
	//get the url
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
}
}
