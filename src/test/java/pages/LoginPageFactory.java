package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BasePage {
    @FindBy(id="username")
    WebElement userNameInput;
    @FindBy(id="password")
    WebElement userPasswordInput;
    @FindBy(id="login")
    WebElement loginButton;
    @FindBy(id="error")
    WebElement errorMessage;

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @Step("Opening login page")
    public void open() {
        driver.get(BASE_URL);
        PageFactory.initElements(driver, this);
    }
    @Step("Getting error message")
    public String getErrorMessage() {
        return errorMessage.getText();
    }

    @Step("Login by user '{username}' '{password}'")
    public void login(String username, String password) {
        userNameInput.sendKeys(username);
        userPasswordInput.sendKeys(password);
        loginButton.click();
        waitForPageLoaded();
    }
}

