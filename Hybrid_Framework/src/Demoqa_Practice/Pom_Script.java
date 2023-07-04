package Demoqa_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Script {
	@FindBy(id="firstName")
	private WebElement FNfield; 
	@FindBy(id="lastName")
	private WebElement LNfield;
	@FindBy(id="userEmail")
	private WebElement Efield;
   @FindBy(xpath="//label[text()='Male]")
   private WebElement Gender;
   @FindBy(id="userNumber")
   private WebElement Mobile_Numberfield;
   @FindBy(id="dateOfBirthInput")
   private WebElement DOB_field;
   @FindBy(id="subjectsInput")
   private WebElement Sub_field;
   @FindBy(xpath="//label[text()='Sports']")
   private WebElement Hobbies_field;
   @FindBy(id="uploadPicture")
   private WebElement p_field;
   @FindBy(id="currentAddress")
   private WebElement C_adressfield;
   
   
   public Pom_Script(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   public void passFN(String fn)
   {
	   FNfield.sendKeys(fn); 
   }
   public void passLN(String ln)
   {
	   LNfield.sendKeys(ln);
   }
  public void passEMAIL(String email)
  {
	  Efield.sendKeys(email);
  }
  public void btn()
  {
	  Gender.click();
	  
  }
    public void passMN(String mn)
    {
	  Mobile_Numberfield.sendKeys(mn);
     }
    public void passDOB(String dob)
    {
	  DOB_field.sendKeys(dob);
     }
     public void passsub(String sub)
     {
	  Sub_field.sendKeys(sub);
      }
       public void passHOBBIES()
       {
	    Hobbies_field.click();
       }
public void passpic(String pic)
{
	p_field.sendKeys(pic);
}
        public void passadress(String adress)
        {
	     C_adressfield.sendKeys(adress);
        }
        }
