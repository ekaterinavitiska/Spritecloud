package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.*;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class BasicTests {
    public final String mainHeader =  "Automated Test Results Dashboard";
    public final String featuresHeader =  "Features";
    public final String pricingHeader =  "Simple and affordable pricing";
    NavigaionPage navigaionPage = new NavigaionPage();

    @Before
    public void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.timeout = 1000;
        open("https://www.calliope.pro/");
        navigaionPage.clickAcceptCookies();
    }

    @After
    public void afterAll() {
        WebDriverRunner.closeWebDriver();
    }

    @Test
    public void simpleNavigationTest() {
        Assert.assertEquals(navigaionPage.getHeaderText(), mainHeader);
        FeaturesPage featuresPage = navigaionPage.openFeaturesPage();
        Assert.assertEquals(featuresPage.getHeaderText(), featuresHeader);
        PricingPage pricingPage = navigaionPage.openPricingPage();
        Assert.assertEquals(pricingPage.getPricingHeader(), pricingHeader);
    }

    // failing because of the problem with selectors on page
    @Ignore
    public void createUserUnsuccessfullTest() {
        SignUpPage signUpPage = navigaionPage.openSignUpPagePage();
        signUpPage.setUserName("testUser");
        signUpPage.setUserPassword("password");
        signUpPage.clickCreateUserButton();
        Assert.assertTrue(signUpPage.getErrorMessageText().contains("aaaa"));
    }
}
