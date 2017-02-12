package UI.EducationUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import Utilities.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mukbu on 2/3/2017.
 */
public class Education extends NavigateMenu {
    @FindBy(how= How.XPATH,using ="//android.widget.TextView[@text='Education & Family')]")
    public static WebElement btnEducation;

    public void UIEducation(){
        btnEducation.click();
    }
}
