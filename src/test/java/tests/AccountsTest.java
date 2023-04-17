package tests;

import dto.Account;
import dto.AccountFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test(description = "Make new account test")
    public void newAccount() {
        loginPage.open()
                .login();
        accountsListPage.open()
                .isPageOpened();
        accountsListPage.clickNew();

        Account account = new AccountFactory().getRandom();

        newAccountPage.open()
                .isPageOpened()
                .fillIn(account)
                .save();
        accountsDetailPage.isPageOpened(account.getAccountName());

        //-----variant checking by alert message----
        //String messageAlert = newAccountPage.getMessage();
        //Assert.assertEquals(messageAlert, "Account \"Mike Nike\" was created.", "Doesn't match");

        String newAccountNameCheck = accountsDetailPage.getNewAccountName(account.getAccountName());
        Assert.assertEquals(newAccountNameCheck, account.getAccountName(), "Doesn't match");


    }
}
