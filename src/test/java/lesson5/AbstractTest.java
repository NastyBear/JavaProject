package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson6.Page;
import org.junit.jupiter.api.*;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.time.Duration;
import java.util.List;

public abstract class AbstractTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AbstractTest.class);

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
       // options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    logger.info("Главная страница");

    }
    @BeforeEach
    void goTo() {
       Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://www.livejournal.com"), "Страница недоступна");
        Page page = new Page(getDriver());
        page.clickInput()
                .clickLogin()
                .clickPassword()
                .clickInputPage();

         Assertions.assertEquals("Живой Журнал | Блоги | Сообщества | Рейтинги",getDriver().getTitle(),"страница недоступна");
    }


    @AfterAll
    static void close(){
      //  driver.quit();
    }
    @AfterEach
    public void check(){
        List<LogEntry> allLogRows = getDriver().manage().logs().get(LogType.BROWSER).getAll();
        if (!allLogRows.isEmpty()){
            if (allLogRows.size()>0){
                allLogRows.forEach(logEntry -> {
                    System.out.println(logEntry.getMessage());
                });
            }
        }
    }
}
