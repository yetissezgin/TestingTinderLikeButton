package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CommonMethods {
	
	static AndroidDriver<MobileElement> driver;
	static WebDriverWait wait;
	static int totalnumber=0;
	
	public static void CommonMethods() {
	}
	
	public static void setUp() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "330038ae578b93c9");
		cap.setCapability("appPackage", "com.tinder");
		cap.setCapability("appActivity", "com.tinder.activities.MainActivity");
		cap.setCapability("clearSystemFiles",true);
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	}
	public static void click(By path) {
		driver.findElement(path).click();
	}
	public static void waitAndClick(By path) {
		wait= new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(path)).click();
	}
	public static void waitForAProfile(By path) {
		wait= new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(path));
	}
	public static void clickLike(By path)
	{
		if (!checkIfCreditAvailabable()) {
			click(path);
			totalnumber++;
			wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("android.support.v7.widget.RecyclerView")));
			clickLike(path);
		}
		else
		{
			totalnumber--;
			driver.navigate().back();
		}
	}
	public static boolean checkIfCreditAvailabable() {
		boolean any = false;
		try {
			any=driver.findElementById("com.tinder:id/paywall_perk_background").isDisplayed();
		}catch(Exception x) {}
		return any;
	}
	public static void closeConnection()
	{
		driver.closeApp();
	}

	
}
