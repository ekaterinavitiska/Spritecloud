package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigaionPage extends BasicPage{

    public FeaturesPage openFeaturesPage() {
        $(featuresTab).waitUntil(clickable, Configuration.timeout).click();
        return page(FeaturesPage.class);
    }

    public PricingPage openPricingPage() {
        $(pricingTab).waitUntil(clickable, Configuration.timeout).click();
        return page(PricingPage.class);
    }

    public SignUpPage openSignUpPagePage() {
        $(signUpTab).waitUntil(clickable, Configuration.timeout).click();
        return page(SignUpPage.class);
    }
}
