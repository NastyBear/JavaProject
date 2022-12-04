package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Page  extends AbstractPage{
    @FindBy(xpath = ".//*[@class='s-do']/li[2]")
    private WebElement input;

    @FindBy(id = "user")
    private WebElement loGin;

    @FindBy(id = "lj_loginwidget_password")
    private WebElement pasSword;

    @FindBy( xpath = ".//*[@class='b-loginform__form pkg lj_login_form ng-valid ng-valid-maxlength ng-dirty ng-valid-parse']/button")
    private WebElement inputPage;

    public Page(WebDriver driver) {
        super(driver);
    }

    public void logIn(String login, String password){
        input.click();
        loGin.sendKeys(login);
        pasSword.sendKeys(password);
        inputPage.click();

    }

   public Page clickInput(){
       input.click();
       return this;
    }
    public Page clickLogin(){
        loGin.sendKeys("User2408");
        return this;
    }
    public Page clickPassword(){
        pasSword.sendKeys("12Jony34_Ga");
        return this;
    }
    public Page clickInputPage(){
      inputPage.click();
      return this;
    }
}
