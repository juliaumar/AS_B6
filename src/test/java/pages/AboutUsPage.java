package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class AboutUsPage {
    public AboutUsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(className = "team-member-one col-lg-3 col-md-6 col-xs-12")
    List<WebElement> listOfExperts;


    @FindBy(xpath = "//*[text()= 'Welcome to Advance Systems LLC.']")
    public WebElement aboutUsHeader;

    @FindBy(className = "author-information")
    public WebElement nameAndTitle;


}