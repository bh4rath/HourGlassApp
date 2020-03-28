package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By successText = By.xpath("//div[@class='registerSuccess']");
	By loginButton = By.xpath("//button[@type='submit']");
	
	public String getText() {
		return driver.findElement(successText).getText();
	}
	
	By emailTextField = By.id("email");
	By passwordTextField = By.id("password");
	
	public void login(String email,String password) {
		driver.findElement(emailTextField).sendKeys(email);
		driver.findElement(passwordTextField).sendKeys(password);
		driver.findElement(loginButton).click();
	}
}
