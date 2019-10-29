package testPackage;

import common.MobileAPI;
import indeed.Register;
import indeed.SearchJob;
import indeed.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends MobileAPI {
    Register register;
    SignIn signIn;
    SearchJob searchJob;

    @BeforeMethod
    public void init() {
        register = PageFactory.initElements(appiumDriver, Register.class);
        searchJob = PageFactory.initElements(appiumDriver, SearchJob.class);
        signIn = PageFactory.initElements(appiumDriver, SignIn.class);
        register.clickOnUseWithOutAcc();
        searchJob.isSignInButtonClickable();
    }


//    @Test
//    public void UiValidations() {
//        signIn.DisMissSuggestion();
//        signIn.acceptSuggestion();
//        signUpPage.sigIn("Hisham","hello123");
//        sleep(3);
    }

