package clicker.Seosprint.Pages;

import clicker.helpers.Waiters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by oleg on 08.09.2020.
 */
public class MainPageSeo {

    @FindBy(xpath = "//span[@class='note']")
    private WebElement currentSumm;

    @FindBy(xpath = "//span[@class='nav-icon']")
    private WebElement earnButton;

    @FindBy(xpath = "//a[@href='/earn-surf']")
    private WebElement surfRef;

    @FindBy(xpath = "//a[@href='/earn-task']")
    private WebElement taskRef;

    public String getCurrentSumm() {
        return currentSumm.getText();
    }

    public void earnButtonClick() {
        earnButton.click();
    }

    public void clickSurfRef() {
        surfRef.click();
    }

    public void clickTaskRef() {
        taskRef.click();
        System.out.println();
    }
}
