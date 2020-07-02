package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DroppablePage;
import com.qa.pages.HomePage;
import com.qa.pages.InteractionsPage;
import com.qa.pages.SelectablePage;
import com.qa.util.TestUtil;

public class Assignment1Ques1 extends TestBase
{
	String sheetName= "Assignment1";
	public Assignment1Ques1()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@DataProvider
	public Object[][]  getTestData()
	{
	  Object data[][]=TestUtil.getTestData(sheetName);
	  return data;
   }
	
	@Test(dataProvider="getTestData")
	public void verificationSelectable(String expectedvalselectabletxt, String expectedlisttext, String expectedcrastext, 
			String expecteddapitext, String expectedmorbitext, String expectedportatext)
	{
		HomePage homepage= new HomePage();
		homepage.clickInteractionBtn();
		
		InteractionsPage interactionspage= new InteractionsPage();
		interactionspage.clickselectable();
		
			
			
		SelectablePage selectablepage= new SelectablePage();
		selectablepage.verifySelectableTxt(expectedvalselectabletxt);
		selectablepage.verifylistselected(expectedlisttext);
		selectablepage.clickCrasBtn(expectedcrastext);
		selectablepage.clickdapiBusBtn(expecteddapitext);
		selectablepage.clickMorbiBtn(expectedmorbitext);
		selectablepage.clickPortaBtn(expectedportatext);
		selectablepage.verifyallselectedbutton();
			
		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}


}
