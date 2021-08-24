package org.program;

import org.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteClassTestNG extends BaseClass {
	@BeforeClass(alwaysRun=true)
	private void BrowserLaunch() {
			browserConfig();
			
	}
	@AfterClass(alwaysRun=true)
	private void BrowserClose() {
		closeBrowser();	
		}
	@BeforeMethod(alwaysRun=true)
	private void startTime() {
		dateAndTime();
		}
	@AfterMethod(alwaysRun=true)
	private void endTime() {
		dateAndTime();
		}
	@Test(groups="smoke")
	@Parameters({"UserName","Password"})
	private void tc1(String name,String pass) throws InterruptedException {
		System.out.println("test1");
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	@Test(groups="sanity")
	@Parameters({"UserName","Password"})
	private void tc8(String name,String pass) throws InterruptedException {
		System.out.println("test8");
		driver.get("https://www.facebook.com/");
		windowMax();
		crntUrl();
		Pom p =new Pom ();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);

	}
	@Parameters({"user","pass"})
	@Test(groups="smoke")
	private void tc2(String name,String pass) throws InterruptedException {
		System.out.println("test2");
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	@Test(groups="Regression")
	@Parameters({"user1","pass1"})
	private void tc3(String name,String pass) throws InterruptedException {
		System.out.println("test3");
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	@Test(groups= {"sanity"})
	@Parameters({"user2","pass2"})
	private void tc4(String name,String pass) throws InterruptedException {
		System.out.println("test4");
		driver.get("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	@Test(groups="Regression")
	@Parameters({"UserName","Password"})
	private void tc5(String name,String pass) throws InterruptedException {
		System.out.println("test5");
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	@Test(groups="smoke")
	@Parameters({"user1","pass1"})
	private void tc6(String name,String pass) throws InterruptedException {
		System.out.println("test6");
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	@Test(groups="Regression")
	@Parameters({"user2","pass2"})
	private void tc7(String name,String pass) throws InterruptedException {
		System.out.println("test7");
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
