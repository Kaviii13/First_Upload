package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	ChromeDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement loginButton;
	
	
	
	@Given("user enter the url")
	public void user_enter_the_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
    	driver.get("https://www.facebook.com/");
	    
	}

	@When("user enter the username")
	public void user_enter_the_username() {
		username.sendKeys("kavi@gmail.com");
	    
	}

	@When("user enter the password")
	public void user_enter_the_password() {
		password.sendKeys("1234");
	    
	}

	@When("user click the button")
	public void user_click_the_button() {
	    loginButton.click();
	}

	@Then("successfully entered the homepage")
	public void successfully_entered_the_homepage() {
	    
	}
	
	@When("user enter the username {string}")
	public void user_enter_the_username(String string) {
	  username.sendKeys(string);
	}
	@When("user enter the password {string}")
	public void user_enter_the_password(String string) {
	    password.sendKeys(string);
	}


	

}
