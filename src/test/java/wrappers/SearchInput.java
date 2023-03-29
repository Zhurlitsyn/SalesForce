package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchInput {
    String label;
    WebDriver driver;
    String baseLocator = "//*[text()='%s']/..//input";

    public SearchInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectSearch(String choise) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.findElement(By.xpath(String.format(baseLocator, label))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-label='Recent Accounts']")));
        //driver.findElement(By.xpath(String.format(baseLocator, label))).sendKeys(choise);
        //driver.findElement(By.xpath("//*[starts-with(@id, 'combobox')]//span[@title='Mike Nike']")).click();
        driver.findElement(By.xpath("//span[@class='slds-truncate' and @title='" + choise + "']")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

}
