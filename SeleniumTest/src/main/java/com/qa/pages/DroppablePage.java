package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DroppablePage extends TestBase
{
	@FindBy(xpath="//div[@id='draggable']")
	public WebElement Dragme;
	
	@FindBy(xpath="//div[@id='droppable']")
	public WebElement Drophere;
	
	@FindBy(xpath="//p[text()='Dropped!']")
	public WebElement DroppedVerification;
	
	
	public  DroppablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void DragandDrop()
	{
		Actions act= new Actions(driver);
		act.dragAndDrop(Dragme, Drophere).build().perform();
		//act.clickAndHold(Dragme).moveToElement(Drophere).release(Drophere).build().perform();
		
	}
	
	public void verifyDropped()
	{
		if(DroppedVerification.isDisplayed())
		{
			System.out.println("Test Pass");
		}
		
		else
			
		{
			System.out.println("Test Fail");
		}
	}
	
	

}
