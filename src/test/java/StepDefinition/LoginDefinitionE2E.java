package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Resources.FirstE2EProject.Driver_information;
import Resources.FirstE2EProject.LandingPage;
import Resources.FirstE2EProject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

//Comment Inserted to Test something in GIT

@RunWith(Cucumber.class)
public class LoginDefinitionE2E extends Driver_information {
        public WebDriver driver;
        LoginPage lop;
        LandingPage lp;
        public WebElement ele;
        String exptext;
	    @Given("^Open the \"([^\"]*)\" on chrome$")
	    public void open_the_something_on_chrome(String Url) throws Throwable
	    {
	     driver = initializeDriver();
	     driver.get(Url);
	    }

	    @When("^Enter the email (.+) and password (.+)$")
	    public void enter_the_email_and_password(String username, String password) throws Throwable 
	    {   
	        lop = new LoginPage(driver);
	    	lop.enteremail().sendKeys(username);
	    	lop.enterpassword().sendKeys(password);
	    	lop.clickLogin().click();
	    }

	    @Then("^Click on login button$")
	    public void click_on_login_button() throws Throwable 
	    {  
	    	lop.clickLogin().click(); 
	    	Thread.sleep(2000);
	    }
	    
	    @And("^Press login button$")
	    public void press_login_button() throws Throwable
	    {
	    	lp = new LandingPage(driver);
	    	lp.pressLogin().click();
	    	Thread.sleep(2000);
	    }

	    @And("^capture the error message$")
	    public void capture_the_error_message() throws Throwable
	    {  
	    	String text = lop.readerror().getText();
	    	System.out.println(text);
	    }
	    
	   /* @When("^get the address of Navigation Bar$")
	    public void get_the_address_of_navigation_bar() throws Throwable
	    {
	        ele= lp.getbar();
	    	//ele= driver.findElement(By.xpath("By.xpath(\"//html/body/header/div[2]/div/nav/ul/li\")"));
		}

	    @Then("^Check whether Bar is Displayed$")
	    public void check_whether_bar_is_displayed() throws Throwable 
	    {
	    	Assert.assertTrue(ele.isDisplayed());
	    }
	       
	   
	    @When("^Get the Address of title$")
	    public void get_the_address_of_title() throws Throwable
	    {
	    	exptext = lp.gettitle().getText();
	    }

	    @Then("^Check whether title is matching$")
	    public void check_whether_title_is_matching() throws Throwable
	    {
	      if(exptext.equalsIgnoreCase("Featured Courses"))
	      {
	    	  System.out.println("Title is Matching");
	      }
	      else
	      {
	    	  System.out.println("Title is not matching");
	      }
	    } */
	    
	    @And("^close the Browser$")
	    public void close_the_browser() throws Throwable
	    {
	      Thread.sleep(2000);
	      driver.close();
	      driver=null;
	    }

	}

