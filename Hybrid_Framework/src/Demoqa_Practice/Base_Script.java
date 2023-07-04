package Demoqa_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base_Script {
	public WebDriver driver;
	@BeforeMethod
	public void open_Appln()
	{
		System.setProperty("webdriver.chrome.driver","./sw1/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	}
	
	
	

}
