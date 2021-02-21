package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public By header = By.xpath("//div[@class ='elementor-slide-heading']");

    public By featuresTab = By.xpath(("//*[contains(@href,'/features/')]"));
    public By pricingTab = By.xpath(("//*[contains(@href,'/pricing/')]"));

    public By signUpTab = By.xpath(("//*[contains(@href,'/users/sign_up')]"));
    public By headersButton = By.xpath(("//*[text()='Accept']"));


    Condition clickable = and("can be clicked", visible, enabled);


    public String getHeaderText() {
        return $(header).waitUntil(Condition.visible, Configuration.timeout).getText();
    }

    public void clickAcceptCookies() {
        if ($(headersButton).is(Condition.visible))
            $(headersButton).click();
    }

}
