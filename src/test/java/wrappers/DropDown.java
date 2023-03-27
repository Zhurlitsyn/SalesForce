package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/ancestor::div[contains(@class, 'uiInput')]//a";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void getDrop(String choise) {
        driver.findElement(By.xpath(String.format(baseLocator, label))).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[text()='" + choise + "']")).click();
    }

}
