package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath = "//*[@id = 'nav-cart']")
	WebElement cartIcon;
	
	@FindBy(xpath = "//*[@class='a-carousel-card']//img[@alt= 'Unrec - Hero']")
	WebElement dealsection;
	
	@FindBy(xpath= "//*[@class='a-section a-spacing-none']//*[text()='Alexa Skills']")
	WebElement KitchenSection;
	
	WebDriverWait wait; // here we import WebDriverWait
	
	public HomePage(WebDriver driver)     // here we need to intitalize webelement thats why create constructor
	{
		this.driver= driver;
		PageFactory.initElements(driver, this); // here we intitalize the element in 'this' object
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));// if we do not have this object then we will get null pointer exception
	}
	
	
	
	public String getTtileOfPage()
	{
		String TitleOfPage = driver.getTitle(); //import getTitle
		return TitleOfPage;
	}
	
	public boolean isCartIconDisplayed()
	{
		boolean isDisplaying= cartIcon.isDisplayed(); // here we call isDisplayed method and if cartIcon is true then it will execute
	           return isDisplaying;          
	}
	
	public void checkoutDealSection()
	{
	
	   wait.until(ExpectedConditions.visibilityOf(dealsection)); // here we add condtion for dealsection method
               //dealsection.click(); 
	   JavascriptExecutor js =    (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();", dealsection);
	}
	
	public boolean KitchenSection()
	{
		wait.until(ExpectedConditions.visibilityOf(KitchenSection));
		    boolean isDisplay = KitchenSection.isDisplayed();
		    return isDisplay;
	}
	

}
