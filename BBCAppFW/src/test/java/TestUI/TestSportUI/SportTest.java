package TestUI.TestSportUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import UI.SportUI.Sport;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class SportTest extends NavigateMenu {

    @Test
    public void testSport() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        Sport s = PageFactory.initElements(ad, Sport.class);
        testMenuBtn();
        s.UISport();
    }
}

