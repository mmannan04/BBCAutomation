package TestUI.TestUKUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import UI.UKUI.UK;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by mukbu on 2/3/2017.
 */
public class UKTest extends NavigateMenu {
    @Test
    public void testUK() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        UK uk = PageFactory.initElements(ad, UK.class);
        testMenuBtn();
        uk.UIUK();


    }
}
