package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AboutUsPage;
import pages.CommonPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class AboutUsSteps implements CommonPage {
    AboutUsPage aboutUsPage;

    public AboutUsSteps() {
        aboutUsPage = new AboutUsPage();

    }
    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }
    @When("User opens Home Page")
    public void userOpensHomePage() {

    }

    @When(": User clicks on {string} link text")
    public void userClicksOnLinkText(String aboutUs) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, aboutUs))));
    }


    @Then(": User switches to new window")
    public void userSwitchesToNewWindow()  {
        BrowserUtils.switchToNewWindow();
    }
    @Given("Verify Title of page is {string}")
    public void verifyTitleOfPageIs(String str) {
        Assert.assertEquals(BrowserUtils.getDriver().getTitle(), str);


    }


    @And("Verify a main header {string}")
    public void verifyAMainHeader(String str1) {
        Actions at = new Actions(BrowserUtils.getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, str1))));
        CucumberLogUtils.logPass("passed", true);


    }

    //AS-29
    @Then("Verify name and title are displayed")
    public void verifyNameAndTitleAreDisplayed() {
        Actions at = new Actions(BrowserUtils.getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
       // CucumberLogUtils.logPass("passed", true);
        BrowserUtils.isDisplayed(aboutUsPage.nameAndTitle);
        CucumberLogUtils.logPass("passed", true);

    }
    @When("User see a section with header {string}")
    public void userSeeASectionWithHeader(String header) {
        Actions at = new Actions(BrowserUtils.getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, header))));
    }

    @Then("It should contain sub-sections with following headers {string}")
    public void itShouldContainSubSectionsWithFollowingHeaders(String Headers) {
        Actions at = new Actions(BrowserUtils.getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, Headers))));
    }


    @When("User Verify {string} header is displayed")
    public void userVerifyHeaderIsDisplayed(String header2) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, header2))));
    }

    @Then("verify button {string} is clickable which take to Services page")
    public void verifyButtonIsClickableWhichTakeToServicesPage(String btn) {
        Actions at = new Actions(BrowserUtils.getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn))));

    }

    @And("Verify Title of Services page is {string}")
    public void verifyTitleOfServicesPageIs(String titleServies) {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), titleServies);
    }
}



