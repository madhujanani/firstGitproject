package org.program;

import org.baseclass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAsserts extends BaseClass {
	@BeforeClass
	private void BrowserLaunch() {
			browserConfig();
			
	}
	@AfterClass
	private void BrowserClose() {
		closeBrowser();	
		}
	@BeforeMethod
	private void startTime() {
		dateAndTime();
		}
	@AfterMethod
	private void endTime() {
		dateAndTime();
		}
	//dataprovider
	@Test(dataProvider="loginData",dataProviderClass=DataProviderAno.class)
	private void tcDataProvider(String name,String pass) throws InterruptedException {
		//soft Assert-(with AssertAll)
		System.out.println("test2");
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
		
	}
	
	
	
	
	
//	
//	
//	//parameter
//	
//	@Test
//	@Parameters({"UserName","Password"})
//	private void tc1(String name,String pass) throws InterruptedException {
//		//hard Assert
//		Assert.assertTrue(false);
//		System.out.println("test1");
//		System.out.println("test1 -tc");
//		passUrl("https://www.facebook.com/");
//		Pom p = new Pom();
//		enterValue(p.getTxtUser(),name);
//		enterValue(p.getTxtPass(),pass);
//		clkbtn(p.getBtnLgn());
//		Thread.sleep(2000);
//	}
//	
//	@Parameters({"user","pass"})
//	@Test
//	private void tc2(String name,String pass) throws InterruptedException {
//		//soft Assert-(with AssertAll)
//		System.out.println("test2");
//		SoftAssert s = new SoftAssert();
//		s.assertTrue(false);
//		passUrl("https://www.facebook.com/");
//		Pom p = new Pom();
//		enterValue(p.getTxtUser(),name);
//		enterValue(p.getTxtPass(),pass);
//		clkbtn(p.getBtnLgn());
//		Thread.sleep(2000);
//		s.assertAll();
//	}
//	@Test
//	@Parameters({"user1","pass1"})
//	private void tc3(String name,String pass) throws InterruptedException {
//		//soft Assert-(without AssertAll)
//		System.out.println("test3");
//		SoftAssert s = new SoftAssert();
//		s.assertTrue(false);
//		passUrl("https://www.facebook.com/");
//		Pom p = new Pom();
//		enterValue(p.getTxtUser(),name);
//		enterValue(p.getTxtPass(),pass);
//		clkbtn(p.getBtnLgn());
//		Thread.sleep(2000);
//	}
//	@Test
//	@Parameters({"UserName","Password"})
//	private void tc4(String name,String pass) throws InterruptedException {
//		//normal test case
//		System.out.println("test4");
//		driver.get("https://www.facebook.com/");
//		Pom p = new Pom();
//		enterValue(p.getTxtUser(),name);
//		enterValue(p.getTxtPass(),pass);
//		clkbtn(p.getBtnLgn());
//		Thread.sleep(2000);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
