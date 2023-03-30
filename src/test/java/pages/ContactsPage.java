package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.SearchInput;
import wrappers.TextArea;

import java.time.Duration;
import java.util.List;

public class ContactsPage extends BasePage {

    public static final By alertMessageText = By.className("toastMessage");


    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://forcecom-3d9.lightning.force.com/lightning/o/Contact/list");
    }

    @Step("Click New button")
    public void clickNew() {
        driver.findElement(By.cssSelector("[title=New]")).click();
    }

    @Step("Check text alert Message")
    public String getMessage() {
        return driver.findElement(alertMessageText).getText();
    }

    //B1 - inputs
    @Step("Filling new Contact data")
    public void fillInContact(String firstName, String phone, String mobile,
                              String lastName, String email, String title, String salutation,
                              String accName, String recentAccount, String reportTo, String recentContact) {
        new Input(driver, "First Name").write(firstName);

        new Input(driver, "Phone").write(phone);

        new Input(driver, "Mobile").write(mobile);

        new DropDown(driver, "Salutation").getDrop("button", salutation);

        new Input(driver, "Last Name").write(lastName);

        new Input(driver, "Email").write(email);

        new Input(driver, "Title").write(title);

        new SearchInput(driver, "Account Name").selectSearch(recentAccount, accName);

        new SearchInput(driver, "Reports To").selectSearch(recentContact, reportTo);
    }

    //B2 - addresses
    @Step("Filling new {typeAddress} Address data")
    public void fillInAddress(String typeAddress, String street, String zip,
                              String city, String state, String country) {
        new TextArea(driver, typeAddress + " Street").write(street);
        new Input(driver, typeAddress + " Zip/Postal Code").write(zip);
        new Input(driver, typeAddress + " City").write(city);
        new Input(driver, typeAddress + " State/Province").write(state);
        new Input(driver, typeAddress + " Country").write(country);
    }

    //B3 - Additional info
    @Step("Filling new Additional data and description")
    public void fillInAdditional(String fax, String homePhone, String otherPhone,
                                 String asstPhone, String assistant, String dept,
                                 String birthday, String leadSource, String description) {
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Home Phone").write(homePhone);
        new Input(driver, "Other Phone").write(otherPhone);
        new Input(driver, "Asst. Phone").write(asstPhone);
        new Input(driver, "Assistant").write(assistant);
        new Input(driver, "Department").write(dept);
        new Input(driver, "Birthdate").writeDay(birthday);
        new DropDown(driver, "Lead Source").getDrop("button", leadSource);
        new TextArea(driver, "Description").write(description);

    }

    @Step("Wait while modal loading")
    public void waitForModalLoaded() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='New Contact']")));

    }


    @Step("Click Save button")
    public void save() {
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    }
}
