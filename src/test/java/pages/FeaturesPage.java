package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FeaturesPage extends BasicPage{
    public By pageTabActive = By.xpath("//*[contains(@class, 'item-active menu-link')][text()='Features']");

    public FeaturesPage() {
        waitPageToLoad();
    }

    public void waitPageToLoad() {
        $(pageTabActive).waitUntil(Condition.visible, Configuration.timeout);
    }
}
