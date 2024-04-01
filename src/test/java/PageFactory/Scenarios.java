package PageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenarios {
	
	WebDriver driver;
	public Scenarios(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//div[contains(@class,'h-40 w-40')]/following-sibling::button")
	WebElement login;
	
	@FindBy(css="input[placeholder='Enter Mobile Number']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//button[contains(text(),'Search')]")
	WebElement search;
	
	@FindBy(xpath="//button[@role='tab' and contains(., 'Round Trip')]")
	WebElement roundtrip;
	
	public void loginSignup() {
		login.click();
	}
	
	public void mobile(String string){
		mobilenumber.sendKeys(string);
		
	}
	
	public void continueclick() {
		continueButton.click();
	}
	
	public void clickSearch() {
		search.click();
	}
	
	public void roundTripSearch() {
		roundtrip.click();
	}
	
	
	
	
	
}