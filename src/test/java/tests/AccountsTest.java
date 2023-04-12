package tests;

import dto.Account;
import dto.AccountFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test(description = "Make new account test")
    public void newAccount() {
        loginPage.open()
                .login(USERNAME, PASSWORD);
        accountsListPage.open()
                .isPageOpened();
        accountsListPage.clickNew();

        /*Account account = new Account("Mike Nike", "+487589654", "+4856875578",
                "12", "4t.by", "$5647",
                "Minsk", "Minsk", "220022", "Barbados", "Drychyn",
                "Pychyn", "154874", "Gonduras",
                "Very Nice Meet You", "Kolhoznaya str", "Navoznaya str",
                "Клиент", "Химия");*/

        Account account = new AccountFactory().getRandom();

        newAccountPage.isPageOpened()
                .fillIn(account)
                .save();
        accountsDetailPage.isPageOpened();
        String newAccountNameCheck = accountsDetailPage.getNewAccountName();
        Assert.assertEquals(newAccountNameCheck, account.getAccountName(), "Doesn't match");

        //-----variant checking by alert message----
        //String messageAlert = newAccountPage.getMessage();
        //Assert.assertEquals(messageAlert, "Account \"Mike Nike\" was created.", "Doesn't match");
    }
}
