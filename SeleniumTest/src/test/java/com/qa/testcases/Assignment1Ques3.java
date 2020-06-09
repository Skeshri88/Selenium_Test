package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DroppablePage;
import com.qa.pages.HomePage;
import com.qa.pages.InteractionsPage;

public class Assignment1Ques3 extends TestBase
{
	public Assignment1Ques3()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@Test
	public void VerificationDroppableTest() throws InterruptedException
	{
		HomePage homepage= new HomePage();
		homepage.clickInteractionBtn();
		
		InteractionsPage   interactionspage= new InteractionsPage();
		interactionspage.clickdroppable();
		
		
		DroppablePage droppablepage = new DroppablePage();
		droppablepage.DragandDrop();
		droppablepage.verifyDropped();		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}

}

