package UI.BusinessUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import Utilities.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mukbu on 2/3/2017.
 */
public class Business extends NavigateMenu{
    @FindBy(how= How.XPATH,using="//android.widget.TextView[@text='Scotland']")
    public static WebElement btnBusiness;

    public void UIBusiness(){
        btnBusiness.click();
    }

}
