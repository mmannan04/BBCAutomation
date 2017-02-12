package UI.WorldUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mukbu on 2/3/2017.
 */
public class World extends NavigateMenu{
    @FindBy(how= How.XPATH,using = "//android.widget.TextView[@text='World')]")
    public static WebElement btnWorld;

    public void UIWorld(){
        btnWorld.click();
    }
}
