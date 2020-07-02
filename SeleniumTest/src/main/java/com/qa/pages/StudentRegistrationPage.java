package com.qa.pages;


import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.TestBase;

public class StudentRegistrationPage extends TestBase
{
		
	@FindBy(xpath="//h5[text()='Student Registration Form']")
    public WebElement StudentRegistrationTxt;
	
	@FindBy(xpath="//input[@id='firstName']")
    public WebElement FirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
    public WebElement LastName;
	
	@FindBy(xpath="//input[@id='userEmail']")
    public WebElement Email;
	
	@FindBy(xpath="//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div")
    public List<WebElement> Gender;
		
	@FindBy(xpath="//input[@id='userNumber']")
    public WebElement Mobile;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
    public WebElement DOB;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
    public WebElement Month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
    public WebElement Year;
	
	
	@FindBy(xpath="//div[@role='option']")
    public List<WebElement> Day;
	
	@FindBy(xpath="//div[text()='11']")
    public WebElement Day1;
		
	
	@FindBy(xpath="//label[text()='Sports']")
    public WebElement Hobbies1;
	
	@FindBy(xpath="//div[@id='hobbiesWrapper']//div//div")
    public List<WebElement> Hobbies;
	
	@FindBy(xpath="//input[@type='file']")
    public WebElement Picture;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
    public WebElement CurrentAddress;
	
	@FindBy(xpath="//div[text()='Select State']")
    public WebElement State;
	
	
	@FindBy(xpath="//input[@id='react-select-3-input']")
    public WebElement StateInput;
	
	
	@FindBy(xpath="//div[text()='Select City']")
    public WebElement City;
	
	@FindBy(xpath="//input[@id='react-select-4-input']")
    public WebElement CityInput;
	
	@FindBy(xpath="//button[@id='submit']")
    public WebElement Submit;
	
	
	//Verification xpath 
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[1]//td[2]")
    public WebElement StudentName;
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[2]//td[2]")
    public WebElement StudentEmail;
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[3]//td[2]")
    public WebElement StudentGender;
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[4]//td[2]")
    public WebElement StudentMobile;
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[5]//td[2]")
    public WebElement StudentDOB;
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[7]//td[2]")
    public WebElement StudentHobbies;
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[8]//td[2]")
    public WebElement StudentPicture;
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[9]//td[2]")
    public WebElement StudentAddress;
	
	
	@FindBy(xpath="//div[@class='modal-body']//tbody//tr[10]//td[2]")
    public WebElement StudentStateCity;
	
	
	@FindBy(xpath="//button[@id='closeLargeModal']")
    public WebElement CloseBtn;
	
	
	
	
	
	
	
	
	
	
	
			
   public StudentRegistrationPage()
   {
	PageFactory.initElements(driver, this);
   }
   
   
   public void registrationdetails(String firstname,String lastname,String email, String gendervalue, String month, String year,
		    String dayvalue, String hobbies, String picture,
		   String currentaddress,String  number,String selectstate, String selectcity) throws InterruptedException 
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   FirstName.sendKeys(firstname);	   
	   LastName.sendKeys(lastname);
	   Email.sendKeys(email);	   
	   for (WebElement e: Gender)
	   {
		   String gendertext= e.getText();
		   if(gendertext.equalsIgnoreCase(gendervalue))
		   {
			   e.click();
			   e.isSelected();
		   }
	   }
	   
	   
	      
       DOB.click();
       
       
       Year.click();
       Select selectyear= new Select(Year);
       selectyear.selectByVisibleText(year);
       
       Month.click();
       Select selectmonth= new Select(Month);
       selectmonth.selectByVisibleText(month);
           
       
       System.out.println(Day.size());
       for(WebElement e:Day)
       {
    	   String daytext= e.getText();
    	   System.out.println(daytext);
    	   if(daytext.equalsIgnoreCase(dayvalue))
    	   {
              e.click();
              break;
    	   }
       }
      
       System.out.println(Hobbies.size());
       for(WebElement e:Hobbies )
       {
    	   String hobbiestext=e.getText();
    	   if(hobbiestext.equalsIgnoreCase(hobbies))
    	   {
    		  
    		  Actions builder = new Actions(driver);
    	      builder.moveToElement(e).build().perform();
    	      e.click();
    	      e.isSelected();
    	      break;
       }
       }
       
       
 
      
       
       

	   	   
	   JavascriptExecutor js= (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0, 500)");
	   Thread.sleep(5000);
	   
	   
	   Picture.sendKeys(picture);
	   CurrentAddress.sendKeys(currentaddress);
	   
	   
	   Mobile.click();
	   Mobile.sendKeys(number);
       Thread.sleep(5000);
       
	   
	   State.click();
	   StateInput.sendKeys(selectstate);
	   StateInput.sendKeys(Keys.ARROW_DOWN);
	   StateInput.sendKeys(Keys.ENTER);
	   
	   Thread.sleep(5000);
	   City.click();
	   CityInput.sendKeys(selectcity);
	   CityInput.sendKeys(Keys.ARROW_DOWN);
	   CityInput.sendKeys(Keys.ENTER);
	  
	   
	   Submit.click();
	   
   }
   
   
   public void verificationdata(String  expectedstudentname, String  expectedstudentemail , String expectedstudentgender
		  , String expectedstudentmobile, String expectedstudentdob, String expectedstudenthobbies, String expectedstudentaddress, 
		  String expectedstudentstatecity)
   {
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   
	   String studentnametext=  StudentName.getText();
	   Assert.assertEquals(studentnametext, expectedstudentname);
	      
	   String studentemailtext=  StudentEmail.getText();
	   Assert.assertEquals(studentemailtext, expectedstudentemail);
	   
	   String studentgender=  StudentGender.getText();
	   Assert.assertEquals(studentgender, expectedstudentgender);
	   
	   String studentmobile=  StudentMobile.getText();
	   Assert.assertEquals(studentmobile, expectedstudentmobile);
	   
	   String studentdob=  StudentDOB.getText();
	   Assert.assertEquals(studentdob, expectedstudentdob);
	   
	   String studenthobbies=  StudentHobbies.getText();
	   Assert.assertEquals(studenthobbies, expectedstudenthobbies);
	   
	   
	   
	   
	   String studentaddress=  StudentAddress.getText();
	   Assert.assertEquals(studentaddress, expectedstudentaddress);
	   
	   String studentstatecity=  StudentStateCity.getText();
	   Assert.assertEquals(studentstatecity, expectedstudentstatecity);
	   
	   
	   
	   
	   
	   
	   
   }
}
      
      
      

