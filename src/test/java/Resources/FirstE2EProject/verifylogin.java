package Resources.FirstE2EProject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class verifylogin extends Driver_information {
	
	WebDriver driver;
	public static Logger log = Logger.getLogger("verifylogin");
	@Test
	public void loginexecution() throws IOException, InterruptedException
	{
	PropertyConfigurator.configure(System.getProperty("user.dir")+"\\log4j_FE2E.properties");
	driver = initializeDriver();
    driver.get(prop.getProperty("Url"));
    log.info("URL Launched");
	LandingPage lp = new LandingPage(driver);
	log.info("Landing on Home page");
	lp.pressLogin().click();
	Thread.sleep(2000);	
	log.info("Wait Inserted");
	LoginPage lop = new LoginPage(driver);
	log.info("Landing on Login page");
	lop.enteremail().sendKeys(prop.getProperty("Username"));
	lop.enterpassword().sendKeys(prop.getProperty("Password"));
	lop.clickLogin().click();
	System.out.println(lop.readerror().getText());
	}
	
	@AfterTest
	public void closedriver() throws InterruptedException
	{  
		Thread.sleep(2000);
		driver.close();
		driver=null;
		System.out.println("Login Driver Closed Successfully");
	}
}
