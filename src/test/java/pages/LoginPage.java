package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.PropertyReader;

@Log4j2
public class LoginPage extends BasePage {
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");


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

    @Step("Login by user")
    public MainPage login() {
        log.info("Login by user");
        String logUser = System.getProperty("username", PropertyReader.getProperty("USERNAME"));
        String logPswrd = System.getProperty("password", PropertyReader.getProperty("PASSWORD"));
        driver.findElement(USERNAME_INPUT).sendKeys(logUser);
        driver.findElement(PASSWORD_INPUT).sendKeys(logPswrd);
        driver.findElement(LOGIN_BUTTON).click();
        return new MainPage(driver);
    }
}

