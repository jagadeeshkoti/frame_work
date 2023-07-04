package Pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.Basepage;

public class Loginpage extends Basepage {
	@FindBy(name="email")
	private WebElement un;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement logbtn;
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	public void email(String uname)
	{
		un.sendKeys(uname);
	}
	public void password(String pawd)
	{
		pwd.sendKeys(pawd);
	}
	public void login()
	{
		logbtn.click();
	}
	
	
	
	
}
