package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;



public class TestLogin {
public WebDriver driver;
public LoginPage lp;
	
	
	
	@Given("User launch the application.")
	public void user_launch_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		lp= new LoginPage(driver);
		
	}

	@When("User redirect to the url {string}")
	public void user_redirect_to_the_url(String string) {
	    driver.get(string);
	}

	@When("User enter the email as {string} and password as {string}")
	public void user_enter_the_email_as_and_password_as(String email, String pass) {
		lp.enterEmail(email);
		lp.enterPass(pass);
	}

	@And("Click on login button")
	public void click_on_login_button() {
	lp.clickOnLogin();
	}

	@Then("User will be on Homepage")
	public void user_will_be_on_homepage() {
	   String actualTitle = driver.getTitle();
	   assertEquals(actualTitle, "Dashboard / nopCommerce administration");
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
	    lp.clickOnLogout();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}

}
