package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SelectablePage extends TestBase

{
	public String text;
	
	
	//Customized Xpath of all element
	@FindBy(xpath="//li[@class='ui-widget-content ui-selectee']")
    public List<WebElement> AllItemList;
	
	//Xpath of Selectable Text
	@FindBy(xpath="//*[@id=\"content\"]/h1")
    public WebElement SelectableText;
	
	
	//Page factory of Initialized elements
	public SelectablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Getting count of Item
	public void ClickAllItemList()
	{
		int count= AllItemList.size();
		System.out.println(count);	
		
	
		
		    //How to get this text item from config.property and verify the values
			 
			 
			 for (WebElement count1: AllItemList)
				{  
					String text=count1.getText();
					System.out.println(text);
					count1.click();	
					if(prop.getProperty("A")==text)
					{
						System.out.println("Test Pass");
					}
					
					else
					{
						System.out.println("Test Fail");
					}
					
				}
			 
			 
			 
		}
		
		
		
		

	
	
	public void VerifySelectableText()
	{
		if( SelectableText.isDisplayed())
		{
			System.out.println("Selectable Text is available");
		}
		
		else
		{
			System.out.println("Selectable Text is not available");
		}
		
	}
	

}

