package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;

public class HomePage extends TestBase
{
	
	@FindBy(xpath="//div[@class='category-cards']//div[5]")
     public WebElement InteractionBtn;
	
	@FindBy(xpath="//h5[text()='Forms']")
    public WebElement FormsBtn;
	
	@FindBy(xpath="//div[@class='category-cards']//div[4]")
    public WebElement WidgetsBtn;
	
	
	
	
	public  HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public InteractionsPage clickInteractionBtn()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		InteractionBtn.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		return new InteractionsPage();
	}
		
	
	public FormsPage clickformBtn()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		FormsBtn.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		return new FormsPage();
	}
	
	
	public DatePickerPage clickwidgetBtn()
	{
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		WidgetsBtn.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		return new DatePickerPage();
		
	}
	 
	

}
