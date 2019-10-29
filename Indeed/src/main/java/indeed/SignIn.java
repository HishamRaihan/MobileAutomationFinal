package indeed;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SignIn extends MobileAPI {

    public class SignUpPage extends MobileAPI {

        @FindBy(xpath = "//android.widget.TextView[@text='Hisham Raihan']")
        WebElement acceptSuggestion;
        @FindBy(xpath = "//android.widget.Button[@text='NONE OF THE ABOVE']")
        WebElement disMissSuggestion;
        @FindBy(xpath = "//android.widget.EditText[@resource-id='login-email-input']")
        WebElement emailField;
        @FindBy(xpath = "//android.widget.EditText[@resource-id='login-password-input']")
        WebElement passwordField;
        @FindBy(xpath = "//android.widget.Button[@text='Sign In']")
        WebElement signInButton;


        public void DisMissSuggestion() {
            disMissSuggestion.click();
        }

        public void acceptSuggestion() {
            acceptSuggestion.click();
        }

        public void sigIn(String email, String password) {
            emailField.click();
            emailField.sendKeys(email);
            passwordField.click();
            passwordField.sendKeys(password);
            signInButton.click();
        }

        @Test(enabled = false)
        public void signIn() {
            clickByXpath("//android.view.View[@text=\"Create account\"]");
        }
    }
}
