package TestUI.TestScotlandUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import UI.ScotlandUI.Scotland;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class ScotlandTest extends NavigateMenu {

    @Test
    public void testScotland() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        Scotland sl = PageFactory.initElements(ad, Scotland.class);
        testMenuBtn();
        sl.UIScotland();
    }

}
