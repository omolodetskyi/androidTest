package screenObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrefDependenciesScreen {

	public PrefDependenciesScreen(AppiumDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	@AndroidFindBy(id="android:id/checkbox")
	public MobileElement wifiCheckbox;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='WiFi settings']")
	public MobileElement wifiSettings;
	@AndroidFindBy(className="android.widget.EditText")
	public MobileElement wifiTextBox;
	@AndroidFindBy(id="android:id/button1")
	public MobileElement oKButton;
}
