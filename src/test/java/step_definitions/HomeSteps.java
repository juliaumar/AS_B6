package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();

    }
    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        BrowserUtils.getDriver();

    }



    @Then("Verify {string} info is displayed")
    public void verifyInfoIsDisplayed(String Contact) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, Contact))));

    }

    @Then("Verify Title of the page is {string}")
    public void verifyTitleOfThePageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify the buttons{string} are displayed")
    public void verifyTheButtonsAreDisplayed(String NavigationBar) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, NavigationBar))));


    }

    @When("User click on Language section button")
    public void userClickOnLanguageSectionButton() {
        BrowserUtils.click(page.languagesBar);
    }


    @Then("User Verify {string} buttons are displayed")
    public void userVerifyButtonsAreDisplayed(String languages) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, languages))));

    }



    //AS-4

    @When("User Verify {string} is displayed")
    public void userVerifyIsDisplayed(String arg0) {
        BrowserUtils.waitForElementVisibility(page.header);

        BrowserUtils.isDisplayed(page.header);
    }
    //AS-4
    @And("User Verify {string} text is displayed")
    public void userVerifyTextIsDisplayed(String desc) {
        BrowserUtils.isDisplayed(page.text);
    }

    //AS-4
    @Then("User Verify {string} button is displayed")
    public void userVerifyButtonIsDisplayed(String arg0) {
        BrowserUtils.isDisplayed(page.readMoreBtn);
    }

    //AS-4
    @Then("User click on {string} Btn")
    public void userClickOnBtn(String arg0) throws InterruptedException {
        Thread.sleep(60000);
        BrowserUtils.click(page.btn);
        BrowserUtils.switchToNewWindow();

    }

    //AS-4
    @And("Verify {string} button takes User to page")
    public void verifyButtonTakesUserToPage(String Title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), Title);

    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String FooterInfo) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, FooterInfo))));
    }
}