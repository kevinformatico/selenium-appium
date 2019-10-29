package driver;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverFactory {
    protected static AndroidDriver driver;
    public static final String appName = "Flipkart.3.0.apk";
    public static final String APP_DIR = "/src/test/java/apk";

    public DriverFactory() throws MalformedURLException {
        initializeAppiumSession();
    }

    protected void initializeAppiumSession() throws MalformedURLException {
//        configureSessionForDevice();
        configureSessionForEmulator();
    }

    // Enter your android device details
    private void configureSessionForDevice() throws MalformedURLException {
        File app = getAppFile();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device", Device.device);

        //mandatory capabilities
        capabilities.setCapability("deviceName", Device.deviceName);
        capabilities.setCapability("platformName", Device.platformName);

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL(Device.URL), capabilities);
    }

    //Standard Emulator details, however customize it based on your avd
    private void configureSessionForEmulator() throws MalformedURLException {
        File app = getAppFile();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        //mandatory capabilities
        capabilities.setCapability("deviceName", Emulator.deviceName);
        capabilities.setCapability("platformName", Emulator.platformName);
//        capabilities.setCapability("platformVersion", Emulator.platformVersion);
//        capabilities.setCapability("avd", Emulator.avd);
        capabilities.setCapability("udid", "192.168.133.101:5555");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("appPackage", Emulator.appPackage);
//        capabilities.setCapability("appActivity", Emulator.appActivity);
        driver =  new AndroidDriver(new URL(Emulator.URL), capabilities);
    }

    private File getAppFile() {

        File rootPath = new File(System.getProperty("user.dir"));
    	File appDir = new File(rootPath, APP_DIR);
        return new File(appDir, appName);
    }

    public void killAppiumSession(){
        driver.quit();
    }
}