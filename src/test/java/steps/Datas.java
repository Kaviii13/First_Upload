package steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datas {
	ChromeDriver driver;
	@FindBy(name="q")
	WebElement searchBox;
	@Given("user enter the google")
	public void user_enter_the_google() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
    	driver.get("https://www.google.com/");
	    
	}

	@When("user enter the searching keyWords")
	public void user_enter_the_searching_key_words(DataTable dataTable) throws InterruptedException {
            List<String> asList = dataTable.asList();
            searchBox.sendKeys(asList.get(3));
            for(int i = 0;i<asList.size();i++) {
            	searchBox.clear();
            	searchBox.sendKeys(asList.get(i));
            	Thread.sleep(1000);
            }
	}
	@When("user enter the username and password")
	public void user_enter_the_username_and_password(DataTable dataTable) {
	    List<List<String>> asLists = dataTable.asLists();
	    StepDef s = new StepDef();
	    PageFactory.initElements(driver, this);
	    for(List<String>list : asLists) {
	    	s.username.sendKeys(list.get(0));
	    	s.password.sendKeys(list.get(1));
	    		
	    	}
	    }
	


	@Then("successfully Searched")
	public void successfully_searched() {
	    
	}
	



}
