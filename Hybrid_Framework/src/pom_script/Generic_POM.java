package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generic_POM {
	@FindBy(name="email")
	private WebElement userTbox;
	@FindBy(name="pass")
	private WebElement passTbox;
	@FindBy(name="login")
	private WebElement lgnbtn;
	public Generic_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void usn(String usn)
	{
		userTbox.sendKeys(usn);
	}
	public void psw(String psw)
	{
		passTbox.sendKeys(psw);
	}
	public void log()
	{
		lgnbtn.click();
	}
	
	
	

}
