package wrappers;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SleepSomeTime;
@Log4j2
public class DropDown {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/../..//";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void getDrop(String locator, String choise) {

        driver.findElement(By.xpath(String.format((baseLocator + locator), label))).click();
        SleepSomeTime.delay(300);
        log.info("Select {} on {}", choise, label);
        driver.findElement(By.xpath("//*[text()='" + choise + "']")).click();
        SleepSomeTime.delay(300);
    }

}
