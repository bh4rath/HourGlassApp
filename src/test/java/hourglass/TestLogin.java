package hourglass;

import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.LoginPage;

public class TestLogin extends BaseTest {

	@Test
	public void TestLogin() {
		LoginPage loginpage = homepage.clickLoginLink();
		loginpage.login("Tester@gmail.com", "Tester@123");
	}
}
