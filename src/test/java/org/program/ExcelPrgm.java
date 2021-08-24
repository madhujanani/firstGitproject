package org.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelPrgm extends BaseClass  {
	
public static void main(String[] args) throws InterruptedException  {
	
	browserConfig();
	windowMax();
	Pom p =new Pom();
	
//	passUrl("http://www.greenstechnologys.com/");
//	scrolDown(p.getOmr());
//	String address = p.getOmr().getText();
//	System.out.println(address);
//	scrolup(p.getHeading());
//	String heading = p.getHeading().getText();
//	System.out.println(heading);
//	
	System.out.println("adding info to clone-check 1");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	insertValue("test","sheet",0,0,"madhugowri");
//	addRows("sheet",1,0,"madhu");
//	
//	addRows("sheet",2,0,"Sydney");
//	//addRows("sheet",3,0,"98765");
//	addRows("sheet",2,1,"Hotel Creek");
//	addRows("sheet",3,1,"Standard");
//	addRows("sheet",5,1,"4-8-2021");
//	addRows("sheet",6,1,"6-8-2021");
//	addRows("sheet",7,1,"1");
//	addRows("sheet",9,1,"janani");
//	addRows("sheet",11,1,"anywhere");
//	addRows("sheet",14,1,"VISA");
//	addRows("sheet",16,1,"4");
//	addRows("sheet",17,1,"2022");
//	addRows("sheet",18,1,"123");
//	addRows("sheet",1,1,"9876543123");
//	addRows("sheet",7,1,"Assam");
//	addRows("sheet",8,1,"2");
//	addRows("sheet",4,1,"10");
//	addRows("sheet",6,1,"4");
//	addRows("sheet",10,0,"madhu");
//	addRows("sheet",10,2,"madhu@gmail.com");
//	addRows("sheet",13,1,"123456789876523");
//	
//	
//	
//	
//
//	WebElement checkout = driver.findElement(By.name("datepick_out"));
//	enterValue(checkout,execlLoc(6,1));
//	WebElement aduld = driver.findElement(By.id("adult_room"));
//	dropDnValue(aduld,execlLoc(7,1));
//	WebElement child = driver.findElement(By.id("child_room"));
//	dropDnValue(child,execlLoc(8,1));
//	WebElement lgn = driver.findElement(By.id("Submit"));
//	clkbtn(lgn);
//	WebElement radbtn = driver.findElement(By.id("radiobutton_0"));
//	clkbtn(radbtn);
//	WebElement cntue = driver.findElement(By.id("continue"));
//	clkbtn(cntue);
//	
//	WebElement frstnam = driver.findElement(By.id("first_name"));
//	enterValue(frstnam,execlLoc(0,2));
//	WebElement lstNm = driver.findElement(By.id("last_name"));
//	enterValue(lstNm,execlLoc(9,1));
//	WebElement address = driver.findElement(By.id("address"));
//	enterValue(address,execlLoc(11,1));
//	WebElement card = driver.findElement(By.id("cc_num"));
//	enterValue(card,execlLoc(13,1));
//	WebElement cc_type = driver.findElement(By.id("cc_type"));
//	dropDnValue(cc_type,execlLoc(14,1));
//	Thread.sleep(2000);
//	WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month'] "));
////	Select s = new Select(month);
////	s.selectByValue("4");
//	dropDnValue(month, execlLoc(16,1));
//	WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
//	dropDnValue(cc_exp_year,execlLoc(17,1));
//	Thread.sleep(2000);
//	WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
//	enterValue(cc_cvv,execlLoc(18,1));
//	WebElement book_now = driver.findElement(By.id("book_now"));
//	clkbtn(book_now);
//	WebElement order_no = driver.findElement(By.id("order_no"));
//	System.out.println(order_no.getAttribute("value"));
	
	
	
	
	
	
	
//	Pom p = new Pom();
//	moveElement(p.getCourse());
//	moveElement(p.getJava());
//	clkbtn(p.getCorejava());
//	clkbtn(p.getContact());
//	WebElement heading = p.getHeading();
//	System.out.println(heading.getText());
//	scrolDown(p.getCopy());
//	WebElement copy = p.getCopy();
//	System.out.println(copy.getText());
	

	//scrolDown(p.getReview());
//	String tex = p.getReview().getText();
//	System.out.println(tex);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//insertValue("test","sheet",0,2,"madhugowri");
//addRows("sheet",13,1,"123654");
//
//	browserConfig();
//	windowMax();
//	passUrl("https://www.facebook.com/");
//	crntUrl();
//	WebElement email = driver.findElement(By.id("email"));
//	enterValue(email,execlLoc(0,2));
//	WebElement name = driver.findElement(By.id("pass"));
//	enterValue(name,execlLoc(13,1));
//	WebElement login = driver.findElement(By.name("login"));
//	clkbtn(login);

//
//	
//	
//	@BeforeClass
//	public static void browserConfig() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//	@Before
//	public void startTime() {
//		Date d = new Date();
//		System.out.println(d);
//	}
//	@After
//	public void EndTime() {
//		Date d = new Date();
//		System.out.println(d);
//	}
//	@AfterClass
//	public static void closeBrowser() {
//	driver.quit();
//	}
//	public void testCase() throws IOException {
//		passUrl("https://www.facebook.com/");
//		crntUrl();
//		WebElement email = driver.findElement(By.id("email"));
//		enterValue(email,execlLoc(0,2));
//		WebElement name = driver.findElement(By.id("pass"));
//		enterValue(name,execlLoc(13,1));
//		WebElement login = driver.findElement(By.name("login"));
//		clkbtn(login);
//
//	}
//
//}
	
	
	
	
//	
//	
//	WebElement password = driver.findElement(By.name("password"));
//	enterValue(password,execlLoc(13,1));
//	WebElement number = driver.findElement(By.name("number"));
//	enterValue(number,execlLoc(1,1));
//	WebElement city = driver.findElement(By.xpath("//input[@class='sugInp']"));
//	enterValue(city,execlLoc(6,1));
////	WebElement cty = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
////	dropDnText(cty,execlLoc(7,1));
//	WebElement year = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
//	dropDnValue(year,execlLoc(8,1));
//	WebElement month = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
//	dropDnValue(month,execlLoc(4,1));
//	WebElement btlemenn = driver.findElement(By.xpath("(//label[@class='customChkBoxLbl chkboxLbl'])[1]"));
//	clkbtn(btlemenn);
//	WebElement clk = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//	clkbtn(clk);
//	
	
//	(//button[@type='submit'])[1](//input[@type='text'])[6]
//	

////	clkbtn();first_name
//	
//	WebElement frstnam = driver.findElement(By.id("first_name"));
//	enterValue(frstnam,execlLoc(0,2));
//	WebElement lstNm = driver.findElement(By.id("last_name"));
//	enterValue(lstNm,execlLoc(9,1));
//	WebElement address = driver.findElement(By.id("address"));
//	enterValue(address,execlLoc(11,1));
//	WebElement card = driver.findElement(By.id("cc_num"));
//	enterValue(card,execlLoc(13,1));
//	WebElement cc_type = driver.findElement(By.id("cc_type"));
//	dropDnValue(cc_type,execlLoc(14,1));
//	Thread.sleep(2000);
//	WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month'] "));
////	Select s = new Select(month);
////	s.selectByValue("4");
//	dropDnValue(month, "4");
//	WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
//	dropDnValue(cc_exp_year,execlLoc(17,1));
//	Thread.sleep(2000);
//	WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
//	enterValue(cc_cvv,execlLoc(18,1));
//	WebElement book_now = driver.findElement(By.id("book_now"));
//	clkbtn(book_now);
//	WebElement order_no = driver.findElement(By.id("order_no"));
//	System.out.println(order_no.getAttribute("value"));
	
	//execlLoc( "stdCourse", 5,0);cc_exp_month
	//changeFormat();
	//insertDataExcel("Fathima","oracle");
	

//
//
//addRows("sheet",1,5,"Location");
//addRows("sheet",2,5,"Hotel");
//addRows("sheet",3,5,"roomType");
//addRows("sheet",4,3,"No.of.room");
//addRows("sheet",5,3,"checkin");
//addRows("sheet",6,3,"checkout");
//addRows("sheet",7,3,"adult");
//addRows("sheet",8,3,"child");
//
//
//addRows("sheet",2,1,"Hotel Creek");
//addRows("sheet",3,1,"Standard");
//addRows("sheet",5,1,"4-8-2021");
//addRows("sheet",6,1,"6-8-2021");
//addRows("sheet",7,1,"1");
//addRows("sheet",9,1,"janani");
//addRows("sheet",11,1,"anywhere");
//addRows("sheet",14,1,"VISA");
//addRows("sheet",15,2,"July");
//addRows("sheet",17,1,"2022");
//addRows("sheet",18,1,"123");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//getData(4,2);
//	browserConfig();
//	windowMax();
//	passUrl("http://adactinhotelapp.com/");

	
	

//		File f = new File ("C:\\Users\\gsmjkv\\eclipse-workspace\\MavenProject\\TestExecl\\stdCrs.xlsx");
//		FileInputStream fin = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(fin);
//		Sheet st = w.getSheet("stdCourse");
//		Row ro = st.getRow(3);
//		Cell cell = ro.getCell(0);
//		System.out.println(cell);
//		
////		//q-2
//		System.out.println("==========");
//		int physicalNumberOfRows = st.getPhysicalNumberOfRows();
//		System.out.println(physicalNumberOfRows);
//	
//		//q-3
//		System.out.println("===============");{
//		for (int i = 0; i <st.getPhysicalNumberOfRows(); i++) {
//			Row row = st.getRow(i);
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			Cell cl = row.getCell(j);
//			System.out.println(cl);
//				
//			}
//		}	
//	}

}



}

	

