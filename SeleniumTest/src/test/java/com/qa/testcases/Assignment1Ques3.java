package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactHomePage;
import com.qa.pages.ContactPage;
import com.qa.pages.DroppablePage;
import com.qa.pages.HomePage;

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
		homepage.clickonDroppable();
		
		DroppablePage droppablepage= new DroppablePage();
		droppablepage.verifyDraggableText();
		droppablepage.OperationDrag();
		droppablepage.VerificationDropedText();
		
		
		
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}

}

