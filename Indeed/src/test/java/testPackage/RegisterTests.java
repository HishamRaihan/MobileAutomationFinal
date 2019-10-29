package testPackage;

import common.MobileAPI;
import indeed.Register;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTests extends MobileAPI {

    Register register;
    @BeforeMethod
    public void init() {
        register = PageFactory.initElements(appiumDriver, Register.class);
    }


    @Test
    public void UiValidations() {
        register.UIvalidations();
    }

    @Test
    public void signIn() {
        register.clickOnSignIn();
    }

    @Test
    public void isAccountClickable() {
        register.createAccount();
    }

    @Test
    public void TExtOfHaveAnAccount() { register.haveAnAccount();
    }
    @Test
    public void clickOnUseWithOutAcc() {
        register.clickOnUseWithOutAcc();
    }

}

