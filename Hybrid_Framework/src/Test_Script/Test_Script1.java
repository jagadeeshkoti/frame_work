package Test_Script;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Test_Script1 {
	@Test
	public void test1()
	{
	//	step1
		ExtentReports rep=new ExtentReports("./report/r.html");
		ExtentTest t1=rep.startTest("tc1");
		t1.log(LogStatus.PASS,"passed tc");
		t1.log(LogStatus.FAIL,"failed tc");
		t1.log(LogStatus.SKIP,"tc skipped");
		rep.endTest(t1);
		rep.flush();
	}

}
