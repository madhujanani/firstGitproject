package org.program;

import org.apache.poi.xssf.model.CalculationChain;
import org.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution extends BaseClass{
	//parallel Execution( method level ////class level)----inreal time we wont work on this ,,and we wont get o/p for this 
	//real time we use only parallel Execution at test level 
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
	
	@Test
	@Parameters({"UserName","Password"})
	private void tc1(String name,String pass) throws InterruptedException {
		System.out.println("test1 :"+Thread.currentThread().getId());
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	
	@Test
	@Parameters({"UserName","Password"})
	private void tc4(String name,String pass) throws InterruptedException {
		System.out.println("test4 :"+Thread.currentThread().getId());
		driver.get("https://www.facebook.com/");
		implicitWait();
		windowMax();
		crntUrl();
		Pom p =new Pom ();
		
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);

	}
	@Parameters({"user","pass"})
	@Test
	private void tc2(String name,String pass) throws InterruptedException {
		System.out.println("test2:" +Thread.currentThread().getId());
		passUrl("https://www.facebook.com/");
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	@Test
	@Parameters({"user1","pass1"})
	private void tc3(String name,String pass) throws InterruptedException {
		System.out.println("test3:"+Thread.currentThread().getId());
		passUrl("https://www.facebook.com/");
		implicitWait();
		Pom p = new Pom();
		enterValue(p.getTxtUser(),name);
		enterValue(p.getTxtPass(),pass);
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
