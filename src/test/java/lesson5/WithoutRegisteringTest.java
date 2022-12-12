package lesson5;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import lesson6.Page;
import lesson6.WithoutRegistering;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@Story("Проверка неавторизованного пользователя")
public class WithoutRegisteringTest extends AbstractWithoutRegisteringTest {


    @Test
    @Description("Выполнение поиска неавторизованного пользователя")
    @Severity(SeverityLevel.MINOR)
    void searchM() {
        logger.info("Поиск неавторизованного пользователя");
        WithoutRegistering withoutRegistering = new WithoutRegistering(getDriver());
        withoutRegistering.SearchT("hello");
        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");

    }

    @Test
    @Description("Смена языка неавторизованного пользователя")
    @Severity(SeverityLevel.MINOR)
    void language() {
        logger.info("Смена языка неавторизованного пользователя");

        WithoutRegistering withoutRegistering2 = new WithoutRegistering(getDriver());
        withoutRegistering2.LanguageE();
        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");

    }

    @Test
    @Description("Неверный ввод пароля при авторизации")
    @Severity(SeverityLevel.CRITICAL)
    void invalidInput() {
        logger.info("Неверный ввод пароля при авторизации");

       Page page = new Page(getDriver());
       page.logIn("user2408","      ");
        Assertions.assertFalse(getDriver().getTitle().contains("Главное-ЖЖ"), "страница входа недоступна");

    }
}