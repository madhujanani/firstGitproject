package org.program;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestSuite extends BaseClass {
	
	@BeforeClass
	public static void browserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void EndTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void tc11() throws IOException, InterruptedException {
		passUrl("https://www.facebook.com/");
	   // String currentUrl = driver.getCurrentUrl();
//		Assert.assertTrue("check url",currentUrl.endsWith("https"));
		WebElement txtUsr = driver.findElement(By.id("email"));
		enterValue(txtUsr,execlLoc(0,0));
		WebElement txtPass = driver.findElement(By.id("pass"));
		enterValue(txtPass,execlLoc(1,0));
		WebElement btnClk = driver.findElement(By.name("login"));
		clkbtn(btnClk);
		Thread.sleep(2000);
	
	}
	@SuppressWarnings("deprecation")
	@Test
	public void tc12() throws IOException, InterruptedException {
		passUrl("https://www.facebook.com/");
	String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("check url",currentUrl.endsWith("https"));
		WebElement txtUsr = driver.findElement(By.id("email"));
		enterValue(txtUsr,execlLoc(0,0));
		WebElement txtPass = driver.findElement(By.id("pass"));
		enterValue(txtPass,execlLoc(1,0));
		WebElement btnClk = driver.findElement(By.name("login"));
		clkbtn(btnClk);
		Thread.sleep(2000);
	
	}

}
