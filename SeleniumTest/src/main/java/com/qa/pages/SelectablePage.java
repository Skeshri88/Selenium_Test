package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SelectablePage extends TestBase
{
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
	
	public void clickCrasBtn()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS)
		String CrasBtntext=  CrasBtn.getText();
		CrasBtn.click();
		if(prop.getProperty("CrasBtn1").equalsIgnoreCase(CrasBtntext))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}
	
	
	public void clickdapiBusBtn()
	{
		String DapiBusBtnText=  DapiBusBtn.getText();
		DapiBusBtn.click();
		if(prop.getProperty("DapiBusBtn1").equalsIgnoreCase(DapiBusBtnText))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}
	
	
	public void clickMorbiBtn()
	{
		String MorbiBtnText=  MorbiBtn.getText();
		MorbiBtn.click();
		if(prop.getProperty("MorbiBtn1").equalsIgnoreCase(MorbiBtnText))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}
	
	
	
	
	public void clickPortaBtn()
	{
		String PortaBtnText=  PortaBtn.getText();	
		PortaBtn.click();
		if(prop.getProperty("PortaBtn1").equalsIgnoreCase(PortaBtnText))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}
	
	
	
	
	
	

}
