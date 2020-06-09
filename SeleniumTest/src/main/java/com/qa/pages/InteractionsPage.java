package com.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class InteractionsPage extends TestBase
{
	
	@FindBy(xpath="//li[@id='item-1']//span[text()='Selectable']")
	public WebElement SelectableEle;
	
	@FindBy(xpath="//span[text()='Droppable']")
	public WebElement DroppableBtn;
	
	
	
	public InteractionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public SelectablePage clickselectable()
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(SelectableEle));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", SelectableEle);
		return new SelectablePage();
	}
	
	public DroppablePage clickdroppable()
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(DroppableBtn));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", DroppableBtn);
		return new DroppablePage();
	}
	
	

}
