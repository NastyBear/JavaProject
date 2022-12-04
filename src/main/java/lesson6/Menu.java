package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu  extends AbstractPage{
    public Menu(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = ".//*[@class='categories__list js--limited-list']/li[1]")
    private WebElement newFaces;

    @FindBy(xpath = ".//*[@class='categories__list js--limited-list']/li[2]")
    private WebElement media;

    @FindBy(xpath = ".//*[@class='categories__list js--limited-list']/li[3]")
    private WebElement travels;

    @FindBy(xpath = ".//*[@class='categories__list js--limited-list']/li[4]")
    private WebElement psychology;

    @FindBy(xpath = ".//*[@class='categories__list js--limited-list']/li[5]")
    private WebElement work;

    @FindBy(xpath = ".//*[@class='s-header__nav']/ul/li[2]")
    private WebElement friends;

    @FindBy(xpath = ".//*[@class='s-header__nav']/ul/li[3]")
    private WebElement top;

    @FindBy(xpath = ".//*[@class='s-header__nav']/ul/li[4]")
    private WebElement score;

    @FindBy(xpath = ".//*[@class='s-header__nav']/ul/li[5]")
    private WebElement idea500;

    public Menu clickNewFaces(){
    newFaces.click();
    return this;
}
    public Menu clickMedia(){
    media.click();
    return this;
}
    public Menu clickTravels(){
        travels.click();
        return this;
    }
    public Menu clickPsychology(){
        psychology.click();
        return this;
    }
    public Menu clickWork(){
        work.click();
        return this;
    }

    public Menu clickFriends(){
        friends.click();
        return this;
    }

    public Menu clickTop(){
        top.click();
        return this;
    }

    public Menu clickScore(){
        score.click();
        return this;
    }

    public Menu clickIdea(){
        idea500.click();
        return this;
    }


}
