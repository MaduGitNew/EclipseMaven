package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.store.SaxonXBeansDelegate.QueryInterface;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	//browsers
	public static  void browserLaunch(String browser) {
		String browser1="chrome";
		switch(browser1) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		default:
			System.out.println("Enter correct browser name");
		}
	}
//		if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		} 
//		else if(browser.equalsIgnoreCase("firefox")){
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge")){
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//		else {
//			System.out.println("Enter correct browser");
//		}
	//}
	
	//launch url
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	//maximize window
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	//manage-set size
	public static void setSize(int height,int width) {
		Dimension d=new Dimension(height,width);
		driver.manage().window().setSize(d);
	}	
	
	//manage-set position
	public static void setPosition(int x,int y) {
		Point p=new Point(x,y);
		driver.manage().window().setPosition(p);
	}
	
	//locators
	public static WebElement findElement(String locator,String value) {
		WebElement element=null;
		if(locator.equalsIgnoreCase("id")){
			element=driver.findElement(By.id(value));
		}
		
		else if(locator.equalsIgnoreCase("name")){
			element=driver.findElement(By.name(value));
		}

		else if(locator.equalsIgnoreCase("name")){
			element=driver.findElement(By.name(value));
		}

		else if(locator.equalsIgnoreCase("classname")){
			element=driver.findElement(By.className(value));
		}

		else if(locator.equalsIgnoreCase("tagname")){
			element=driver.findElement(By.tagName(value));
		}

		else if(locator.equalsIgnoreCase("linktext")){
			element=driver.findElement(By.linkText(value));
		}

		else if(locator.equalsIgnoreCase("partiallinktext")){
			element=driver.findElement(By.partialLinkText(value));
		}

		else if(locator.equalsIgnoreCase("xpath")){
			element=driver.findElement(By.xpath(value));
		}

		else if(locator.equalsIgnoreCase("cssselector")){
			element=driver.findElement(By.cssSelector(value));
		}

		else {
			System.out.println("Enter correct locator");
		}
		
		return element;
			
	}
	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	//alert
	public static void alert(String text) {
		Alert a=driver.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys(text);
	}
	
	//navigation commands
	public static void navigation(String url) {
		driver.navigate().to(url);
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}
	
	//actions
	public static void actions(WebElement element,WebElement src,WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		a.dragAndDrop(src, target).perform();
		a.doubleClick().perform();
		a.contextClick().perform();
	}
	
	//robot
	public static void robot(int press,int release) throws AWTException {
		Robot r=new Robot();
		r.keyPress(press);
		r.keyRelease(release);
	}
	
	//frames
	public static void frames(String id,String name,WebElement e,int index) {
		driver.switchTo().frame(index);
		driver.switchTo().frame(e);
		driver.switchTo().frame(id);
		driver.switchTo().frame(name);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	
	//windows handling
	public static void windows(String url,String title,String id) {
		driver.switchTo().window(url);
		driver.switchTo().window(title);
		driver.switchTo().window(id);
		driver.getWindowHandle();
		driver.getWindowHandles();
	}
	
	//javascriptexecutor
	public static void jscript(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','data')",e);
		js.executeScript("arguments[0].click()",e);
		js.executeScript("arguments[0].getAttribute('value')",e);
		js.executeScript("arguments[0].scrollIntoView(true)",e);
		js.executeScript("arguments[0].scrollIntoView(false)",e);
	}
	
	//screenshot
	public static void ss() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\HP\\Desktop\\Trinethra java\\ss.png");
		FileUtils.copyFile(src, target);
	}
	
	//implicit wait
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	//webtable
	public static void webtable(List<WebElement> data) {
		for (int i = 0; i < data.size(); i++) {
			WebElement element = data.get(i);
			String text = element.getText();
			System.out.println(text+"\n");
		
		}
	}
	
	//getTitle
	public static String title() {
		return driver.getTitle();
	}
	
	//dropdown
	public static void dropDown(WebElement value,String location,String text) {
		Select select=new Select(value);
		select.selectByVisibleText(text);
	}
	
	//quit
	public static void closeWindow() {
		driver.quit();
	}
}
