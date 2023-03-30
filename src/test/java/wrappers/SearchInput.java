package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SleepSomeTime;

import java.time.Duration;

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
        driver.findElement(By.xpath("//span[@class='slds-truncate' and @title='" + chooseName + "']")).click();
        SleepSomeTime.delay(500);
    }

}
