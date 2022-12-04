package lesson5;

import lesson6.Menu;
import lesson6.Page;
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

         Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");
        logger.info("Меню на главной странице");
    }

    @Test
    void headerB() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Menu menuBig = new Menu(getDriver());
        menuBig.clickFriends()
                .clickTop()
                .clickScore()
                .clickIdea();

        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");
        logger.info("Меню на главной странице");
    }
}