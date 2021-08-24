package org.program;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AnnotationJunit extends BaseClass{
	
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
	@Ignore
	@AfterClass
	public static void closeBrowser() {
	driver.quit();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void tc1() throws IOException, InterruptedException {
		
		Pom p =new Pom();
		
//		passUrl("http://www.greenstechnologys.com/");
//		scrolDown(p.getOmr());
//		String address = p.getOmr().getText();
//		System.out.println(address);
//		scrolDown(p.getHeading());
//		String heading = p.getHeading().getText();
//		System.out.println(heading);
		
		
		
		
		
		
		
		
		
		//enterValue(pomr,execlLoc(1,0));
//		String currentUrl = driver.getCurrentUrl();
//			WebElement txtUsr = driver.findElement(By.id("//span[text()='Greens Technology OMR']"));
//			enterValue(txtUsr,execlLoc(0,0));
//			WebElement txtPass = driver.findElement(By.id("pass"));
//			
//			WebElement btnClk = driver.findElement(By.name("login"));
//			clkbtn(btnClk);
//			Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
	}
//		passUrl("https://www.facebook.com/");
//	String currentUrl = driver.getCurrentUrl();
//		Assert.assertTrue("check url",currentUrl.endsWith("https"));
//		WebElement txtUsr = driver.findElement(By.id("email"));
//		enterValue(txtUsr,execlLoc(0,0));
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		enterValue(txtPass,execlLoc(1,0));
//		WebElement btnClk = driver.findElement(By.name("login"));
//		clkbtn(btnClk);
//		Thread.sleep(2000);
//	
//	}
//	@SuppressWarnings("deprecation")
//	@Test
//	public void tc2() throws IOException, InterruptedException {
//		passUrl("https://www.facebook.com/");
//		crntUrl();
//		WebElement txtUsr = driver.findElement(By.id("email"));
//		enterValue(txtUsr,execlLoc(2,0));
//		Assert.assertEquals("hello", txtUsr);
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		enterValue(txtPass,execlLoc(3,0));
//		WebElement btnClk = driver.findElement(By.name("login"));
//		clkbtn(btnClk);
//		Thread.sleep(2000);
//	
//	}
//	@Test
//	@Ignore
//	public void tc3() throws IOException, InterruptedException {
//		passUrl("https://www.facebook.com/");
//		crntUrl();
//		WebElement txtUsr = driver.findElement(By.id("email"));
//		enterValue(txtUsr,execlLoc(4,0));
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		enterValue(txtPass,execlLoc(5,0));
//		WebElement btnClk = driver.findElement(By.name("login"));
//		clkbtn(btnClk);
//		Thread.sleep(2000);
//	
//	}
//	@Test
//	public void tc4() throws IOException, InterruptedException {
//		passUrl("https://www.facebook.com/");
//		crntUrl();
//		WebElement txtUsr = driver.findElement(By.id("email"));
//		enterValue(txtUsr,execlLoc(6,0));
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		enterValue(txtPass,execlLoc(7,0));
//		WebElement btnClk = driver.findElement(By.name("login"));
//		clkbtn(btnClk);
//		Thread.sleep(2000);
//	
//	}
//	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@Test
//	public void testCase() throws IOException, InterruptedException {
//		passUrl("http://adactinhotelapp.com/");
//		crntUrl();
//		Pom p = new Pom();
//		enterValue(p.getId(),execlLoc(0,0));
//		enterValue(p.getPasswd(),execlLoc(1,0));
//		clkbtn(p.getLogin());
//		
//		dropDnValue(p.getLoc(),execlLoc(2,0));
//		dropDnValue(p.getHtl(),execlLoc(2,1));
//		dropDnValue(p.getRmtype(),execlLoc(3,1));
//		dropDnValue(p.getRmNo(),execlLoc(7,1));
//		enterValue(p.getChkin(),execlLoc(5,1));
//		enterValue(p.getChkout(),execlLoc(6,1));
//		dropDnValue(p.getAdult(),execlLoc(7,1));
//		dropDnValue(p.getChild(),execlLoc(8,1));
//		clkbtn(p.getSumit());
//		clkbtn(p.getButton());
//		clkbtn(p.getCon());
//		
//		enterValue(p.getFirstnam(),execlLoc(10,0));
//		enterValue(p.getLstNam(),execlLoc(9,0));
//		
//		enterValue(p.getAddress(),execlLoc(11,1));
//		dropDnValue(p.getCc_num(),execlLoc(13,1));
//		dropDnValue(p.getCc_type(),execlLoc(14,1));
//		dropDnValue(p.getMonth(),execlLoc(16,1));
//		dropDnValue(p.getYear(),execlLoc(17,1));
//		enterValue(p.getCc_cvv(),execlLoc(18,1));
//		clkbtn(p.getBook_now());
//		String attribute = p.getOrder_no().getAttribute("value");
//		System.out.println(attribute);
//		
//		Thread.sleep(2000);
//	}




//}
