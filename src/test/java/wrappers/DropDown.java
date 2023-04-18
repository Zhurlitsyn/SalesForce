package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SleepSomeTime;

import java.util.Random;

@Log4j2
public class DropDown {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/../..//button";


    // //span[@class='slds-media__body']/span[text()='Prospect']

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void getDrop(String choice) {
        log.info("Click button {}", label);
        driver.findElement(By.xpath(String.format(baseLocator, label))).click();
        SleepSomeTime.delay(500);
        log.info("Select on {}", choice , label);
        driver.findElement(By.xpath("//*[text()='" + choice + "']")).click();
        SleepSomeTime.delay(500);
    }

}
