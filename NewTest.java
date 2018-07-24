package com.Nissan;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  
  public WebDriver driver;
  
  
	
  @Test
  public void login() 
  
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adraha.maiti\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.navigate().to("https://qa.eu.nissan.biz/nfit/login.do");
      driver.manage().window().maximize();
      driver.findElement(By.xpath(".//input[@id='userid']")).sendKeys("GBD01273");
      driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("nissan13");
      driver.findElement(By.id("submit1")).click();
	  
  }
	  
	  /*Select model = new Select(driver.findElement(By.xpath(".//*[@id='content_area']/tbody/tr[2]/td[2]/span/select")));
      model.selectByIndex(30);
      driver.findElement(By.xpath(".//*[@id='content_area']/tbody/tr[2]/td[4]/span/input")).sendKeys("VSKYBAM20U0123072");
      driver.findElement(By.xpath(".//*[@id='content_area']/tbody/tr[2]/td[6]/table/tbody/tr[2]/td[4]/input")).click();
      */ 
	    
	  
  @Test(dependsOnMethods= {"login"})
  
  public void techline()
  
  {
	  
	  driver.findElement(By.xpath(".//*[@id='_2']")).click();
	  driver.findElement(By.xpath(".//*[@id='_2_1']")).click();
	  driver.findElement(By.xpath(".//*[@id='content_area']/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/input")).sendKeys("2004451");
	  driver.findElement(By.xpath(".//*[@id='content_area']/tbody/tr[7]/td[2]/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[5]/table/tbody/tr[2]/td[4]/input")).click();
	  driver.findElement(By.xpath(".//*[@id='OpenCallsTable']/tbody/tr/td[3]/table/tbody/tr/td/a")).click();
	  driver.findElement(By.xpath(".//*[@id='_9']")).click();
	  driver.findElement(By.xpath(".//*[@id='content_area']/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[4]/input")).click();
	  
	  
  }
  
  
  @Test(dependsOnMethods= {"techline"})
  
  public void logout() 
  
  {
	  /*driver.findElement(By.xpath(".//*[@id='_9']")).click();
	  driver.findElement(By.xpath(".//*[@id='content_area']/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[4]/input")).click();*/  
	  driver.close();
  }
  
 

}
