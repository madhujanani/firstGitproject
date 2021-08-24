package org.program;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass{
	public  Pom() {
		PageFactory.initElements(driver, this);

	}
//	faceBooklogin
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLgn;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLgn() {
		return btnLgn;
	}
//	
//	//FlipKart LOgin
//	@FindBy(xpath="(//input[@type='text'])[2]")
//	private WebElement Username;
//	@FindBy(xpath ="(//input[@type='password'])")
//	private WebElement passWord;
//	@FindBy(xpath ="(//button[@type='submit'])[2]")
//	private WebElement btnClk;
//
//	public WebElement getUsername() {
//		return Username;
//	}
//
//	public WebElement getPassWord() {
//		return passWord;
//	}
//
//	public WebElement getBtnClk() {
//		return btnClk;
//	}
//	
//	
//	//redBus signup/login
//	
//	@FindBy(id="i-icon-profile")
//	private WebElement Redbs;
//	@FindBy(id="signInLink")
//	private WebElement signIn;
//
////	@FindAll({
////		@FindBy(xpath="(//input[@placeholder='Enter your mobile number'])[2]"),
////		@FindBy(xpath="//input[@class='IP'][1]"),
////		
////	
////	})
//	@FindBy(xpath="//div[@class='mobileInputContainer clearfix contact-box']")
//	private WebElement mobtry;
//	public WebElement getMobtry() {
//		return mobtry;
//	}
//
//	private WebElement mobNo;
//	
//	@FindBy(xpath="(//label[@id='recaptcha-anchor-label'])[1]")
//	private WebElement btnrobo;
//	@FindBy(xpath="(//span[text()='GENERATE OTP '])")
//	private WebElement otp;
//
//	public WebElement getRedbs() {
//		return Redbs;
//	}
//
//	public WebElement getSignIn() {
//		return signIn;
//	}
//
//	public WebElement getMobNo() {
//		return mobNo;
//	}
//
//	public WebElement getBtnrobo() {
//		return btnrobo;
//	}
//
//	public WebElement getOtp() {
//		return otp;
//	}
	
	
//greensTech Heading	
//	@FindBy(xpath="(//span[@class='red_text'])[2]")
//	private WebElement omr;
//	@FindBy(xpath="(//h1[@style='font-size:22px;'])")
//	private WebElement heading;
//	public WebElement getOmr() {
//		return omr;
//	}
//	public WebElement getHeading() {
//		return heading;
//	}
	
	
	
	//adactin   Hotel
//	@FindBy(id="username")
//	private WebElement id;
//	@FindBy(id="password")
//	private WebElement passwd;
//	@FindBy(id="login")
//	private WebElement login;
////	
////	
////	
//	
//	@FindBy(id="location")
//	private WebElement loc;
//	@FindBy(id="hotels")
//	private WebElement htl;
//	@FindBy(id="room_type")
//	private WebElement rmtype;
//	@FindBy(id="room_nos")
//	private WebElement rmNo;
//	@FindBy(name="datepick_in")
//	private WebElement chkin;
//	@FindBy(name="datepick_out")
//	private WebElement chkout;
//	@FindBy(id="adult_room")
//	private WebElement adult;
//	@FindBy(name="child_room")
//	private WebElement child;
//	@FindBy(id="Submit")
//	private WebElement sumit;
////
////	
////	
//	@FindBy(id="radiobutton_0")
//	private WebElement button;
//	@FindBy(id="continue")
//	private WebElement con;
//	@FindBy(id="first_name")
//	private WebElement firstnam;
//	@FindBy(id="last_name")
//	private WebElement lstNam;
//	@FindBy(name="address")
//	private WebElement address;
//	@FindBy(name="cc_num")
//	private WebElement cc_num;
//	@FindBy(id="cc_type")
//	private WebElement cc_type;
//	@FindBy(xpath="//select[@id='cc_exp_month'] ")
//	private WebElement month;
//	@FindBy(id="cc_exp_year")
//	private WebElement year;
//	
//	@FindBy(id="cc_cvv")
//	private WebElement cc_cvv;
//	@FindBy(id="book_now")
//	private WebElement book_now;
//	@FindBy(id="order_no")
//	private WebElement order_no;
//	public WebElement getId() {
//		return id;
//	}
//	public WebElement getPasswd() {
//		return passwd;
//	}
//	public WebElement getLogin() {
//		return login;
//	}
//	public WebElement getLoc() {
//		return loc;
//	}
//	public WebElement getHtl() {
//		return htl;
//	}
//	public WebElement getRmtype() {
//		return rmtype;
//	}
//	public WebElement getRmNo() {
//		return rmNo;
//	}
//	public WebElement getChkin() {
//		return chkin;
//	}
//	public WebElement getChkout() {
//		return chkout;
//	}
//	public WebElement getAdult() {
//		return adult;
//	}
//	public WebElement getChild() {
//		return child;
//	}
//	public WebElement getSumit() {
//		return sumit;
//	}
//	public WebElement getButton() {
//		return button;
//	}
//	public WebElement getCon() {
//		return con;
//	}
//	public WebElement getFirstnam() {
//		return firstnam;
//	}
//	public WebElement getLstNam() {
//		return lstNam;
//	}
//	public WebElement getAddress() {
//		return address;
//	}
//	public WebElement getCc_num() {
//		return cc_num;
//	}
//	public WebElement getCc_type() {
//		return cc_type;
//	}
//	public WebElement getMonth() {
//		return month;
//	}
//	public WebElement getYear() {
//		return year;
//	}
//	public WebElement getCc_cvv() {
//		return cc_cvv;
//	}
//	public WebElement getBook_now() {
//		return book_now;
//	}
//	public WebElement getOrder_no() {
//		return order_no;
//	}
	
}

