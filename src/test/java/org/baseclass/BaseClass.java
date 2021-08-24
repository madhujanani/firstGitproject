package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.sql.Ref;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a ;
	public static Robot r ;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	public static WebDriverWait w ;
	public static Wait fw;
	public static File f;
	public static FileInputStream fin;
	public static Workbook wb;
	public static Sheet st;
	public static Row ro; 
	public static Cell cell;
	public static int cellType;
	public static Cell ce;
	public static FileOutputStream fout;
	public static Sheet sht;	
	public static Row row;
	public static Cell Cel ;
	public static void browserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void windowMax() {
		driver.manage().window().maximize();
	}
	public static void passUrl(String url) {
		driver.get(url);
	}
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void crntUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void enterValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clkbtn(WebElement btnLgn) {
		btnLgn.click();
	}public static void closeBrowser() {
		driver.quit();
	}

	//Actions methods

	public static void moveElement(WebElement ref) {
		a=new Actions(driver);
		a.moveToElement(ref).perform();
	}
	public static void dragDrop(WebElement src,WebElement des) {
		a=new Actions(driver);
		a.dragAndDrop(src, des);
	}public static void contClick() {
		a.contextClick();
	}public static void dobleClk() {
		a.doubleClick();
	}
	//Robot Methods
	public static void robotCopy() throws AWTException {
	  	r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}public static void robotPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}public static void robotEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}public static void robotTab(int num) throws AWTException {
		r = new Robot();
		for (int i = 0; i < num; i++) {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
	}
	//Alert Methods
	public static void alertAccept() {
		 al =driver.switchTo().alert();
		al.accept();
	}	
	public static void alertDismis() {
		 al =driver.switchTo().alert();
		al.dismiss();
		}
	public static void alertText() {
		 al =driver.switchTo().alert();
		 String text = al.getText();
		System.out.println(text);
		}
	//js Executor methods
	public static void scrolDown(WebElement ref) {
		 js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);
	}
	public static void scrolup(WebElement ref) {
		js.executeScript("arguments[0].scrollIntoView(false)", ref);
	}	
	public static void click(WebElement ref) {
		js.executeScript("arguments[0].click()", ref);
	}
	//ScreenShot
	public static void tkScreenShot(String image) throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\gsmjkv\\eclipse-workspace\\MavenProject\\ScreenShot\\"+image+".png");
		FileUtils.copyFile(src, des);
		
	}
	//frame
	public static void switchFrame(String name) {
		driver.switchTo().frame(name);
	}
	public static void switchFrame(int number) {
		driver.switchTo().frame(number);
	}
	public static void switchFrame(WebElement element ) {
		driver.switchTo().frame(element);
	}
	//dropDown methods-----
	public static void dropDnValue(WebElement ref ,String value) {
		 s = new Select(ref);
		s.selectByValue(value);
	}
	public static void dropDnIndex(WebElement ref ,int index) {
		 s = new Select(ref);
		 s.selectByIndex(index);
	}
	public static void dropDnText(WebElement ref,String text ) {
		 s = new Select(ref);
		 s.selectByVisibleText(text);
		
	}
	public static void ismulti() {
		boolean multiple = s.isMultiple();
		System.out.println("multiple"+multiple);
}
	//wait 
	//implicit wait
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//explicit Wait
	public static void waitAlertPresent() {
		//whether Alert is present,then we use alert methods to perform some actions
		 w = new WebDriverWait(driver, 10);
		 Alert present = w.until(ExpectedConditions.alertIsPresent());	
		 System.out.println(present);
	}
	public static void visibityElemLoc(String id) {
		 w = new WebDriverWait(driver, 10);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		}
	public static void visibityOfElemLoc(String id) {
		 w = new WebDriverWait(driver, 10);
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(id)));
		}
	public static  void elemntClickable(String id) {
		 w = new WebDriverWait(driver, 10);
		 w.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}
	public static void textpresent(WebElement ref,String text) {
		 w = new WebDriverWait(driver, 10);
		 w.until(ExpectedConditions.textToBePresentInElement(ref, text));
	 }
	public static void titleContains(String text) {
		 w = new WebDriverWait(driver, 10);
		 w.until(ExpectedConditions.titleContains(text));
	 }
	//fluent Wait
	public static void waitTitle(String title) {
		 fw = new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(Throwable.class);
		fw.until(ExpectedConditions.titleIs(title));
	}
	public static void visibilityAlElem(WebElement ref) {
		 fw = new FluentWait(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(Throwable.class);
		 fw.until(ExpectedConditions.visibilityOfAllElements(ref));
	}
//	Excel read Write,Methods
	//Always use this method before calling others,,bcaz file data is present here
//	//print particular cell
	//to access the sendkeys we need return value with string so i changed it 
	public static String execlLoc(int rowNum,int celNum) throws IOException {
	 f = new File("C:\\Users\\gsmjkv\\eclipse-workspace\\MavenProject\\TestExecl\\test.xlsx");
	 fin = new FileInputStream(f);
	 wb = new XSSFWorkbook(fin);
	 st = wb.getSheet("sheet");
	 //to get particular cell(236-238)
	 ro = st.getRow(rowNum);
	 ce = ro.getCell(celNum);
	 System.out.println(ce);
	 //to get all cells elements
//	 for (int i = 0; i <st.getPhysicalNumberOfRows(); i++) {
//		  ro = st.getRow(i);
//		 for (int j = 0; j < ro.getPhysicalNumberOfCells(); j++) {
//			  ce = ro.getCell(j);
//			System.out.println(ce);
//		 }
//	 }
	
		 cellType = ce.getCellType();
		  String value="";
		  if (cellType == 1) {
			  value = ce.getStringCellValue();
		}
		  else if (cellType == 0) {
			  if (DateUtil.isCellDateFormatted(ce)) {
				  Date d = ce.getDateCellValue();
				  SimpleDateFormat sim = new SimpleDateFormat("MM-DD-YYYY");
				  value=sim.format(d);
				
			} else {
				double d = ce.getNumericCellValue();
				long l = (long)d;
				 value = String.valueOf(l);
			}
		}
		  return value;
		}

	//total number of rows
	public static  void rowCountExcel() throws FileNotFoundException {
		int physicalNumberOfRows = st.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
	}
	//total number of cell in a particular row
	public static  void cellCountExcel(int rowNum) throws FileNotFoundException {
		int physicalNumberOfRows = st.getPhysicalNumberOfRows();
		 ro = st.getRow(rowNum);
		 int physicalNumberOfCells = ro.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
	}
	//Replace A DATA IN EXSISTING EXCEL FILE
	public static void insertDataExcel(String oldname ,String name) throws IOException {
		
			 String cellvalue = ce.getStringCellValue();
			 if (cellvalue.equals(oldname)) {
			ce.setCellValue(name);
			fout =new FileOutputStream(f);
		    wb.write(fout);
			 }	 
	
		 System.out.println("sucess");
	}
	//insert data in new excel
	public static void insertValue(String xlName,String name, int rowNum,int column,String celname) throws IOException {
		 f = new File("C:\\Users\\gsmjkv\\eclipse-workspace\\MavenProject\\TestExecl\\"+xlName+".xlsx");
		 wb = new XSSFWorkbook();
		  sht = wb.createSheet(name);
		  row = sht.createRow(rowNum);
		    Cel = row.createCell(column);
		    Cel .setCellValue(celname);
		    fout =new FileOutputStream(f);
		    wb.write(fout);
		    System.out.println("sucess");
		    
	}public static void addRows(String name,int rowNum,int column, String celname) throws IOException {
		 	
		 f = new File("C:\\Users\\gsmjkv\\eclipse-workspace\\MavenProject\\TestExecl\\test.xlsx");
		 fin = new FileInputStream(f);
		 wb = new XSSFWorkbook(fin);
		 sht = wb.getSheet(name);
		 row = sht.createRow(rowNum);
		 Cel = row.createCell(column);
		 Cel.setCellValue(celname);
		    fout =new FileOutputStream(f);
		    wb.write(fout);
		    System.out.println("sucess");	
	}
	public static void dateAndTime() {
		Date d = new Date();
		System.out.println(d);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


