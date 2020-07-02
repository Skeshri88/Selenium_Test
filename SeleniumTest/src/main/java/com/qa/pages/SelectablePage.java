package com.qa.pages;

import java.util.List;
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
	
	
	@FindBy(xpath="//ul[@id='verticalListContainer']//li")
	public List<WebElement> AllSelectedBtnVerify;
	
	
	
	public SelectablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifySelectableTxt(String expectedvalselectabletxt)
	{
		String selectabletext=  SelectableTxt.getText();
		Assert.assertEquals(selectabletext, expectedvalselectabletxt);	
	}
	
	public void verifylistselected(String expectedlisttext)
	
	{
		String listtext=  listselected.getText();
		Assert.assertEquals(listtext, expectedlisttext);
		
		
		
	}
	
	public void clickCrasBtn(String expectedcrastext)
	{		
		String CrasBtntext=  CrasBtn.getText();
		CrasBtn.click();
		CrasBtn.isSelected();		
		Assert.assertEquals(CrasBtntext, expectedcrastext);		
		
	}
	
	
	public void clickdapiBusBtn(String expecteddapitext)
	{
		String DapiBusBtnText=  DapiBusBtn.getText();
		DapiBusBtn.click();
		DapiBusBtn.isSelected();
		Assert.assertEquals(DapiBusBtnText, expecteddapitext);
		
	}
	
	
	public void clickMorbiBtn(String expectedmorbitext)
	{
		String MorbiBtnText=  MorbiBtn.getText();
		MorbiBtn.click();
		MorbiBtn.isSelected();
		Assert.assertEquals(MorbiBtnText, expectedmorbitext);
		
		
		
	}
		
	
	public void clickPortaBtn(String expectedportatext)
	{
		String PortaBtnText=  PortaBtn.getText();	
		PortaBtn.click();
		PortaBtn.isSelected();		
		Assert.assertEquals(PortaBtnText, expectedportatext);
		
	}
	
	public void verifyallselectedbutton()
	{
		for(WebElement e:AllSelectedBtnVerify )
		{
			e.isDisplayed();
		}
	}
	
	
	
	
	
	

}
