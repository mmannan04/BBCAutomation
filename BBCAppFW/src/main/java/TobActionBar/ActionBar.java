package TobActionBar;

import CommonMethods.CommonMethodsBBC;
import Utilities.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mukbu on 2/3/2017.
 */
public class ActionBar extends CommonMethodsBBC {
    @FindBy(how= How.XPATH,using= "//android.widget.TextView[@text='Top Stories']")
    public static WebElement linkTopStories;
    @FindBy(how= How.XPATH,using= "//android.widget.TextView[@text='My News']")
    public static WebElement linkMyNews;
    @FindBy(how= How.XPATH,using= "//android.widget.TextView[@text='Popular']")
    public static WebElement linkPopular;
    @FindBy(how= How.XPATH,using= "//android.widget.TextView[@text='Video']")
    public static WebElement linkVideo;


    public void ScrollTopBar(){
        linkTopStories.click();
        linkMyNews.click();
        linkPopular.click();
        linkVideo.click();

    }


}
