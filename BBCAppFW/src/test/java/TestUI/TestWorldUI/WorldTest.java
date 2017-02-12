package TestUI.TestWorldUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import UI.WorldUI.World;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class WorldTest extends NavigateMenu {

    @Test
    public void testWorld() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        World wl = PageFactory.initElements(ad,World.class);
        testMenuBtn();
        wl.UIWorld();
    }

}
