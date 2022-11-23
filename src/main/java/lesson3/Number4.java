package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Number4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        // options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        Duration duration = Duration.ofSeconds(3);
        driver.manage().timeouts().implicitlyWait(duration);
        driver.get("https://www.livejournal.com/");

        WebElement webElement1 = driver.findElement(By.xpath(".//*[@class='s-do']/li[5]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//*[@class='s-do']/li[5]/ul/li[1]"));
         webElement2.click();

        // driver.quit();
    }
}
