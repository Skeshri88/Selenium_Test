package com.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.base.TestBase;

public class DatePickerPage extends TestBase
{
	@FindBy(xpath="//div[text()='Select Date']")
	public WebElement SelectDateValidation;
	
	@FindBy(xpath="//input[@id='datePickerMonthYearInput']")
	public WebElement DateField;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	public WebElement YearDropDown;
		
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	public WebElement MonthDropdown;
	
	@FindBy(xpath="//div[@role='option']")
	public List<WebElement> DayValue;
	
	@FindBy(xpath="//input[@id='datePickerMonthYearInput']")
	public WebElement CalenderDate;
	

	
	public DatePickerPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectdateValiadtion()
	{
		if(SelectDateValidation.isDisplayed())
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	}
	
	
	
	
	public void enterDate(String year,String month, String day)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		DateField.click();
			
		
		
		MonthDropdown.click();
		Select monthselect = new Select(MonthDropdown);
		monthselect.selectByVisibleText(month);
		
		
		YearDropDown.click();
		Select yearselect = new Select(YearDropDown);
		yearselect.selectByVisibleText(year);
		
		
		
		System.out.println(DayValue.size());
	    for ( WebElement e:DayValue)
	    {
	    	String daytext= e.getText();
	    	if(daytext.equalsIgnoreCase(day))
	    	{
	    		e.click();
	    		break;
	    	}
	    }
				
	}
	
	
	public void verificationDate(String date)
	{
		String datetext= CalenderDate.getAttribute("value");
		System.out.println(datetext);
		Assert.assertEquals(datetext, date);
	}


	}
