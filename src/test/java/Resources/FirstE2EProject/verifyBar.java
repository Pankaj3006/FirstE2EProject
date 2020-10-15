package Resources.FirstE2EProject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class verifyBar extends Driver_information 
	 {
		
		WebDriver driver;
		public static Logger log = Logger.getLogger("verifyBar");
		@Test
		public void Barexecution() throws IOException
		{
			PropertyConfigurator.configure(System.getProperty("user.dir")+"\\log4j_FE2E.properties");
			driver = initializeDriver();
			driver.get(prop.getProperty("Url"));
			LandingPage lp = new LandingPage(driver);
			log.info("Landing on Login page");
			Assert.assertTrue(lp.getbar().isDisplayed());
			log.info("element is visible");
		}
		@AfterTest
		public void closedriver() throws InterruptedException
		{  
			Thread.sleep(2000);
			driver.close();
			driver=null;
			System.out.println("Bar Driver Closed Successfully");
		}

	}



