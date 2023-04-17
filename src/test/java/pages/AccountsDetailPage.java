package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
@Log4j2
public class AccountsDetailPage extends BasePage {

    public AccountsDetailPage(WebDriver driver) {
        super(driver);
    }

    public AccountsDetailPage isPageOpened( String name) {
        log.info("Trying to open Detail Page");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='tabBar slds-grid']//span[text()='"+ name +"']")));
        return this;
    }

    @Step("Get Account Name")
    public String getNewAccountName(String name) {
        log.info("Getting new Account Name");
        /*List<WebElement> listAccountNames = driver.findElements(By
                .xpath("//h1/div[text()='Account'] /..//lightning-formatted-text"));
        return listAccountNames.get((listAccountNames.size() - 1)).getText();*/
        return driver.findElement(By
                .xpath("//lightning-formatted-text[text()='" + name + "']")).getText();
    }

}
