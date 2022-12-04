package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v105.page.Page;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public AbstractPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
}
