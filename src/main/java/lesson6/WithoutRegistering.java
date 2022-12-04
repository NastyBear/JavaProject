package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WithoutRegistering  extends AbstractPage{
    public WithoutRegistering(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//*[@class='s-do']/li[1]")
    private WebElement search;

    @FindBy (xpath = ".//*[@class='s-header-search__input-wrapper']/input")
    private WebElement inputSearch;

    @FindBy (xpath = ".//*[@class='s-do']/li[1]")
    private WebElement fieldSearch;

    @FindBy(xpath = ".//*[@class='s-do']/li[5]")
    private WebElement language;

    @FindBy (xpath = ".//*[@class='s-do']/li[5]/ul/li[1]")
    private WebElement english;

    public void SearchT(String value){
        search.click();
        inputSearch.sendKeys(value);
        fieldSearch.click();

    }
    public void LanguageE (){
        language.click();
        english.click();
    }

}
