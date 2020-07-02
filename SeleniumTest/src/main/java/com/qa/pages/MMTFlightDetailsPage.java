package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class MMTFlightDetailsPage extends TestBase
{
	
	@FindBy(xpath="//div[@id='fli_list_item_0c27e5a5-552e-48e7-99be-d194797e4d64']//div[@class='dept-options']//button[@class='ViewFareBtn  text-uppercase ']")
	WebElement ViewFares;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/button")
	WebElement BookNow;
	
	
	public MMTFlightDetailsPage()
	{
		
		PageFactory.initElements(driver,this);
	}
	


	public MMTReviewPage FlightDetails() throws InterruptedException 
	{
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement viewfaresbtn= wait.until(ExpectedConditions.elementToBeClickable(ViewFares));
		viewfaresbtn.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		WebElement booknowbtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fli_list_item_0c27e5a5-552e-48e7-99be-d194797e4d64\"]/div[3]/div[1]/div[2]/div[2]/div[2]/button")));
		viewfaresbtn.click();	
		booknowbtn.click();
		String parentwindow= driver.getWindowHandle();
		System.out.println("ParentWindow handle is"+  parentwindow );
		
		for(String Childwindow:driver.getWindowHandles())
		{
			driver.switchTo().window(Childwindow);
		}
		System.out.println(driver.getTitle());
		
		return new  MMTReviewPage();	
		
	}

}

