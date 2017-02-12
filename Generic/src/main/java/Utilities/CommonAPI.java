package Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by mukbu on 2/2/2017.
 */
public class CommonAPI {

    public static AppiumDriver ad = null;
    public String deviceName = "N3";
    public String version = "5.0.2";
    public File appDirectory = null;
    public File findApp = null;
    public DesiredCapabilities cap = null;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        appDirectory = new File("C:\\Users\\mukbu\\IdeaProjects\\MobileFramework\\BBCAppFW\\BBCApp");
        findApp = new File(appDirectory, "BBC.apk");
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
//        cap.setCapability("avd",deviceName);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
        ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        ad.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        ad.closeApp();
        ad.quit();
    }
}
