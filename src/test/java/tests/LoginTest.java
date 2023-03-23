package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        loginPage.open();
        loginPage.login("6131755-6d9t@force.com", "purple47");
        loginPage.waitForPageLoaded();
        driver.findElement(By.cssSelector("[title=User]")).isDisplayed();
    }


}
