package hourglass;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.LoginPage;
import pages.SignUpPage;

public class TestSignup extends BaseTest {

	@Test
	public void signUpTest() {
		SignUpPage signuppage = homepage.clickSignUpLink();
		LoginPage loginpage = signuppage.signUp("Bharath", "Tester@gmail.com", "Tester@123", "Tester@123", "8");
		String successText = loginpage.getText();
		Assert.assertEquals(successText, "Congratulations! Your account was successfully registered. Login to proceed");
	}
}
