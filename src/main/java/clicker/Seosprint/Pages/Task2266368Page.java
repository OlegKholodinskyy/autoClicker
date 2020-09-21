package clicker.Seosprint.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by oleg on 21.09.2020.
 */
public class Task2266368Page {



    @FindBy(xpath = "//form[@id='task-use']/following-sibling::div/span")
    private WebElement startTask;

    @FindBy(xpath = "//textarea[@id='task_report']")
    private WebElement textAreaReport;


    public void startTaskButtonClick(){
        startTask.click();
    }

    public void printIntoTextAreaReport(String str){
        textAreaReport.sendKeys(str);
    }

}
