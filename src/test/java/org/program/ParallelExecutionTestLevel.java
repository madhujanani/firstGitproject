package org.program;

import java.sql.Driver;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionTestLevel extends BaseClass{


		public WebDriver driver;
		@Test
		@Parameters({"browser"})
		private void tc1(String name) throws InterruptedException {
			System.out.println("test1 :"+Thread.currentThread().getId());
			if(name.equals("chrome")){
				System.out.println("chrome Browser");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (name.equals("firefox")) {
			System.out.println("fireFox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
			else {
			System.out.println("Edge Browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
		
			driver.get("https://www.facebook.com/");
			System.out.println("test1 :"+Thread.currentThread().getId());

			driver.findElement(By.id("email")).sendKeys("hieveryone");
			driver.findElement(By.id("pass")).sendKeys("hi12345");
			driver.findElement(By.name("login"));
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
			System.out.println("test1 :"+Thread.currentThread().getId());
			driver.findElement(By.id("email")).sendKeys("helloeveryone");
			driver.findElement(By.id("pass")).sendKeys("hello12345");
			driver.findElement(By.name("login"));
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
			System.out.println("test1 :"+Thread.currentThread().getId());
			driver.findElement(By.id("email")).sendKeys("everyone");
			driver.findElement(By.id("pass")).sendKeys("everyone12345");
			driver.findElement(By.name("login"));
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
			System.out.println("test1 :"+Thread.currentThread().getId());
			driver.findElement(By.id("email")).sendKeys("helloone");
			driver.findElement(By.id("pass")).sendKeys("hello12345");
			driver.findElement(By.name("login"));
			Thread.sleep(2000);
		}
		

//
//		
////			
//
//		
//			@Test
//			@Parameters({"browser","user1","pass1"})
//				private void tc4(String name,String pass,String username) throws InterruptedException {
//			System.out.println("test1 :"+Thread.currentThread().getId());
//			if(name.equals("chrome")){
//			System.out.println("chrome Browser");
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			}
//			else if (name.equals("firefox")) {
//			System.out.println("fireFox Browser");
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			}
//			else {
//			System.out.println("Edge Browser");
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			}
//			//System.out.println("test4:" +Thread.currentThread().getId());
//			driver.get("https://www.facebook.com/");
//			Pom p = new Pom();
//			enterValue(p.getTxtUser(),username);
//			enterValue(p.getTxtPass(),pass);
//			clkbtn(p.getBtnLgn());
//			Thread.sleep(2000);			
//		}
//			@Test
//			@Parameters({"UserName","Password"})
//				private void tc3(String name,String pass) throws InterruptedException {
//					System.out.println("test3:" +Thread.currentThread().getId());
//					//passUrl("https://www.facebook.com/");
//					Pom p = new Pom();
//					enterValue(p.getTxtUser(),name);
//					enterValue(p.getTxtPass(),pass);
//					clkbtn(p.getBtnLgn());
//					Thread.sleep(2000);
//				}
//			@Test(dataProvider="loginData",dataProviderClass=DataProviderAno.class)
//			private void tc2(String nam,String pass) throws InterruptedException {
//			System.out.println("test4:" +Thread.currentThread().getId());
//			//passUrl("https://www.facebook.com/");
//			Pom p = new Pom();
//			enterValue(p.getTxtUser(),nam);
//			enterValue(p.getTxtPass(),pass);
//			clkbtn(p.getBtnLgn());
//			Thread.sleep(2000);
//			}
//			@Parameters({"user","pass"})
//			private void tc1(String nam,String pass) throws InterruptedException {
//				System.out.println("test2:" +Thread.currentThread().getId());
//				//passUrl("https://www.facebook.com/");
//				Pom p = new Pom();
//				enterValue(p.getTxtUser(),nam);
//				enterValue(p.getTxtPass(),pass);
//				clkbtn(p.getBtnLgn());
//				Thread.sleep(2000);
//			}
}




























