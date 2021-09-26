package com.application.framework.StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import com.application.framework.Base.Base;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin {
	
	@Before
	public void beforeMethod() {
		
	System.out.println("I am executing before bachground");
	}
	
	WebDriver driver;
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Browser opened");
	}

	@And("^open the application$")
	public void open_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
		// Setup();
		driver.get("https://www.ajio.com/");
		System.out.println("application opened");
	}

	@When("^(.+) enters username and password$") 
	public void tamil_enters_username_and_password(String user,DataTable arg1) throws Throwable { 
	List<List<String>> data = arg1.raw();
		System.out.println("Entered password:"+data.get(0));
		System.out.println("Entered username:"+data.get(1));
	//	loginOb.enterCredentials(data.get(1),data.get(0));
		}

	
	  @Then("^click on continue$") public void click_on_continue() throws Throwable
	  { // Write code here that turns the phrase above into concrete actions throw
	  new PendingException(); }
	 

	@Given("^check it$")
	public void check_it() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	@When("^\"([^\"]*)\" enters username$")
	public void enters_username(String arg1) throws Throwable {
	   System.out.println("Username entered:"+arg1);
	}
	
	@After
	public void afterHook() {
		System.out.println("Entered afterHook"); 
		driver.close();
		
	}
	
	
	
}
