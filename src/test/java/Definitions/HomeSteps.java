package Definitions;

import Managers.AllDriverManager;
import Managers.PageObjectManager;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeSteps {

    HomePage homePage;
    TestContext testContext;
    AllDriverManager allDriverManager;
    PageObjectManager pageObjectManager;
    WebDriver driver;
    public HomeSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("Home page without authorizations")
    public void homePageWithoutAuthorizations() {
        Assert.assertTrue(homePage.defaultHomePageIsDisplayed());
    }

    @Given("Login form in login page")
    public void goToLoginPage() {
        Assert.assertTrue(homePage.defaultHomePageIsDisplayed());
        homePage.clickLoginButton();
    }

    @Then("This is for invalid locators")
    public void thisIsForInvalidLocators() {
        homePage.getInvalidLocators();
    }
}
