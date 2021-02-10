package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition{

	 WebDriver driver;
	
	 @Given("^user is already on Login Page$")
	 public void user_is_already_on_Login_Page() {
	     driver.get("https://ui.freecrm.com/");
	    	 }
	 @SuppressWarnings("deprecation")
	@When("^title of login page is Cogmento CRM$")
	 public void title_of_login_page_is_Cogmento_CRM()  {
	    String title=driver.getTitle();
	    Assert.assertEquals("Cogmento CRM", title);
	 }

	 @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_and(String arg1, String arg2)  {
	    
	 }

	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button()  {
	     
	 }

	 @Then("^user is on home page$")
	 public void user_is_on_home_page()  {
	  
	 }

}
