package com.sample.mvc.seleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Selenium test
public class EmployeeAddSeleniumTest {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8080/EmployeeApplication/add.jsp";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCheck() throws Exception {
		driver.get(baseUrl + "");
	    driver.findElement(By.name("code")).clear();
	    driver.findElement(By.name("code")).sendKeys("112");
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Rahul");
	    driver.findElement(By.name("city")).clear();
	    driver.findElement(By.name("city")).sendKeys("Pune");
	    driver.findElement(By.id("SubmitEmployee")).click();

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}
