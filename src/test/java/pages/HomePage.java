package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath="//*[@class='icon fa fa-angle-down']")
    public WebElement languagesBar;

    @FindBy(xpath = "//*[contains(text(), 'A bright career')]")
    public WebElement header;

    @FindBy(xpath = "//*[contains(text(), 'Our Career Network')]")
    public WebElement text;

    @FindBy(xpath = "//*[contains(text(), 'Read More')]")
    public WebElement readMoreBtn;

   @FindBy(xpath ="//div[@id='layer-92874325']//a[@class='theme-btn btn-style-two'][normalize-space()='Read More']")
    public WebElement btn;






}
