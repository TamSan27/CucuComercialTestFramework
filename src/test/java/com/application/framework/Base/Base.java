package com.application.framework.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Base {

//public static    WebDriver driver;
	
    @Before
	public void Setup() {
		System.out.println("method called");
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
	  //   driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
	}
	
}
