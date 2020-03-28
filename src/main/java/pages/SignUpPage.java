package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	
	private WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	//SignUp Page Locators
	
	By nameTextField = By.id("name");
	By emailTextField = By.id("email");
	By passwordTextField = By.id("password");
	By confirmPasswordTextField = By.id("confirmPassword");
	By preferredWorkingTextField = By.id("preferredWorkingHours");
	By registerButton = By.xpath("//button[@type='submit']");
	
	public LoginPage signUp(String name,String email,String password,String confirmpassword
			,String workinghours) {
		driver.findElement(nameTextField).sendKeys(name);
		driver.findElement(emailTextField).sendKeys(email);
		driver.findElement(passwordTextField).sendKeys(password);
		driver.findElement(confirmPasswordTextField).sendKeys(confirmpassword);
		driver.findElement(preferredWorkingTextField).sendKeys(workinghours);
		driver.findElement(registerButton).click();
		return new LoginPage(driver);
	}
}
