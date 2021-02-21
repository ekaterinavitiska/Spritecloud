package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage extends BasicPage {

    public By userEmail = By.id("user_email");
    public By userPassword = By.id("user_password");
    public By userPasswordConfirmation = By.id("user_password_confirmation");
    public By createUserButton = By.xpath("//button[text()= ' Create account']");
    public By errorTab = By.className("pnotify-text");

    public SignUpPage() {
        waitPageToLoad();
    }

    public void waitPageToLoad() {
        $(userEmail).waitUntil(Condition.visible, Configuration.timeout);
    }

    public void setUserName(String userName) {
        $(userEmail).waitUntil(Condition.visible, Configuration.timeout).setValue(userName);
    }

    public void setUserPassword(String password) {
        $(userPassword).waitUntil(Condition.visible, Configuration.timeout).setValue(password);
    }

    public void setUserPasswordConfirmation(String confirm) {
        $(userPasswordConfirmation).waitUntil(Condition.visible, Configuration.timeout).setValue(confirm);
    }

    public void clickCreateUserButton() {
        $(createUserButton).waitUntil(clickable, Configuration.timeout).click();
    }

    public String getErrorMessageText() {
        return $(errorTab).waitUntil(Condition.visible, Configuration.timeout).getText();
    }
}
