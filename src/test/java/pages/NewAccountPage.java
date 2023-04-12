package pages;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.SleepSomeTime;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

@Log4j2
public class NewAccountPage extends BasePage {
    public static final By alertMessageText = By.className("toastMessage");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h2[text()='New Account']")));
        return this;
    }

    public NewAccountPage open() {
        driver.get("https://forcecom-3d9.lightning.force.com/lightning/o/Account/new");
        return this;
    }

    /*@Step("Click New button")
    public NewAccountPage clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.isPageOpened();
        return this;
    }*/

    @Step("Filling new Account data")
    public NewAccountPage fillIn(Account account) {
        log.info("Filling new Account data {}", account);
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebsite());
        //new Input(driver, "Parent Account").write(account.getParentAcc());
        new Input(driver, "Employees").write(account.getEmployee());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "Billing City").writeAddress(account.getBillCity());
        new Input(driver, "Billing State/Province").writeAddress(account.getBillState());
        new Input(driver, "Billing Zip/Postal Code").writeAddress(account.getBillZip());
        new Input(driver, "Billing Country").writeAddress(account.getBillCountry());
        new Input(driver, "Shipping City").writeAddress(account.getShipCity());
        new Input(driver, "Shipping State/Province").writeAddress(account.getShipState());
        new Input(driver, "Shipping Zip/Postal Code").writeAddress(account.getShipZip());
        new Input(driver, "Shipping Country").writeAddress(account.getShipCountry());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillStreet());
        new TextArea(driver, "Shipping Street").write(account.getShipStreet());

        new DropDown(driver, "Type").getDrop("a", account.getType());
        new DropDown(driver, "Industry").getDrop("a", account.getIndustry());
        return this;
    }

    @Step("Click Save button")
    public void save() {
        log.info("Clicking Save button");
        driver.findElement(By.cssSelector("[title=Save]")).click();
        SleepSomeTime.delay(200);

    }

    @Step("Check text alert Message")
    public String getMessage() {
        return driver.findElement(alertMessageText).getText();
    }
}

