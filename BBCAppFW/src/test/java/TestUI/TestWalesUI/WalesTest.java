package TestUI.TestWalesUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import UI.WalesUI.Wales;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class WalesTest extends NavigateMenu{

    @Test
    public void testWales() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        Wales w = PageFactory.initElements(ad,Wales.class);
        testMenuBtn();
        w.UIWales();
    }

}
