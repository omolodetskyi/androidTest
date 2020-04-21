package tests;

import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.android.AndroidDriver;
import screenObjects.MainScreen;
import screenObjects.PrefDependenciesScreen;
import screenObjects.PreferenceScreen;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class WifiPreferenceTest extends TestBase{
	AndroidDriver driver;
	MainScreen mainScreen;
	PreferenceScreen preferenceScreen;
	PrefDependenciesScreen prefDependeciesScreen;
  @Test
  public void checkWifi() {
	boolean wifiSettingsEnabled=false; 
	mainScreen.preferenceMenuItem.click();
	preferenceScreen.prefDependenciesMenuItem.click();
	prefDependeciesScreen.wifiCheckbox.click();
	wifiSettingsEnabled=prefDependeciesScreen.wifiSettings.isEnabled();
	Assert.assertEquals(wifiSettingsEnabled, true);
	prefDependeciesScreen.wifiSettings.click();
	prefDependeciesScreen.wifiTextBox.sendKeys("hello");
	String actualText=prefDependeciesScreen.wifiTextBox.getText();
	Assert.assertEquals(actualText, "hello");
	prefDependeciesScreen.oKButton.click();
	}
  @BeforeTest
  public void beforeClass() throws MalformedURLException {
	  driver=myCapabilities();
	  mainScreen=new MainScreen(driver);
	  preferenceScreen=new PreferenceScreen(driver);
	  prefDependeciesScreen=new PrefDependenciesScreen(driver);
  }

}