package Resources.FirstE2EProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
	
		this.driver = driver;
	}
		
	private By emailaddress = By.xpath("(//input[@class='form-control input-hg'])[1]");
	private By password = By.xpath("(//input[@class='form-control input-hg'])[2]");
	private By login = By.xpath("//input[@type='submit']");
	private By error = By.xpath("//h1[@class='text-center']");
	
	public WebElement enteremail()
	{
		return driver.findElement(emailaddress);
	}
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	public WebElement clickLogin()
	{
		return driver.findElement(login);
	}
	public WebElement readerror()
	{
		return driver.findElement(error);
	}



}
