package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class SelectablePage extends TestBase
{
	
	@FindBy(xpath="//div[text()='Selectable']")
	public WebElement SelectableTxt;
	
	@FindBy(xpath="//a[@id='demo-tab-list']")
	public WebElement listselected;
	
	@FindBy(xpath="//li[text()='Cras justo odio']")
	public WebElement CrasBtn;
	
	@FindBy(xpath="//li[text()='Dapibus ac facilisis in']")
	public WebElement DapiBusBtn;
	
	@FindBy(xpath="//li[text()='Morbi leo risus']")
	public WebElement MorbiBtn;
	
	
	@FindBy(xpath="//li[text()='Porta ac consectetur ac']")
	public WebElement PortaBtn;
	
	
	public SelectablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifySelectableTxt(String expectedvalue)
	{
		String selectabletext=  SelectableTxt.getText();
		Assert.assertEquals(selectabletext, expectedvalue);	
	}
	
	public void verifylistselected(String expectedvalue)
	
	{
		String listtext=  listselected.getText();
		Assert.assertEquals(listtext, expectedvalue);
		listselected.isSelected();
		
		
	}
	
	public void verifylistTxt(String expectedvalue)
	{
		String selectabletext=  SelectableTxt.getText();
		Assert.assertEquals(selectabletext, expectedvalue);	
	}
	
	
	public void clickCrasBtn(String expectedvalue)
	{		
		String CrasBtntext=  CrasBtn.getText();
		CrasBtn.click();
		Assert.assertEquals(CrasBtntext, expectedvalue);		
		
	}
	
	
	public void clickdapiBusBtn(String expectedvalue)
	{
		String DapiBusBtnText=  DapiBusBtn.getText();
		DapiBusBtn.click();
		Assert.assertEquals(DapiBusBtnText, expectedvalue);
		
	}
	
	
	public void clickMorbiBtn(String expectedvalue)
	{
		String MorbiBtnText=  MorbiBtn.getText();
		MorbiBtn.click();
		Assert.assertEquals(MorbiBtnText, expectedvalue);
		
		
		
	}
		
	
	public void clickPortaBtn(String expectedvalue)
	{
		String PortaBtnText=  PortaBtn.getText();	
		PortaBtn.click();
		Assert.assertEquals(PortaBtnText, expectedvalue);
		
	}
	
	
	
	
	
	

}
