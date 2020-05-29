package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath="//label[text()='Male']")
    public WebElement GenderMale;
		
	@FindBy(xpath="//input[@id='userNumber']")
    public WebElement Mobile;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
    public WebElement DOB;
		
	@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
    public WebElement Subject;
	
	@FindBy(xpath="//label[text()='Sports']")
    public WebElement Hobbies;
	
	@FindBy(xpath="//input[@id='uploadPicture']")
    public WebElement Picture;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
    public WebElement CurrentAddress;
	
	@FindBy(xpath="//div[text()='Select State']")
    public WebElement State;
	
	
	@FindBy(xpath="//div[@id='city']")
    public WebElement City;
	
		
   public void StudentRegistrationPage()
   {
	PageFactory.initElements(driver, this);
   }
   
   
   
   public void validateRegistrationText()
   {
	   if(StudentRegistrationTxt.isDisplayed())
	   {
		   System.out.println("Test Pass");
	   }
	   
	   else
		   
	   {
		   System.out.println("Test Fail");
	   }
   }
   
   
   
   public void FirstNameEnter()
   {
	   FirstName.sendKeys(prop.getProperty("FirstName"));   
   }
   
   public void LastNameEnter()
   {
	   LastName.sendKeys(prop.getProperty("LastName"));
   }
   
   public void EmailEnter()
   {
	   Email.sendKeys(prop.getProperty("Email"));
   }
   
   public void MaleClick()
   {
	   GenderMale.click();
   }
   
   public void MobileNumberEnter()
   {
	   Mobile.sendKeys(prop.getProperty("Mobile"));
   }
   
   public void DOBSelection()
   {
	   DOB.sendKeys(prop.getProperty("DOB"));
   }
   
   public void SubjectEnter()
   {
	   Subject.sendKeys(prop.getProperty("Sujects"));
   }
   
   public void HobbiesClick()
   {
	   Hobbies.click();
   }
   
   
   public void pictureSelect()
   {
	   
   }
   
   public void CurrentAddressEnter()
   {
	   CurrentAddress.sendKeys(prop.getProperty("CurrentAddress"));
   }
   
   public void  StateandCitySelect()
   {
	   State.click();
	   
	   
   }
   
   
   
   
   
   
	
	
      
      
      
}
