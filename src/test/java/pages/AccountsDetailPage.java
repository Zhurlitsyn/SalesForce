package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AccountsDetailPage extends BasePage {

    public AccountsDetailPage(WebDriver driver) {
        super(driver);
    }

    public AccountsDetailPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class, 'entityNameTitle') and text()='Account']")));
        return this;
    }

    @Step("Get Account Name")
    public String getNewAccountName() {
        List<WebElement> listAccountNames = driver.findElements(By
                .xpath("//h1/div[text()='Account'] /..//lightning-formatted-text"));
        return listAccountNames.get((listAccountNames.size() - 1)).getText();
    }

}
