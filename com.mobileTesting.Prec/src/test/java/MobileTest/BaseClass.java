package MobileTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass extends Reports {
	AndroidDriver driver = null;

	public void setup() {
		// Gather Desired capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium:deviceName", "Xiaomi M2006C3LII");
		capabilities.setCapability("udid", "41fc4872"); // give your phone id get from adb divices
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("appium:platformVersion", "10");
		capabilities.setCapability("appium:noReset", true);
		capabilities.setCapability("appium:skipDeviceInitialization", true);
		capabilities.setCapability("appium:skipServerInstallation", true);

		/*
		 * the number of second the appium server should wait for clients to send
		 * commands before deciding that client has gone away and the session should
		 * shut down
		 */
		capabilities.setCapability("appium:newComandsTimeout", 60);
		capabilities.setCapability("app", "complete path of apk file with full name");
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("chromedriverExecutable", "full path of driver from driver folderUrl");
		URL url = null;
		try {
			url = URI.create("http://127.0.0.1:4723").toURL();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver(url, capabilities);

		// Initialize Android driver
		// AndroidDriver driver = new AndroidDriver(new
		// URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}