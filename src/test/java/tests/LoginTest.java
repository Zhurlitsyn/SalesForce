package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class LoginTest extends BaseTest {

    @Test(description = "Try login user")
    public void login() {
        loginPage.open()
                 .login();
        mainPage.isPageOpened();
    }
}
