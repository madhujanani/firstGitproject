package org.program;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGSample extends BaseClass {
	@BeforeClass
	private void BrowserLaunch() {
			browserConfig();
	}
	@AfterClass
	private void BrowserClose() {
		//closeBrowser();	
		}
	@BeforeMethod
	private void startTime() {
		dateAndTime();
		}
	@AfterMethod
	private void endTime() {
		dateAndTime();
		}
	
	@Test(groups="smoke")
	private void tc1() throws InterruptedException {
		passUrl("https://www.facebook.com/");
		System.out.println("test1");
		windowMax();
		crntUrl();
		Pom p =new Pom ();
		enterValue(p.getTxtUser(),"greens");
		enterValue(p.getTxtPass(),"greens123");
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);

	} 
	@Test(groups="sanity")
	private void tc2() throws InterruptedException {
		passUrl("https://www.facebook.com/");
		System.out.println("test2");
		windowMax();
		crntUrl();
		Pom p =new Pom ();
		enterValue(p.getTxtUser(),"white");
		enterValue(p.getTxtPass(),"white123");
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);

	} 
	@Test(groups="Regression")
	private void tc3() throws InterruptedException {
		passUrl("https://www.facebook.com/");
		System.out.println("test3");
		windowMax();
		crntUrl();
		Pom p =new Pom ();
		enterValue(p.getTxtUser(),"blue");
		enterValue(p.getTxtPass(),"blue123");
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);

	} 
	@Test(groups="smoke")
	private void tc4() throws InterruptedException {
		passUrl("https://www.facebook.com/");
		System.out.println("test4");
		windowMax();
		crntUrl();
		Pom p =new Pom ();
		enterValue(p.getTxtUser(),"yellow");
		enterValue(p.getTxtPass(),"yellow123");
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);

	} @Test(groups="sanity")
	private void tc5() throws InterruptedException {
		passUrl("https://www.facebook.com/");
		windowMax();
		crntUrl();
		Pom p =new Pom ();
		enterValue(p.getTxtUser(),"red");
		enterValue(p.getTxtPass(),"red123");
		clkbtn(p.getBtnLgn());
		Thread.sleep(2000);

	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Parameters({"UserName","Pasword"})
//	@Test
//	
//	private void tc1(@Optional("madhu")String name,@Optional("8765432")String pass) throws IOException, InterruptedException {
//		
//		passUrl("https://www.flipkart.com/account/login");
//		windowMax();
//		crntUrl();
//		Pom p =new Pom ();
//		enterValue(p.getUsername(),name);
//		enterValue(p.getPassWord(),pass);
//		clkbtn(p.getBtnClk());
//		Thread.sleep(2000);
//	}
	
//	@Test(enabled=false)
//	private void tc2() throws IOException, InterruptedException {
//		passUrl("https://www.redbus.in/");
//		windowMax();
//		crntUrl();
//		Pom p =new Pom ();
//		clkbtn(p.getRedbs());
//		clkbtn(p.getSignIn());
//		Thread.sleep(2000);
//		enterValue(p.getMobtry(),execlLoc(5,1));
//		clkbtn(p.getBtnrobo());
//		clkbtn(p.getOtp());
//		Thread.sleep(2000);	
//		}
//	@Test(invocationCount=2)
//	private void tc3() {
//		System.out.println("Test 3");
//	}


//	@Test(dataProvider="loginData",dataProviderClass=DataProviderAno.class)
//	private void dataProvider(String name,String pass) {
//		passUrl("http://adactinhotelapp.com/");
//		windowMax();
//		crntUrl();
//		Pom p =new Pom ();
//		enterValue(p.getId(),name);
//		enterValue(p.getPasswd(),pass);
//		clkbtn(p.getLogin());
//		
//	}
//	@Test(dataProvider="hotel details",dataProviderClass=DataProviderAno.class)
//	private void dataProvider(String name,String htl,String Room,String roNo,
//			String chkin,String chkout,String adt,String chd,String Fname,String Lname,String add,String ccNum,
//			String cctype,String mon,String yr,String cvvNum) throws InterruptedException {
//		passUrl("http://adactinhotelapp.com/SearchHotel.php");
////		windowMax();
////		crntUrl();
//		Pom p =new Pom ();
//		dropDnValue(p.getLoc(),name);
//		dropDnValue(p.getHtl(),htl);
//		dropDnValue(p.getRmtype(),Room);
//		dropDnValue(p.getRmNo(),roNo);
//		enterValue(p.getChkin(),chkin);
//		enterValue(p.getChkout(),chkout);
//		dropDnValue(p.getAdult(),adt);
//		dropDnValue(p.getChild(),chd);
//		clkbtn(p.getSumit());
//		clkbtn(p.getButton());
//		clkbtn(p.getCon());
//		Thread.sleep(2000);
//		enterValue(p.getFirstnam(),Fname);
//		enterValue(p.getLstNam(),Lname);
//		enterValue(p.getAddress(),add);
//		enterValue(p.getCc_num(),ccNum);
//		dropDnValue(p.getCc_type(),cctype);
//		dropDnValue(p.getMonth(),mon);
//		dropDnValue(p.getYear(),yr);
//		enterValue(p.getCc_cvv(),cvvNum);
//		clkbtn(p.getBook_now());
//		Thread.sleep(2000);
////		String text = p.getOrder_no().getText();
////		System.out.println(text);
//		
//	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

