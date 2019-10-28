package testCases;

import common.MobileAPI;
import homepage.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MobileAPI {
    SignInPage signInPage;
    @BeforeMethod
    public void initElements(){
        signInPage= PageFactory.initElements(appiumDriver,SignInPage.class);
    }

    @Test(enabled = false)
    public void searchBarTest() {
        signInPage.searchBar();

    }
    @Test(priority = 0)
    public void validateEbayLogo(){
        signInPage.ebayLogo();
    }
    @Test(priority = 1)
    public void validateDealsElement(){
        signInPage.dealsElement();
    }
    @Test(priority = 2)
    public void validateSignIn(){
       signInPage.signIn();
       appiumDriver.navigate().back();
    }
    @Test(priority = 3)
    public void validateMainNavigation(){
        signInPage.mainNavigation();
    }
    @Test(enabled = false)
    public void validateSignInMainNavigate(){
        signInPage.signInMainNavigate();
        appiumDriver.navigate().back();
    }@Test(enabled = true)
    public void validateSearchShopping(){
        signInPage.searchShopping();
    }



}
