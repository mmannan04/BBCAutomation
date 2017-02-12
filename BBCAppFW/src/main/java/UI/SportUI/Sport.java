package UI.SportUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import Utilities.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mukbu on 2/3/2017.
 */
public class Sport extends NavigateMenu{
    @FindBy(how = How.XPATH,using = "")
    public static WebElement btnSport;

    public void UISport(){
        btnSport.click();
    }
}