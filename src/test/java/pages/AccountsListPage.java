package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
@Log4j2
public class AccountsListPage extends BasePage {

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    public void isPageOpened() {
        log.info("Waiting opening");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']")));
    }

    public AccountsListPage open() {
        log.info("Opening Acc List Page");
        driver.get("https://myfirstprimeorg-dev-ed.develop.lightning.force.com/lightning/o/Account/list");
        waitForPageLoaded();
        return this;
    }

   /* @Step("Click New button")
    public AccountsListPage clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        return this;
    }*/

    @Step("Click New button")
    public NewAccountPage clickNew() {
        log.info("Clicking New button");
        driver.findElement(By.cssSelector("[title=New]")).click();
        return new NewAccountPage(driver);
    }
}
