package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
@Log4j2
public class LoginPage extends BasePage {
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    public final String USERNAME = "6131755-6d9t@force.com";
    public final String PASSWORD = "purple47";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[text()='Username']")));
    }

    @Step("Opening login page")
    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    @Step("Login by user '{username}' '{password}'")
    public AccountsListPage login(String username, String password) {
        log.info("Login by user '{}' '{}'", username, password);
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        waitForPageLoaded();
        return new AccountsListPage(driver);
    }
}

