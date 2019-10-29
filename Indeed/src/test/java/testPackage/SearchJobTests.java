package testPackage;

import common.MobileAPI;
import indeed.Register;
import indeed.SearchJob;
import org.junit.Ignore;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchJobTests extends MobileAPI {

    Register register ;
    SearchJob searchJob ;

    @BeforeMethod
    public void init() {
        register = PageFactory.initElements(appiumDriver, Register.class);
        searchJob = PageFactory.initElements(appiumDriver, SearchJob.class);
        register.clickOnUseWithOutAcc();
    }

    @Test
    public void jobPageValidation() {
        searchJob.jobPageValidation();
        sleep(5);
    }
    @Test
    public void searchForJob() {
        searchJob.searchForJob();
        sleep(5);
    }
    @Test
    public void isPostAJobClickable() {
        searchJob.postJob();
        sleep(5);
    }
    @Test
    public void scrollDownToReadText() {
        searchJob.scrollDownToReadText();
        sleep(5);
    }
    @Test
    public void clickSignInButton() {
        searchJob.isSignInButtonClickable();
        sleep(5);
    }
}

