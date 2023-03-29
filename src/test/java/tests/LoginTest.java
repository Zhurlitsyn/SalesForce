package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Try login user")
    public void login() {
        loginPage.open();
        loginPage.login(USERNAME, PASSWORD);
        loginPage.waitForPageLoaded();
        driver.findElement(By.cssSelector("[title=User]")).isDisplayed();
    }


}
