package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class InteractionsPage extends TestBase
{
	
	@FindBy(xpath="//span[text()='Selectable']")
	public WebElement SelectableEle;
	
	public void InteractionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SelectablePage clickselectable()
	{
		SelectableEle.click();
		return new SelectablePage();
	}
	

}
