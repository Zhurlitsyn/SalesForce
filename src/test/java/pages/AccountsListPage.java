package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsListPage extends BasePage {

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']")));
    }

    public AccountsListPage open() {
        driver.get("https://forcecom-3d9.lightning.force.com/lightning/o/Account/list");
        return this;
    }

    @Step("Click New button")
    public AccountsListPage clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        return this;
    }




}
