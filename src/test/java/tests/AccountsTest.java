package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test
    public void newAccount() {
        loginPage.open();
        loginPage.login("6131755-6d9t@force.com", "purple47");
        loginPage.waitForPageLoaded();
        accountsPage.open();
        accountsPage.clickNew();
        accountsPage.fillIn(10,"Mike Nike", "+487589654", "+48568755",
                "4t.by", "New parent account", "12", "5647$",
                "Minsk", "Minsk", "220022", "Barbados", "Drychyn",
                "Pychyn", "154874", "Gonduras",
                "Very Nice Meet You", "Kolhoznaya str", "Navoznaya",12);
        accountsPage.save();
        Assert.assertEquals("Mike Nike", accountsPage.findAccountName(), "Don't checked");
    }
}
