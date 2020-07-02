package com.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class MMTHomePage extends TestBase
{
	
	@FindBy(xpath="//li[@data-cy='oneWayTrip']")
	 public WebElement OneWayRadioButtonSelected;

	
	@FindBy(xpath="//label[@for='fromCity']")
	 public WebElement From;
	
	
	@FindBy(xpath="//input[@placeholder='From']")
	 public WebElement FromField;
	
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement  ToField;
	
	@FindBy(xpath="//label[@for='departure']")
	public WebElement Departure;
	
	@FindBy(xpath="//span[@aria-label='Next Month']")
	public WebElement MonthYearArrow;
	
	@FindBy(xpath="//div[@class='DayPicker-Months']//div[1]//div[@class='DayPicker-Caption']//div[1]")
	public WebElement MonthYearValue;
	
	@FindBy(xpath="//div[@class='DayPicker-Months']//div[2]//div[3]//div[@class='dateInnerCell']//p[1]")
	public List<WebElement> Day;
	
	
	
	@FindBy(xpath="//a[text()='Search']")
	public WebElement Search;
	
	
	
	public MMTHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void onewayradioselected()
	{
		OneWayRadioButtonSelected.isDisplayed();		
	}
	
	
	public void  EnterFromField(String from,String to) throws InterruptedException
	{
		
		Thread.sleep(5000);
		From.click();
		FromField.sendKeys(from);
		FromField.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		FromField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		Thread.sleep(10000);
		ToField.sendKeys(to);
		ToField.sendKeys(Keys.ARROW_DOWN);
		ToField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
	public void selectmonthyearday(String monthyearvalue) 
	{	
		try
		{
		while(true)
		{
			String monthyeartext=  MonthYearValue.getText();
			System.out.println(monthyeartext);
			MonthYearArrow.click();
			if(!(monthyeartext.equalsIgnoreCase(monthyearvalue)))
			{				
				break;
			}			
			
		}			
		}
		catch(Exception e)
		{
			
		}			
	}
	
	
	public void dayselection(String dayvalue)
	{
		for (WebElement e:Day)
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			String daytext= e.getText();
			System.out.println(daytext);
			if(daytext.equalsIgnoreCase(dayvalue))
			{
				e.click();
			}
		}
	}

	
	public MMTFlightDetailsPage clicksearch()
	{	
		Search.click();
		return new MMTFlightDetailsPage();
	
}

}


