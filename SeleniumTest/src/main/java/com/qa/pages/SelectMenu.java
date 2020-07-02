package com.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.base.TestBase;

public class SelectMenu extends TestBase
{
	
	@FindBy(xpath="//div[text()='Select Option']")
	public WebElement SelectValue;
	
	@FindBy(xpath="//input[@id='react-select-2-input']")
	public WebElement SelectValueInput;
	
	@FindBy(xpath="//div[text()='Select Title']")
	public WebElement SelectOne;
	
	@FindBy(xpath="//input[@id='react-select-3-input']")
	public WebElement SelectOneValue;
	
	@FindBy(xpath="//select[@id='oldSelectMenu']")
	public WebElement oldStyle;
	
	@FindBy(xpath="//div[@id='selectMenuContainer']//div[2]//div[@class=' css-1uccc91-singleValue']")
	public WebElement selectedvalue;
	
	@FindBy(xpath="//div[@id='selectMenuContainer']//div[4]//div[@class=' css-1uccc91-singleValue']")
	public WebElement selectedone;
	
	@FindBy(xpath="//select[@id='oldSelectMenu']")
	public WebElement selectedoldstyle;
	
	
	
	
	
	

	
	
	
	
	
	public SelectMenu()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void selectolddropdown(String oldstyle) 
	{
		 oldStyle.click();
		 Select select = new Select(oldStyle);
		 System.out.println(oldstyle);
		 select.selectByVisibleText(oldstyle);		 		 	 
	}
	
	public void selectvaluedropdown(String selectvalue) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SelectValue.click();
		Thread.sleep(5000);
		SelectValueInput.sendKeys(selectvalue);
		SelectValueInput.sendKeys(Keys.ARROW_DOWN);
		SelectValueInput.sendKeys(Keys.ENTER);
		
		 
		 
	}
	
	public void selectonedropdown(String selectone) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 System.out.println(selectone);
		 SelectOne.click();
		 SelectOneValue.sendKeys(selectone);
		 SelectOneValue.sendKeys(Keys.ARROW_DOWN);
		 SelectOneValue.sendKeys(Keys.ENTER);
		 
		 
	}
	
	
	public void verifyselecteddropdown(String expectedselectvalue, String expectedselectedone,  String expectedselectoldstyle)
	{
		 String selectedvaluetext= selectedvalue.getText();
		 Assert.assertEquals(selectedvaluetext, expectedselectvalue);
		 
		 String selectedonetext= selectedone.getText();
		 Assert.assertEquals(selectedonetext, expectedselectedone);
		 
		
		 
		   Select select = new Select(selectedoldstyle); 
	       List<WebElement> options = select.getOptions(); 
	        for(WebElement item:options) 
	        { 
	            String selectedtext=item.getText();
	            if(selectedtext.equalsIgnoreCase(expectedselectoldstyle));
	            {
	            	System.out.println("Old style value selected correctly");
	            }
	         }
		 
		 
	}

	
	

	

}
