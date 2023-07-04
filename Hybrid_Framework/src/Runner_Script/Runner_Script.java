package Runner_Script;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Pom_Script.Loginpage;

public class Runner_Script extends Base_Test{
	
	@Test(dataProvider ="test1")
	public void login(String un, String pass)
		{
		Loginpage l = new Loginpage(driver);
		l.email(un);
		l.password(pass);
		l.login();
		Assert.fail();
		
	
		}
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", "admin" },
	   { "Anne", "manager"},
	 };
	
	
		  
	}

}
