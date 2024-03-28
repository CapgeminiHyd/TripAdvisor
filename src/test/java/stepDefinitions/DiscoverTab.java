package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DiscoverTab {
	
	WebDriver driver=new ChromeDriver();
	
//	@Given("I am on ixigo website")
//	public void i_am_on_ixigo_website() throws AWTException {
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
//		driver.get("https://www.ixigo.com/");
//		Robot robo=new Robot();
//		robo.keyPress(KeyEvent.VK_ESCAPE);
//		robo.keyRelease(KeyEvent.VK_ESCAPE);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
//	}
//
//	@When("I click on Log in\\/Sign up")
//	public void i_click_on_log_in_sign_up() {
//		
//		driver.findElement(By.xpath("//div[contains(@class,'h-40 w-40')]/following-sibling::button")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
//	}
//
//	@When("I enter my mobile number as {string}")
//	public void i_enter_my_mobile_number_as(String string) {
//		driver.findElement(By.cssSelector("input[placeholder='Enter Mobile Number']")).sendKeys(string);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
//		driver.findElement(By.xpath("//button[text()='Continue']")).click();
//		
//	}
//
//	@When("I enter otp to verify")
//	public void i_enter_otp_to_verify() {
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		WebElement verify=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Verify']"))));
//		verify.click();
//	}
//
//	@Then("I should be logged in succesfully")
//	public void i_should_be_logged_in_succesfully() {
//		
//	}
	
	@Given("I am on ixigo homepage")
	public void i_am_on_ixigo_homepage() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		driver.get("https://www.ixigo.com/");
	   
	}

	@When("I enter From as {string}")
	public void i_enter_from_as(String string) {
		WebElement fRom= driver.findElement(By.xpath("//input[contains(@class,'outline-none w-full')]"));
		fRom.sendKeys(string);
	}

	@When("I enter To as {string}")
	public void i_enter_to_as(String string) {
		WebElement to= driver.findElement(By.xpath("//label[text()='To']/following::input"));
		to.sendKeys(string);
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be able to view all the flights available")
	public void i_should_be_able_to_view_all_the_flights_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
