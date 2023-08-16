package org.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngSample {
	public WebDriver driver;
	@BeforeClass
	private void tc01() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("1) Browser initialized");
	}
	@AfterClass
	private void tc03() {
		driver.quit();
		System.out.println("5) Browser closed");
	}
	@Test
	private void tc05() {
		driver.findElement(By.id("email")).sendKeys("Madu");
		driver.findElement(By.id("pass")).sendKeys("Madu");
		System.out.println("3) Credentials entered");
	}
	@BeforeMethod
	private void tc02() {
		driver.get("https://www.facebook.com/");
		System.out.println("2) Browser launched");
	}
	@AfterMethod
	private void tc04() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\HP\\Desktop\\Trinethra java\\testngss1.jpeg");
		FileUtils.copyFile(src, target);
		System.out.println("4) Screenshot taken");
	}
	
}
