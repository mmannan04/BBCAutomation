package UI.EnglandUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import Utilities.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mukbu on 2/3/2017.
 */
public class England extends NavigateMenu{
    @FindBy(how= How.XPATH,using="//android.widget.TextView[@text='England')]")
    public static WebElement btnEngland;

    public void UIEngland(){
        btnEngland.click();
    }
}
