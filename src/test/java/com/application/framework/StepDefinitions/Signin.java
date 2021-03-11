package com.application.framework.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.application.framework.Base.Base;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin{

	@Given("^open the application$")
	public void open_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
	    
		WebDriver driver = new ChromeDriver();
		System.out.println("calling the method");
		//Setup();
	    driver.get("https://www.ajio.com/");
	}

	@When("^Tamil enters username and password$")
	public void tamil_enters_username_and_password(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^check it$")
	public void check_it() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
