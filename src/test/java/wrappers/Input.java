package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SleepSomeTime;

public class Input {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/ancestor::div[contains(@class, 'slds-form-element')]//input";
    String addressLocator = "//*[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//input";
    String dayLocator = "//*[text()='%s']/../..//input";
    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text) {

        driver.findElement(By.xpath(String.format(baseLocator, label))).sendKeys(text);
        SleepSomeTime.delay(100);
    }

    public void writeAddress(String text) {

        driver.findElement(By.xpath(String.format(addressLocator, label))).sendKeys(text);
        SleepSomeTime.delay(100);
    }
    public void writeDay(String text) {

        driver.findElement(By.xpath(String.format(dayLocator, label))).sendKeys(text);
        SleepSomeTime.delay(100);
    }
}
