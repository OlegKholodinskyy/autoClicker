package clicker.Seosprint.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleg on 08.09.2020.
 */
public class SurfPageSeo {

    @FindBy(xpath = "//div[@id='block-main']")
    private WebElement mainBlockWithSurf;



    public List<WebElement> getSurfBlocks() {
        List<WebElement> surfBlocks = new ArrayList<WebElement>();
        try {
            surfBlocks = mainBlockWithSurf.findElements(By.xpath("./div[@class='adv-line']"));
            System.out.println(surfBlocks.size());
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getCause());
            System.out.println("0");
        }
        return surfBlocks;
    }

    public List<WebElement> getSurfBlocksHight() {
        List<WebElement> surfBlocksHight = new ArrayList<WebElement>();
        try {
            surfBlocksHight = mainBlockWithSurf.findElements(By.xpath("./div[@class='adv-line-high']"));
            System.out.println(surfBlocksHight.size());

        } catch (StaleElementReferenceException e) {
            System.out.println(e.getCause());
            System.out.println("0");
        }
        return surfBlocksHight;
    }

}
