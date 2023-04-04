package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SleepSomeTime;

public class TextArea {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/../..//textarea";
    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text) {

        driver.findElement(By.xpath(String.format(baseLocator, label))).sendKeys(text);
        SleepSomeTime.delay(200);
    }
}
