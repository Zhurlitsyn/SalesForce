package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SleepSomeTime;
@Log4j2
public class Input {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/..//input";
    //String addressLocator = "//*[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input";
    String dayLocator = "//*[text()='%s']/../..//input";
    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text) {
        log.info("Writing {} into {}", text, label);
        driver.findElement(By.xpath(String.format(baseLocator, label))).sendKeys(text);
        SleepSomeTime.delay(300);
    }

    public void writeAddress(String text) {
        log.info("Writing {} into {}", text, label);
        driver.findElement(By.xpath(String.format(baseLocator, label))).sendKeys(text);
        SleepSomeTime.delay(300);
    }
    public void writeDay(String text) {
        log.info("Writing {} into {}", text, label);
        driver.findElement(By.xpath(String.format(dayLocator, label))).sendKeys(text);
        SleepSomeTime.delay(300);
    }
}
