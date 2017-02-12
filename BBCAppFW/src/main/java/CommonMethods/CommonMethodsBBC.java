package CommonMethods;

import Utilities.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by mukbu on 2/3/2017.
 */
public class CommonMethodsBBC extends CommonAPI {

    @FindBy(how= How.XPATH,using="//android.widget.TextView[contains(@resource-id,'android:id/alertTitle')]")
    public static WebElement btnAccessibility;
    @FindBy(how= How.XPATH,using="//android.widget.Button[contains(@resource-id,'android:id/button1')]")
    public static WebElement btnAccessibilityYes;

    @FindBy(how= How.XPATH,using="//android.widget.TextView[@text='Push notifications']")
    public static WebElement btnPushNotifications;
    @FindBy(how=How.XPATH,using =" //android.widget.Button[contains(@resource-id,'bbc.mobile.news.uk:id/push_no')]")
    public static WebElement btnPushNotificationsNo;

    public void accessibilityAndNotifications(){
        btnAccessibilityYes.click();
        btnPushNotificationsNo.click();
    }

}
