package TestUI.TestSearchTUI;

import CommonMethods.CommonMethodsBBC;
import UI.NavigateMenuUI.NavigateMenu;
import UI.SearchTopicsUI.SearchTopics;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class TestSearchTopics extends NavigateMenu {

    @Test
    public void testSearchNews() {
        CommonMethodsBBC cm = PageFactory.initElements(ad, CommonMethodsBBC.class);
        accessibilityAndNotifications();
        SearchTopics st = PageFactory.initElements(ad, SearchTopics.class);
        st.SearchBBC();


    }
}
