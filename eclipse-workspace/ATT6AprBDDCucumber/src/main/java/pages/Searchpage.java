package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id ='twotabsearchtextbox']")
	WebElement SearchTextField;


public Searchpage(WebDriver driver)     // here we need to intitalize webelement thats why create constructor
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
public void searchproduct (String product)// this product pass in sendKeys
{
	SearchTextField.sendKeys(product);
}
}