package Resources.FirstE2EProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
	
		this.driver=driver;
	}
	
    private	By loginbutton = By.cssSelector("a[href*=sign_in]");
	private By title = By.xpath("//*[@id=\"content\"]/div/div/h2");
	private By Navigatingbar = By.xpath("//a[contains(text(),'Contact')]");
	public WebElement pressLogin()
	{
		return driver.findElement(loginbutton);
	}
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	public WebElement getbar()
	{
		return driver.findElement(Navigatingbar);
	}

}
