package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutRegisteringTest extends AbstractWithoutRegisteringTest {


    @Test
    void searchM() {
        logger.info("Поиск неавторизованного пользователя");
        WebElement webElement1 = getDriver().findElement(By.xpath(".//*[@class='s-do']/li[1]"));
        webElement1.click();
        WebElement webElement2 = getDriver().findElement(By.xpath(".//*[@class='s-header-search__input-wrapper']/input"));
        webElement2.sendKeys("hello");
        WebElement webElement3 = getDriver().findElement(By.xpath(".//*[@class='s-do']/li[1]"));
        webElement3.click();
        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");

    }

    @Test
    void language() {
        logger.info("Смена языка неавторизованного пользователя");
        WebElement webElement1 = getDriver().findElement(By.xpath(".//*[@class='s-do']/li[5]"));
        webElement1.click();
        WebElement webElement2 = getDriver().findElement(By.xpath(".//*[@class='s-do']/li[5]/ul/li[1]"));
        webElement2.click();
        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");

    }

    @Test
    void invalidInput() {
        logger.info("Неверный ввод пароля при авторизации");
        WebElement webElement1 = getDriver().findElement(By.xpath(".//*[@class ='s-do']/li[2]/a"));
        webElement1.click();
        WebElement webElement2 = getDriver().findElement(By.id("user"));
        webElement2.sendKeys("user2408");
        WebElement webElement3 = getDriver().findElement(By.id("lj_loginwidget_password"));
        webElement3.sendKeys("      ");
        WebElement webElement4 = getDriver().findElement(By.xpath(".//*[@class='b-loginform__form pkg lj_login_form ng-valid ng-valid-maxlength ng-dirty ng-valid-parse']/button"));
        webElement4.click();
        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");

    }
}