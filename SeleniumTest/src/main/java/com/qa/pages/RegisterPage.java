package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class RegisterPage  extends TestBase
{
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][password]']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[password][confirm]']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")
	WebElement DayBirthDay;
	
	@FindBy(xpath="//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")
	WebElement DayMonth;
	
	@FindBy(xpath="//Select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")
	WebElement DayYear;
	
	@FindBy(xpath="//input[@id='phdesktopbody_0_submit']")
	WebElement Register;
	
	@FindBy(xpath="//*[text()='Suceesfull Registration...Please login to continue']")
	WebElement SuccessfullRegistration;
	
	
	
	
	//Second Url
		@FindBy(xpath="//h1[text()='Erstellen Sie Ihr Olaz Konto']")
		WebElement TextPage;
		
		@FindBy(xpath="//img[@id='phdesktopbody_0_imgfemale']")
		WebElement Female1;
		
		@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[firstname]']")
		WebElement FirstName1;
		
		@FindBy(xpath="//input[@id='phdesktopbody_0_grs_consumer[lastname]']")
		WebElement LastName1;
		
		@FindBy(xpath="//select[@id='phdesktopbody_0_labelgrs_account[addresses][0][country]']")
		WebElement Country1;
		
		@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][line1]']")
		WebElement Address1;
		
		@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']")
		WebElement Post1;
		
		@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][city]']")
		WebElement City1;
		
		//Third Url
		@FindBy(xpath="//input[@id='phdesktopbody_0_labelgrs_consumer[secondary_lastname]']")
		WebElement MiddleName;
		
		@FindBy(xpath="//input[@id='phdesktopbody_0_grs_account[phones][0][fulltelephonenumber]']")
		WebElement PhoneNumber;
		
		@FindBy(xpath="//input[@id='phdesktopbody_0_ctl74']")
		WebElement Privacy;
		
		
		
		
	
	public void RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void RegisterwithFields() 
	{
		Email.sendKeys(prop.getProperty("EmailId1"));
		Password.sendKeys(prop.getProperty("Password1"));
		ConfirmPassword.sendKeys(prop.getProperty("ConfirmPassword1"));
		
		//Selecting Day
		DayBirthDay.click();
		Select select= new Select(DayBirthDay);
		select.selectByVisibleText(prop.getProperty("BirthDay1"));
		
		//Selecting Month
		DayMonth.click();
		Select select1= new Select(DayMonth);
		select.selectByVisibleText(prop.getProperty("BirthMonth1"));
		
		//Select Year
		DayYear.click();
		Select select2= new Select(DayYear);
		select.selectByVisibleText(prop.getProperty("BirthYear1"));
		
		
		
		
		String urlName = prop.getProperty("url");
		if(urlName.equals("https://www.olaz.de/de-de"))
		{
			Female1.click();
			FirstName1.sendKeys(prop.getProperty("FirstName1"));
			LastName1.sendKeys(prop.getProperty("LastName1"));
			//Thread.sleep(5000);
			Country1.click();
			//Thread.sleep(2000);
			Select select4= new Select(Country1);
			select4.selectByVisibleText(prop.getProperty("Country11"));
			//Thread.sleep(5000);
			Address1.sendKeys(prop.getProperty("Address1"));
			Post1.sendKeys(prop.getProperty("Post1"));
			City1.sendKeys(prop.getProperty("City1"));
			
			
		}
		
		else  if(urlName.equals("https://www.olay.es/es-es"))
		{
			MiddleName.sendKeys(prop.getProperty("MiddleName1"));
			PhoneNumber.sendKeys(prop.getProperty("PhoneNumber1"));
			Privacy.click();
		}
		
		else 
		{
			Register.click();
		}
		
		
	}
	
	public void verifySuccessfullRegistration()
	{
		if(SuccessfullRegistration.isDisplayed())
		{
			System.out.println("Its successfully registered");
		}
		
		else 
		{
			System.out.println("Successfully not  registered");
		}
	}
	
		
		
		
		
		
	}



