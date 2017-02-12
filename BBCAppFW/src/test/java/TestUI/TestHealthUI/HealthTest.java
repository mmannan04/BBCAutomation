package TestUI.TestHealthUI;

import CommonMethods.CommonMethodsBBC;
import UI.HealthUI.Health;
import UI.NavigateMenuUI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class HealthTest extends NavigateMenu {

    @Test
    public void testHealth() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        Health h = PageFactory.initElements(ad, Health.class);
        testMenuBtn();
        h.UIHealth();
    }

}
