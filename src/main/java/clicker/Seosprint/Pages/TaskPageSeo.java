package clicker.Seosprint.Pages;

import clicker.helpers.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by oleg on 14.09.2020.
 */
public class TaskPageSeo {
    @FindBy(xpath = "//a[@href='/earn-task-fav']")
    private WebElement favoriteTasks;

    @FindBy(xpath = "//div[@id='taskline_2266368']")
    private WebElement task2266368;

    @FindBy(xpath = "//input[@id='check2']")
    private WebElement onlyAvailableCheckBox;

    @FindBy(xpath = "//b[@class='earn-title']")
    private WebElement taskTitle;

    @FindBy(xpath = "//div[@id='task-list']/div")
    private List<WebElement> taskList;

    public List<WebElement> getTaskLest(){
        return taskList;
    }

    // name  //div[@id='task-list']/div[1]/div[2]//b   getText;


    public void favoriteTasksClick(){
        favoriteTasks.click();
    }

    public String getStatusTitle(){
        return taskTitle.getText();
    }

    public boolean ifOnlyAvailableCheckBoxSelected(){
        return onlyAvailableCheckBox.isSelected();
    }

    public List<WebElement> getTaskList(){
        return taskList;
    }


}
