package org.junit;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBook extends BaseClass{
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		browserLaunch("chrome");
		maximize();
		System.out.println("1)Browser launched successfully");
	}
	
	@Before
	public void urlLaunch() {
		launchUrl("https://www.facebook.com/");
		System.out.println("2)URL launched successfully");
	}
	
	@Test
	public void login() {
		WebElement username = findElement("id", "email");
		username.sendKeys("Madu");
		Assert.assertEquals("Madu", username.getAttribute("value"));
		
		WebElement pwd = findElement("id", "pass");
		pwd.sendKeys("Madu");
		Assert.assertEquals("Madu", pwd.getAttribute("value"));
		
		System.out.println("3) Text fields are filled successfully");
	}
	
	@After
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
