package clicker;

import clicker.Seosprint.WorkSeo;
import clicker.helpers.PageKeeper;
import clicker.helpers.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/**
 * Created by oleg on 27.08.2020.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        WorkSeo workSeo = new WorkSeo(driver);

        workSeo.autorize(driver);



        while (true) {
            workSeo.makeSurf();
            if (PageKeeper.getInstance().flag)
                workSeo.doTasks();
            Waiters.timeout(600, 1200);
            driver.navigate().refresh();
        }

    }
}
