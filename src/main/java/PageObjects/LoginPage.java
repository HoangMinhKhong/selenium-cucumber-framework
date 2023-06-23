package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

//    @FindBy(className = "bt-split-screen__header")
    @FindBy(xpath = "//div[contains(@class,'div_title')]")
    private WebElement loginHeaderTitle;

//    @FindBy(id = "email")
    @FindBy(xpath = "//input[contains(@class,'input-email')]")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(id = "next")
    private WebElement selanjutnyaButton;

    @FindBy(xpath = "//div[@class='bt-social-group']//button[1]")
    private WebElement loginFacebookButton;

    @FindBy(id = "btnGoogle")
    private WebElement loginGoogleButton;

    @FindBy(className = "bt-question-register")
    private WebElement registerQuestionText;

    @FindBy(xpath = "//a[@href='/register']")
    private WebElement registerLink;

    public boolean emailLoginPageIsDisplayed() throws InterruptedException {
        Thread.sleep(20000);
        loginHeaderTitle.isDisplayed();
        emailField.isDisplayed();
        passwordField.isDisplayed();
        return true;
    }

    public String getLoginHeaderTitle() {
        loginHeaderTitle.isDisplayed();
        return loginHeaderTitle.getText();
    }

    public String getQuestionRegisterText() {
        registerQuestionText.isDisplayed();
        return registerQuestionText.getText();
    }

    public void fillEmailData(String email) {
        emailField.isEnabled();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillPasswordData(String password) {
        passwordField.isEnabled();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSelanjutnyaButton() {
        selanjutnyaButton.isEnabled();
        selanjutnyaButton.click();
    }
}
