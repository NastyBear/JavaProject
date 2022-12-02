package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class AbstractTest {

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


    }
    @BeforeEach
    void goTo(){
        logger.info("Авторизация успешна");
        Assertions.assertDoesNotThrow(()->driver.navigate().to("https://www.livejournal.com"),"Страница недоступна");

        WebElement webElement1 = getDriver().findElement(By.xpath(".//*[@class ='s-do']/li[2]/a"));
        webElement1.click();
        WebElement webElement2 = getDriver().findElement(By.id("user"));
        webElement2.sendKeys("User2408");
        WebElement webElement3 = getDriver().findElement(By.id("lj_loginwidget_password"));
        webElement3.sendKeys("12Jony34_Ga");
        WebElement webElement4 = getDriver().findElement(By.xpath(".//*[@class='b-loginform__form pkg lj_login_form ng-valid ng-valid-maxlength ng-dirty ng-valid-parse']/button"));
        webElement4.click();

         Assertions.assertEquals("Главное — ЖЖ",getDriver().getTitle(),"страница недоступна");
    }

    @AfterAll
    static void close(){
      //  driver.quit();
    }
}
