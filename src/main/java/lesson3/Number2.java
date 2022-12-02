package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Number2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--incognito");
        // options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.livejournal.com/");

        WebElement webElement1 = driver.findElement(By.xpath(".//*[@class ='s-do']/li[2]/a"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.id("user"));
        webElement2.sendKeys("User3535");
        WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
        webElement3.sendKeys("24Belka8");
        WebElement webElement4 = driver.findElement(By.xpath(".//*[@class='b-loginform__form pkg lj_login_form ng-valid ng-valid-maxlength ng-dirty ng-valid-parse']/button"));
        webElement4.click();

       // driver.quit();
    }
}
