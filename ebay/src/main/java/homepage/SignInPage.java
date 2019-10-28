package homepage;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@text='Search for anything']")
    WebElement searchBar;
    public void searchBar() {
        searchBar.click();
    }

    @FindBy(xpath = "//android.widget.TextView[@text='DEALS']")
    WebElement DEALS;
    public void dealsElement() {
        DEALS.click();
    }

    @FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    WebElement signIn;
    public void signIn() {
        signIn.click();
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    WebElement NavigationElements;
    public void mainNavigation() {
        NavigationElements.click();
    }

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Sign in,double tap to activate\"]\n")
    WebElement signInMainNavigateElements;
    public void signInMainNavigate() {
        mainNavigation();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")
   WebElement searchBarElement;
    public void searchShopping() {
        searchBarElement.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"eBay\"]")
    WebElement ebayLogo;

    public void ebayLogo() {
        ebayLogo.click();
        appiumDriver.getTitle();
        appiumDriver.navigate().back();

    }


}