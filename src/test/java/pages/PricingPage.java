package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PricingPage extends BasicPage{
    public By pageTabActive = By.xpath("//*[contains(@class, 'item-active menu-link')][text()='Pricing']");
    public By pricingHeader = By.xpath("//*[contains(@class, 'elementor-heading-title')]");

    public PricingPage() {
        waitPageToLoad();
    }


    public void waitPageToLoad() {
        $(pageTabActive).waitUntil(Condition.visible, Configuration.timeout);
    }

    public String getPricingHeader() {
        return $(pricingHeader).waitUntil(Condition.visible, Configuration.timeout).getText();
    }
}
