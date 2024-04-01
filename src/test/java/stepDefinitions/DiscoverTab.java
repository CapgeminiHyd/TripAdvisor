package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory.Scenarios;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DiscoverTab {
	
	
	WebDriver driver;
	
	
	@Given("I am on ixigo website")
	public void i_am_on_ixigo_website() throws AWTException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		driver.get("https://www.ixigo.com/");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ESCAPE);
		robo.keyRelease(KeyEvent.VK_ESCAPE);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
	}

	@When("I click on Log in\\/Sign up")
	public void i_click_on_log_in_sign_up() {
		Scenarios sc=new Scenarios(driver);
		sc.loginSignup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
	}

	@When("I enter my mobile number as {string}")
	public void i_enter_my_mobile_number_as(String string) {
		Scenarios sc=new Scenarios(driver);
		sc.mobile(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		
	}

	@When("I click on continue")
	public void i_click_on_continue() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		Scenarios sc=new Scenarios(driver);
		sc.continueclick();
	}

	@Then("I should be logged in succesfully")
	public void i_should_be_logged_in_succesfully() {
		
	}
	
	@Then("I should see an error that mobile number is invalid")
	public void i_should_see_an_error_that_mobile_number_is_invalid() {
	    
	}


	
	@Given("I am on ixigo homepage")
	public void i_am_on_ixigo_homepage() throws AWTException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-geolocation");
		
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();	
		driver.get("https://www.ixigo.com/");

	}

	@When("I enter destination in From")
	public void i_enter_destination_in_from(){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement fRom=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flex items-center ']")));
		fRom.click();
		System.out.println("fRom clicked");
		WebElement fromDrop = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='BLR']"))));
		fromDrop.click();
	    
	}

	@When("I enter destination in To")
	public void i_enter_destination_in_to() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'flex-1 h-full')])[2]")));
		to.click();
		WebElement toField = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/input"))));
		Actions action = new Actions(driver);
		action.sendKeys(toField,"MAA").build().perform();
		WebElement toDrop = driver.findElement(By.xpath("(//span[text()='Chennai'])[2]"));
		toDrop.click();
	}



	@When("I click on search button")
	public void i_click_on_search_button() {
		Scenarios sc=new Scenarios(driver);
		sc.clickSearch();
		
	}

	@Then("I should be able to view all the flights available oneway")
	public void i_should_be_able_to_view_all_the_flights_available_oneway() {
	   
	}

	@When("I click on RoundTrip")
	public void i_click_on_round_trip() {
		Scenarios sc=new Scenarios(driver);
		sc.roundTripSearch();
	}
	@Then("I should be able to view all the flights avaialble Roundtrip")
	public void i_should_be_able_to_view_all_the_flights_avaialble_roundtrip() {
	    
	}
	
	
	@Given("I scroll down to popular domestic airlines")
	public void i_scroll_down_to_popular_domestic_airlines() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 1650)");
	}

	@When("I click on vistara flights")
	public void i_click_on_vistara_flights() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement vistaraElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Vistara")));
	        vistaraElement.click();
	}

	@When("I scroll down the window")
	public void i_scroll_down_the_window() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 650)");
	}

	@When("I click on Vistara flight status details")
	public void i_click_on_vistara_flight_status_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement vistaraFlightStatusLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Vistara Flight Status")));
        vistaraFlightStatusLink.click();
	}

	@Then("I should be able to know the details of status of the vistara flight")
	public void i_should_be_able_to_know_the_details_of_status_of_the_vistara_flight() {
	   
	}

}
