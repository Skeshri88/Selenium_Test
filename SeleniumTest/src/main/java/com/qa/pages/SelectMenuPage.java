package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SelectMenuPage extends TestBase
{
	
	
	//SelectMenu Header xpath
	@FindBy(xpath="//*[@id='content']/h1")
	WebElement selectMenuText;
	
	@FindBy(xpath="//span[@id='speed-button']")
	WebElement selectaSpeed;
	
	@FindBy(xpath="//span[@id='speed-button']")
	List<WebElement> optionsselectaSpeed;
	
	//Selecting a File
	@FindBy(xpath="//span[@id='files-button']")
	WebElement selectaFile;
	
	@FindBy(xpath="//span[@id='files-button']")
	List<WebElement> optionsselectaFile;
	
	
	
	@FindBy(xpath="//span[@id='number-button']")
	WebElement selectaNumber;
	
	@FindBy(xpath="//span[@id='number-button']")
	List<WebElement> optionsselectaNumber;
	
	
	
	
	
	
	@FindBy(xpath="//span[@id='salutation-button']")
	WebElement selectaTitle;
	
	@FindBy(xpath="//span[@id='salutation-button']")
	List<WebElement> optionsselectaTitle;
	
	@FindBy(xpath="//*[text()='Selected Successfully']")
	WebElement MessageValidated;
	
	public void verificationselectmenuText()
	{
		selectMenuText.isDisplayed();
	}
	
	
	public SelectMenuPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void validatedropdown()
	{
		
	}
	
	
	public void VerificationSelectMenu()
	{
		
		if(selectMenuText.isDisplayed())
		{
			System.out.println("Select Menu Text is available");
		}
		
		else 
		{
			System.out.println("Select Menu Text is not available");
		}
	}
	
	
	public void verifylistSelectASpeed()
	{
	
		
	}
	 public void SelectSpeed()
	 {
		 
		 selectaSpeed.click();
		 for(WebElement option :optionsselectaSpeed) 
		 {
			   
			    if (option.getText().equals(prop.getProperty("Select a Speed1")))
			    {
			        option.click();
			        break;  
			      
			    }
		 
	  }
	 }
	 
	 
	 public void SelectFile()
	 {
		 selectaFile.click();
		 for(WebElement option : optionsselectaFile) 
		 {
			    if (option.getText().equals(prop.getProperty("Select a File1"))) 
			    {
			        option.click();
			        break;
			    }
		 
	  }
	 }
	 
		
	 
	 public void SelectNumber()
	 {
		 selectaNumber.click();
		 for(WebElement option : optionsselectaTitle) 
		 {
			    if (option.getText().equals(prop.getProperty("Select a number1")))
			    {
			        option.click();
			        break;
			    }
		 
	  }
		 
		 
		 
	 }
		 
	 
	 public void SelectTitle()
	 {
		 selectaTitle.click();
		 selectaNumber.click();
		 for(WebElement option : optionsselectaTitle) 
		 {
			    if (option.getText().equals(prop.getProperty("Select a title1")))
			    {
			        option.click();
			        break;
			    }
		 
	  }
		 
		 
		
		 
		 
	 }
	 public void verfiyDropDownSelectedMessage()
		{
		 if(MessageValidated.isDisplayed())
		 {
			 System.out.println("Successfully Validated Message");
		 }
		 
		 else 
			 
		 {
			 System.out.println("Successfully not  Validated Message"); 
		 }
			
		}
	 

}

