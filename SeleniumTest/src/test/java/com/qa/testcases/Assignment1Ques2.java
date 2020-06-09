package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.FormsPage;
import com.qa.pages.HomePage;
import com.qa.pages.InteractionsPage;
import com.qa.pages.StudentRegistrationPage;
import com.qa.util.TestUtil;

public class Assignment1Ques2 extends TestBase
{
	String sheetName= "Assignment2";
	public Assignment1Ques2()
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

	
	
	
	public void VerificationContactTest(String firstname,String lasttname,String email,
			    String picture,
			   String currentaddress,String selectstate,String selectcity) throws InterruptedException 
	{  
		HomePage homepage= new HomePage();
		homepage.clickformBtn();
		
		
		FormsPage formspage= new FormsPage();
		formspage.clickPracticseForm();
		
		StudentRegistrationPage studentregistrationpage= new StudentRegistrationPage();
		
		studentregistrationpage.registrationdetails(firstname, lasttname, email, 
				picture, currentaddress, selectstate, selectcity);				
	}
		
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}
	
	
	
	

}

