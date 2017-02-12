package TestUI.TestEducationUI;

import CommonMethods.CommonMethodsBBC;
import UI.BusinessUI.Business;
import UI.EducationUI.Education;
import UI.NavigateMenuUI.NavigateMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class EducationTest extends NavigateMenu {
    @Test
    public void testEducation() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        Education e = PageFactory.initElements(ad, Education.class);
        testMenuBtn();
        e.UIEducation();


    }

}
