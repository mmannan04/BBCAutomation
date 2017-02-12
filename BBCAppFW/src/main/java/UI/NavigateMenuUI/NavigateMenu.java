package UI.NavigateMenuUI;

import CommonMethods.CommonMethodsBBC;
import UI.BusinessUI.Business;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mukbu on 2/3/2017.
 */
public class NavigateMenu extends CommonMethodsBBC {
    @FindBy(className = "android.widget.ImageButton")
    public static WebElement btnMenu;
    @FindBy(how=How.XPATH,using = "//android.widget.TextView[@text='More Topics']")
    public static WebElement btnMoreTopics;



//    List<WebElement> listNavigatedItems = new ArrayList<WebElement>();
//    public void getNavigatedItems(){
//        listNavigatedItems = ad.findElements(By.xpath("android.widget.ImageButton"));

    public void testMenuBtn() {
        btnMenu.click();

    }

}

// //android.view.View[@index='1']/android.widget.ImageButton[@index='0']")