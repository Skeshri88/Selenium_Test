package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DroppablePage extends TestBase
{
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement DroppableText;
	
	
	@FindBy(xpath="//div[@id='draggable']")
	WebElement DragMe;
	
	@FindBy(xpath="//div[@id='droppable']")
	WebElement DropMe;
	
	@FindBy(xpath="//p[text()='Dropped!']")
	WebElement Dropped;
	
	
	
	
	
	
	public DroppablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyDraggableText()
	{
		DroppableText.isDisplayed();
	}
	
	public void OperationDrag()
	{
		Actions actions= new Actions(driver);
		actions.dragAndDrop(DragMe,DropMe ).perform();
		
   }
	
	public void VerificationDropedText()
	{
		
		String text2= Dropped.getText();
		System.out.println(text2);
		
		if(prop.getProperty("text").equalsIgnoreCase(text2))
		{
			System.out.println("Its dragged from one section to other");
		}
		
		else
		{
			System.out.println("Its not dragged from one section to other");
		}
				

	}
}
