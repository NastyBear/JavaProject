package lesson5;

import io.qameta.allure.*;
import lesson6.Menu;
import lesson6.Page;
import lesson7.MyUtils;
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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
@Story("Проверка авторизованного пользователя")
public class FirstTest extends AbstractTest {


    @Test
    @Description("Проверка меню авторизованного пользователя")
    @Severity(SeverityLevel.MINOR)

    void header() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Menu menu = new Menu(getDriver());
        menu.clickNewFaces()
                .clickMedia()
                .clickTravels()
                .clickPsychology()
                .clickWork();

         Assertions.assertFalse(getDriver().getTitle().contains("Живой Журнал | Блоги | Сообщества | Рейтинги"), "страница входа недоступна");
        logger.info("Меню на главной странице");
    }

    @Test
    @Description("Проверка главного меню авторизованного пользователя")
    @Severity(SeverityLevel.MINOR)
    void headerB() throws InterruptedException , IOException {
            Thread.sleep(1000);
            File file = MyUtils.makeScreenshot(getDriver(),"screenshot"+System.currentTimeMillis()+".png");
            saveScreenshot(Files.readAllBytes(file.toPath()));

        Menu menuBig = new Menu(getDriver());
        menuBig.clickFriends()
                .clickTop()
                .clickScore()
                .clickIdea();

        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");
        logger.info("Меню на главной странице");
    }

    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

}