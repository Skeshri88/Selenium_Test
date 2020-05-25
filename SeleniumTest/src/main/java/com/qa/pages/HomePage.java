package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath="//a[@href='https://demoqa.com/selectable/']")
	WebElement selectablButton;
	
	
	@FindBy(xpath="//a[@href='https://demoqa.com/html-contact-form/']")
	WebElement contactclick;
	
	@FindBy(xpath="//a[text()='Droppable']")
	WebElement Droppable;
	
	@FindBy(xpath="//a[text()='Datepicker']")
	WebElement DatePicker;
	
	@FindBy(xpath="//a[text()='Selectmenu']")
	WebElement SelectMenu;
	
	
	@FindBy(xpath="//a[text()='Controlgroup']")
	WebElement ControlGroup;
	
	
	public HomePage()
	{
		//Initializing all above elements 
		PageFactory.initElements(driver,this);
	}
	
	
	public SelectablePage clickonselectablelink()
	{
		selectablButton.click();
		return new SelectablePage();
	}
	
	


	public  ContactPage clickonContact() throws InterruptedException
	{
		Thread.sleep(5000);
		contactclick.click();
		Thread.sleep(5000);;
		return  new ContactPage();
	}
	
	public  DroppablePage clickonDroppable()
	{
		Droppable.click();	
		return  new DroppablePage();
	}
	
   public DatePickerPage clickDatePicker()
   {
	   DatePicker.click();
	   return new DatePickerPage();
   }
	   
   public SelectMenuPage selectmenu()
   
   {
	   SelectMenu.click();
	    return new SelectMenuPage();
   }
   
public ControlGroup clickControlGroup()
   
   {
	    ControlGroup.click();
	    return new ControlGroup();
   }

}
