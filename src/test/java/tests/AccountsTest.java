package tests;

import dto.Account;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewAccountPage;
import utils.SleepSomeTime;


public class AccountsTest extends BaseTest {

    @Test(description = "Make new account test")
    public void newAccount() {
        loginPage.open()
                .login(USERNAME, PASSWORD);
        accountsListPage.open()
                        .isPageOpened();
        accountsListPage.clickNew();

        Account account = new Account("Mike Nike", "+487589654", "+48568755",
                "4t.by", "New parent account", "12", "$5647",
                "Minsk", "Minsk", "220022", "Barbados", "Drychyn",
                "Pychyn", "154874", "Gonduras",
                "Very Nice Meet You", "Kolhoznaya str", "Navoznaya str",
                "Клиент", "Химия");

        newAccountPage.isPageOpened()
                    .fillIn(account)
                    .save();
        accountsDetailPage.isPageOpened();
        String newAccountNameCheck = accountsDetailPage.getNewAccountName();
        //String messageAlert = newAccountPage.getMessage();
        //Assert.assertEquals(messageAlert, "Account \"Mike Nike\" was created.", "Doesn't match");
        Assert.assertEquals(newAccountNameCheck, "Mike Nike", "Doesn't match");
    }
}
