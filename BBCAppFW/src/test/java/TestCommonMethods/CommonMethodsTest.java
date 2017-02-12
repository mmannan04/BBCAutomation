package TestCommonMethods;

import CommonMethods.CommonMethodsBBC;
import Utilities.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by mukbu on 2/3/2017.
 */
public class CommonMethodsTest extends CommonMethodsBBC {
  @Test
    public void testCommonMethods(){
      CommonMethodsBBC cm = PageFactory.initElements(ad,CommonMethodsBBC.class);
      accessibilityAndNotifications();
  }
}
