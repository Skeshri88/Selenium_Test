package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath="//button[@id='closeLargeModal']")
    public WebElement DetailsPopupClose;
	
	
		
   public StudentRegistrationPage()
   {
	PageFactory.initElements(driver, this);
   }
   
   
   
   
	   
  
   
   public void registrationdetails(String firstname,String lastname,String email
		   , String picture,
		   String currentaddress,String selectstate,String selectcity) 
   {
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   FirstName.sendKeys(firstname);	   
	   LastName.sendKeys(lastname);
	   Email.sendKeys(email);
	   GenderMale.click();
	   Hobbies.click();
	   Picture.click();
	   Picture.sendKeys(picture);
	   CurrentAddress.sendKeys(currentaddress);
	   
	   State.click();
	   Select state= new Select(State);
	   state.selectByValue(selectstate);
	   
	   City.click();
	   Select city= new Select(City);
	   state.selectByValue(selectcity);
	   DetailsPopupClose.click();
	   
   }
}
      
      
      

