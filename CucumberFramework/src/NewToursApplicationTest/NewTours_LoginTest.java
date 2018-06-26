package NewToursApplicationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//System.setProperty("webDriver.chrome.driver","C:\\Users\\srika\\Desktop\\Selenium course\\CucumberFramework\\Library\\chromedriver.exe");
public class NewTours_LoginTest {
	FirefoxDriver driver;		
		

	
	@Given("^Open Firefox Browser and navigate to newTours Applicaton$")
	public void Open_Firefox_Browser_and_navigate_to_newTours_Applicaton() throws Throwable
	{
	    driver = new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on signin$")
	public void User_enters_valid_and_and_click_on_signin(String Username, String Password) throws Throwable {
	   	
		driver.findElementByName("userName").sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElementByName("login").click();
		String expected_text = "lowest";
		String actual_text = driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font").getText();
		if(actual_text.contains(expected_text))
		{
			System.out.println("Loggedin - Passed");
		}
			else
			{	
				System.out.println("Fail");
		
	}
	}
	@Then("^User should be able to successfully login in and close the applicaton$")
	public void User_should_be_able_to_successfully_login_in_and_close_the_applicaton() throws Throwable
	{
	  driver.close();
	}

	
}
