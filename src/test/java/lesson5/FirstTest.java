package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class FirstTest extends AbstractTest {


    @Test
    void header() {
        logger.info("Меню на главной странице");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement webElement1 = getDriver().findElement(By.xpath(".//*[@class='categories__list js--limited-list']/li[1]"));
        webElement1.click();
        WebElement webElement2 = getDriver().findElement(By.xpath(".//*[@class='categories__list js--limited-list']/li[2]"));
        webElement2.click();
        WebElement webElement3 = getDriver().findElement(By.xpath(".//*[@class='categories__list js--limited-list']/li[3]"));
        webElement3.click();
        WebElement webElement4 = getDriver().findElement(By.xpath(".//*[@class='categories__list js--limited-list']/li[4]"));
        webElement4.click();
        WebElement webElement5 = getDriver().findElement(By.xpath(".//*[@class='categories__list js--limited-list']/li[5]"));
        webElement5.click();
         Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");
    }

    @Test
    void headerB() {
        logger.info("Меню на главной странице");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement webElement1 = getDriver().findElement(By.xpath(".//*[@class='s-header__nav']/ul/li[2]"));
        webElement1.click();
        WebElement webElement2 = getDriver().findElement(By.xpath(".//*[@class='s-header__nav']/ul/li[3]"));
        webElement2.click();
        WebElement webElement3 = getDriver().findElement(By.xpath(".//*[@class='s-header__nav']/ul/li[4]"));
        webElement3.click();
        WebElement webElement4 = getDriver().findElement(By.xpath(".//*[@class='s-header__nav']/ul/li[5]"));
        webElement4.click();
        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");
    }
}