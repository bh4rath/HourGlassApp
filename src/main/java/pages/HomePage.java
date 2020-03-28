package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Homepage Locators

	By loginLink = By.linkText("Login");

	By signUpLink = By.linkText("Signup");
	
	public LoginPage clickLoginLink() {
		driver.findElement(loginLink).click();
		return new LoginPage(driver);
	}

	public SignUpPage clickSignUpLink() {
		driver.findElement(signUpLink).click();
		return new SignUpPage(driver);
	}
	
	public void isLoginLinkDisplayed() {
		driver.findElement(loginLink).isDisplayed();
	}
	
	public Boolean isSignUpLinkDisplayed() {
		return driver.findElement(signUpLink).isDisplayed();
	}
}
