package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement loginBtn;
	
	@FindBy(linkText="Logout")
	WebElement logOut;
	
	
	public void enterEmail(String addEmail) {
		email.clear();
		email.sendKeys(addEmail);
	}
	
	public void enterPass(String Pass) {
		password.clear();
		password.sendKeys(Pass);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
	public void clickOnLogout() {
		logOut.click();
	}

}
