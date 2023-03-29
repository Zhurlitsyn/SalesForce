package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class ContactsTest extends BaseTest {

    @Test(description = "Make new contact test")
    public void newAccount() {
        loginPage.open();
        loginPage.login("6131755-6d9t@force.com", "purple47");
        loginPage.waitForPageLoaded();
        contactsPage.open();
        contactsPage.clickNew();
        contactsPage.fillInAddress("Mailing", "Mountain str", "456789",
                "Madrid", "Madrid", "Spain");
        contactsPage.fillInAddress("Other", "Mountain str", "456789",
                "Madrid", "Madrid", "Spain");
        contactsPage.fillInAdditional("+897458236", "+555 858 658", "---",
                "+123 4465 897", "Sapiens Home", "Science", "12.04.1917",
                "In-Store", "Lorem ipsum dolor asmet ahmet");
        contactsPage.fillInContact("Simple", "+5898754123", "+65896523",
                "Dimmple", "some@one.com", "Проф.", "Mike Nike");

        contactsPage.save();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("toastMessage")));

        String messageAlert = contactsPage.getMessage();
        Assert.assertEquals(messageAlert, "Contact \"Проф. Simple Dimmple\" was created.", "Doesn't match");
    }
}