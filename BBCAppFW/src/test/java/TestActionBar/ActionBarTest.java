package TestActionBar;

import CommonMethods.CommonMethodsBBC;
import TobActionBar.ActionBar;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class ActionBarTest extends ActionBar {
    @Test
    public void testActionBar(){
        CommonMethodsBBC cm = PageFactory.initElements(ad,CommonMethodsBBC.class);
        accessibilityAndNotifications();
        ActionBar ab = PageFactory.initElements(ad,ActionBar.class);
        ScrollTopBar();
    }
}
