package clicker.Seosprint;

import clicker.Seosprint.Pages.*;
import clicker.helpers.PageKeeper;
import clicker.helpers.Waiters;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by oleg on 28.08.2020.
 */
public class WorkSeo {

    public WorkSeo(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private StartPageSeo startPageSeo;
    private MainPageSeo mainPageSeo;
    private SurfPageSeo surfPageSeo;
    private TaskPageSeo taskPageSeo;
    private Task2266368Page task2266368Page;

    static PageKeeper pageKeeper = PageKeeper.getInstance();

    public void makeSurf() {

        mainPageSeo = PageFactory.initElements(driver, MainPageSeo.class);
        surfPageSeo = PageFactory.initElements(driver, SurfPageSeo.class);

        mainPageSeo.earnButtonClick();
        mainPageSeo.clickSurfRef();

        pageKeeper.addPageToMap("seoSprintSurfPage", driver.getWindowHandle());

        List<WebElement> surfBlock = surfPageSeo.getSurfBlocks();
        List<WebElement> surfBlocksHight = surfPageSeo.getSurfBlocksHight();
        surfBlocksHight.addAll(surfBlock);
        if (surfBlocksHight.size() > 0) {
            for (WebElement ref : surfBlocksHight) {
                // for reason if array changes during runtime
                try {
                    //click to surf block
                    ref.click();
                    Waiters.timeout(5, 15);
                    //click to references
                    WebElement refSurf = ref.findElement(By.xpath(".//a[@class='gosurf']"));
                    refSurf.click();

                    Waiters.timeout(5, 10);
                    // switch to last tab
                    for (String tab : driver.getWindowHandles()) {
                        driver.switchTo().window(tab);
                    }

                    Waiters.timeout(40, 50);
                    driver.findElement(By.className("stext")).click();
                    Waiters.timeout(2, 3);
                    driver.close();

                    driver.switchTo().window(PageKeeper.getInstance().getPages().get("seoSprintSurfPage"));

                } catch (NotFoundException e) {
                    System.out.println(e.getCause());
                    System.out.println("element not found");
                }
            }
        } else {
            System.out.println("Elements for surf not found");
        }
    }


    private void doAutorise() {
        Waiters.timeout(7, 10);
        startPageSeo.fillEmailField();
        Waiters.timeout(7, 10);
        startPageSeo.fillPassField();
        Waiters.timeout(15, 20);
        startPageSeo.clickLogInButton();
    }


    public void autorize(WebDriver driver) {
        driver.get("https://seosprint.net/");
        pageKeeper.addPageToMap("seosprintStartPage", driver.getWindowHandle());
        startPageSeo = PageFactory.initElements(driver, StartPageSeo.class);
        startPageSeo.clickSignInButton();
        doAutorise();
    }

    public void doTasks() {
        mainPageSeo.clickTaskRef();

        taskPageSeo = PageFactory.initElements(driver, TaskPageSeo.class);
        taskPageSeo.favoriteTasksClick();

        pageKeeper.addPageToMap("seoFavoriteTaskPage", driver.getWindowHandle());


        List<WebElement> taskList = taskPageSeo.getTaskLest();
        List<String> taskNames = new ArrayList<String>();

        if (taskList.size() != 0) {
            for (WebElement e : taskList) {
                String idTask = e.getAttribute("id");
                taskNames.add(idTask);
            }
            PageKeeper.getInstance().flag = false;
        }

        for (String nameOfTask : taskNames) {
            switch (nameOfTask) {
                case "taskline_2266368":

                    driver.findElement(By.xpath("//div[@id='taskline_2266368']/div[2]/a")).click();
                    task2266368Page = PageFactory.initElements(driver, Task2266368Page.class);
                    pageKeeper.addPageToMap("seoTask2266368", driver.getWindowHandle());

                    task2266368Page.startTaskButtonClick();

                    StringBuilder stringBuilder = new StringBuilder();

                    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
                    driver.get("https://www.facebook.com/Guy-Julius-Caesar-116122016461538");


                    driver.switchTo().window(pageKeeper.getPages().get("seoTask2266368"));

                    task2266368Page.printIntoTextAreaReport("test_111");


                    System.out.println(nameOfTask + " name");
                    break;

                case "taskline_1002002":
                    System.out.println(nameOfTask + " name");
                    break;
                default:
                    System.out.println("Task not found");
                    break;

            }
        }
    }
}




