package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

@Listeners({TestListener.class})
public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    AccountsListPage accountsListPage;
    ContactsPage contactsPage;
    NewAccountPage newAccountPage;
    AccountsDetailPage accountsDetailPage;
    MainPage mainPage;

    public BaseTest() {
    }

    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments(new String[]{"--remote-allow-origins=*"});
            //options.addArguments(new String[]{"--headless"});
            options.addArguments(new String[]{"--start-maximized"});

            options.addArguments(new String[]{"disable-infobars"}); //disabling infobars
            options.addArguments(new String[]{"--disable-extensions"}); //disabling extensions
            options.addArguments(new String[]{"--disable-gpu"}); // applicable to windows os only
            options.addArguments(new String[]{"--disable-dev-shm-usage"}); // overcome limited resource problems
            options.addArguments(new String[]{"--no-sandbox"}); // Bypass OS security model

            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        testContext.setAttribute("driver", driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        accountsListPage = new AccountsListPage(driver);
        contactsPage = new ContactsPage(driver);
        newAccountPage = new NewAccountPage(driver);
        accountsDetailPage = new AccountsDetailPage(driver);


    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
