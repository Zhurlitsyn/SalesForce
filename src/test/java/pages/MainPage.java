package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void isPageOpened() {
        log.info("Waiting page opened");
        waitForPageLoaded();
        /*wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//*[@title='Setup']")));*/
    }

}

