package TestUI.TestMagazineUI;

import CommonMethods.CommonMethodsBBC;
import UI.MagazineUI.Magazine;
import UI.NavigateMenuUI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class MagazineTest extends NavigateMenu {

    @Test
    public void testMagazine() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        Magazine m = PageFactory.initElements(ad,Magazine.class);
        testMenuBtn();
        m.UIMagazine();
    }

}
