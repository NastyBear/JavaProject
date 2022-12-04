package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AbstractWithoutRegisteringTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AbstractTest.class);
    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        // options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }
    @BeforeEach
    void goTo(){
        logger.info("Переход на главную страницу неавторизованного пользователя");
        Assertions.assertDoesNotThrow(()->driver.navigate().to("https://www.livejournal.com"),"Страница недоступна");

    }

    @AfterAll
    static void close(){
        //  driver.quit();
    }
}


