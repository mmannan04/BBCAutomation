package TestUI.TestNavigateMenu;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class NavigateMenuTest extends NavigateMenu {
    @Test
    public void testNavigateMenu() {
        CommonMethodsBBC cm = PageFactory.initElements(ad,CommonMethodsBBC.class);
        accessibilityAndNotifications();
        NavigateMenu nm = PageFactory.initElements(ad, NavigateMenu.class);
        testMenuBtn();


    }
}
