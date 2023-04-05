package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SleepSomeTime;

import java.time.Duration;
@Log4j2
public class SearchInput {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/..//input";

    public SearchInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectSearch(String recent, String chooseName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath(String.format(baseLocator, label))).click();
        SleepSomeTime.delay(500);
        driver.findElement(By.xpath(String.format(baseLocator, label))).click();
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[@aria-label='Recent " + recent + "']")));
        log.info("Select {} from {}", chooseName, label);
        driver.findElement(By.xpath("//span[@class='slds-truncate' and @title='" + chooseName + "']")).click();
        SleepSomeTime.delay(500);
    }

}
