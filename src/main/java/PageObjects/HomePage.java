package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(xpath = "//a[@class='AppHeader_logo__n_Rh2 d-flex align-items-center']")
    private WebElement headerLogo;

    @FindBy(xpath ="//div[contains(@placeholder,'Cari produk asli')]//div//input")
    private WebElement searchInput;

    @FindBy(xpath = "//a[contains(@href,'/cart')]")
    private WebElement cartButton;

    @FindBy(xpath = "//img[contains(@src,'bhinneka-logo')]//parent::a//following-sibling::div")
    private WebElement bhinnekaCopyrightFooter;

    @FindBy(xpath = "(//a[text()='Đăng nhập'])[1]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(@placeholder,'Cari produk asli')]//div//a")
    private WebElement searchProductLink;

    @FindBy(xpath = "//*[invalid locators]")
    private WebElement invalidLocators;

    public boolean defaultHomePageIsDisplayed() {
        headerLogo.isDisplayed();
        return true;
    }

    public void clickLoginButton() {
        loginButton.isDisplayed();
        loginButton.click();
    }

    public void clickCartButton() {
        cartButton.isEnabled();
        cartButton.click();
    }

    public void setSearchInput(String product) {
        searchInput.isEnabled();
        searchInput.click();
        searchInput.sendKeys(product);
    }

    public String getSearchProductLink() {
        searchProductLink.isDisplayed();
        return searchProductLink.getText();
    }

    public void getInvalidLocators() {
        invalidLocators.isDisplayed();
    }

    public void searchProductData(String product) {

        setSearchInput(product);
        searchInput.sendKeys(Keys.ENTER);
    }
}
