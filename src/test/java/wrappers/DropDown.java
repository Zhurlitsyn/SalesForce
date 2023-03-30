package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SleepSomeTime;

import java.time.Duration;

public class DropDown {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/..//";
    //String baseLocator = "//*[text()='%s']/ancestor::div[contains(@class, 'slds-form-element')]//";
    //String salutationLocator = "//*[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//button";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void getDrop(String locator, String choise) {
        driver.findElement(By.xpath(String.format((baseLocator + locator), label))).click();
        SleepSomeTime.delay(500);
        driver.findElement(By.xpath("//*[text()='" + choise + "']")).click();
        SleepSomeTime.delay(500);
    }

}
