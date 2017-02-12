package UI.SearchTopicsUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.security.Key;

/**
 * Created by mukbu on 2/3/2017.
 */
public class SearchTopics extends NavigateMenu{
    @FindBy(xpath="//android.widget.ImageView[@content-desc='More options']")
    public static WebElement btnListView;
    @FindBy(how= How.XPATH,using="//android.widget.TextView[contains(@resource-id,'bbc.mobile.news.uk:id/title')]")
    public static WebElement linkSearchTopic;
    @FindBy(how= How.XPATH,using="//android.widget.EditText[contains(@resource-id,'bbc.mobile.news.uk:id/search_src_text')]")
    public static WebElement linkSearchUSA;

//    xpath("//class name [contains(@resource-id,'resource-id')]"
    public void SearchBBC(){
        btnListView.click();
        linkSearchTopic.click();
        linkSearchUSA.sendKeys("USA", Keys.ENTER);


    }
}
