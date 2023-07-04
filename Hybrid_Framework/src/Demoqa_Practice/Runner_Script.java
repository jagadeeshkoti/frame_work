package Demoqa_Practice;

import org.testng.annotations.Test;

public class Runner_Script extends Base_Script {
	@Test
	public void test1()
	{
		Pom_Script p1 = new Pom_Script(driver);
		p1.passFN("Jagadeesh");
		p1.passLN("Koti");
		p1.passEMAIL("jagurk2484@gmail.com");
	    p1.btn();
	    p1.passMN("9686881058");
	    p1.passDOB("08-07-1996");
	    p1.passsub("Hiiiiii");
	    p1.passHOBBIES();
	    p1.passpic("./photos.jpeg");
	    p1.passadress("Vijayanagar");
	}

}
