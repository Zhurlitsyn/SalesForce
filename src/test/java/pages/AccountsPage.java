package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

import java.util.List;

public class AccountsPage extends BasePage {
    public static final By checkNewAccount = By.xpath("//lightning-formatted-text[@class='custom-truncate']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://forcecom-3d9.lightning.force.com/lightning/o/Account/list");
    }

    @Step("Click New button")
    public void clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
    }

    @Step("Find new account name")
    public String findAccountName() {
        List<WebElement> accountList = driver.findElements(checkNewAccount);
        return accountList.get(accountList.size() - 1).getText();
    }

    @Step("Filling new user data")
    public void fillIn(String accountName, String phone, String fax, String website,
                       String parentAcc, String employee, String annualRevenue,
                       String billCity, String billState, String billZip, String billCountry,
                       String shipCity, String shipState, String shipZip, String shipCountry,
                       String description, String billStreet, String shipStreet,
                        String type, String industry) {

        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Website").write(website);
        new Input(driver, "Parent Account").write(parentAcc);
        new Input(driver, "Employees").write(employee);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "Billing City").write(billCity);
        new Input(driver, "Billing State/Province").write(billState);
        new Input(driver, "Billing Zip/Postal Code").write(billZip);
        new Input(driver, "Billing Country").write(billCountry);
        new Input(driver, "Shipping City").write(shipCity);
        new Input(driver, "Shipping State/Province").write(shipState);
        new Input(driver, "Shipping Zip/Postal Code").write(shipZip);
        new Input(driver, "Shipping Country").write(shipCountry);
        new TextArea(driver, "Description").write(description);
        new TextArea(driver, "Billing Street").write(billStreet);
        new TextArea(driver, "Shipping Street").write(shipStreet);

        new DropDown(driver, "Type").getDrop(type);
        new DropDown(driver, "Industry").getDrop(industry);
    }

    public void save() {
        driver.findElement(By.cssSelector("[title=Save]")).click();
    }
}
