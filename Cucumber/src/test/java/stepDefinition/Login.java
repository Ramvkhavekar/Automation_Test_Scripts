package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public WebDriver driver;
	@Given("open the browser and enter the test url")
	public void open_the_browser_and_enter_the_test_url() {
	   WebDriverManager.firefoxdriver().setup();
	   driver=new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com/");
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() {
	   String title = driver.getTitle();
	   Assert.assertEquals(title,"Facebook – log in or sign up");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   driver.findElement(By.name("email")).sendKeys("Ram");
	   driver.findElement(By.name("pass")).sendKeys("Ram@123");
	}

	@When("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.name("login")).click();
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Facebook");
	}

}
