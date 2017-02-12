package TestUI.TestEnglandUI;

import CommonMethods.CommonMethodsBBC;
import UI.EnglandUI.England;
import UI.NavigateMenuUI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class EnglandTest extends NavigateMenu{

    @Test
    public void testEngland() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        England e = PageFactory.initElements(ad, England.class);
        testMenuBtn();
        e.UIEngland();
    }
}
