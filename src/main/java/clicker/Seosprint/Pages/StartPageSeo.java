package clicker.Seosprint.Pages;

import clicker.Seosprint.LoginHelper;
import clicker.helpers.Waiters;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

/**
 * Created by oleg on 29.08.2020.
 */
public class StartPageSeo {

    private WebDriver driver;

    public StartPageSeo(WebDriver driver) {
        this.driver = driver;
    }

    private static String email;
    private static String pass;

    @FindBy(xpath = "//span[@class='btn-h1']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@placeholder='E-mail']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//form[@id='enter']//button")
    private WebElement enterButton;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private WebElement logInButton;

    public void clickSignInButton() {
        Waiters.timeout(4,8);
        signInButton.click();
    }

    public void fillEmailField (){
        emailField.sendKeys(LoginHelper.getLoginSeo());
    }
    public void fillPassField (){
        passwordField.sendKeys(LoginHelper.getPassSeo());
    }

    public void clickLogInButton() {
        logInButton.click();
    }


}