package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;

public class WidgetsPage extends TestBase
{
	@FindBy(xpath="//span[text()='Date Picker']")
    public WebElement DatePicker;
	
	@FindBy(xpath="//span[text()='Select Menu']")
    public WebElement SelectMenu;
		
	
	public  WidgetsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public DatePickerPage clickwidgetBtn()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		DatePicker.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		return new DatePickerPage();
	}
	
	
	
	
	public SelectMenu selectmenubtn()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		SelectMenu.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		return new SelectMenu();
	}
		
	

}
