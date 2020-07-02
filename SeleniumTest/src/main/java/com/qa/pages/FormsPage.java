package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class FormsPage extends TestBase
{
	@FindBy(xpath="//span[text()='Practice Form']")
    public WebElement PractciseForm;
	
	
	public FormsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public StudentRegistrationPage clickPracticseForm()
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(PractciseForm));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", PractciseForm);
		return new StudentRegistrationPage();
	}

}
