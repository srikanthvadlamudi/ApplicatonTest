package Gmail_Practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class gmail_practice {
	
	@Given("^the user is on gmail home login page$")
	public void the_user_is_on_gmail_home_login_page() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Desktop\\Selenium course\\CucumberFramework\\Library\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://gmail.com");
	  driver.findElementByName()
		System.out.println("user is on gmail");
	}

	@When("^the user enters valid username and password$")
	public void the_user_enters_valid_username_and_password() 
	{
	    System.out.println("user entered details");
	    String expected = "balance";
	    String actual = "balance";
	    Assert.assertEquals(expected, actual);
	   
	   
	    
	    
	}

	@Then("^the user should be able to successfully login to inbox$")
	public void the_user_should_be_able_to_successfully_login_to_inbox() 
	{
	   System.out.println("user logged in succesfully");
	}

}
