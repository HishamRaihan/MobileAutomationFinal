package indeed;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Register extends MobileAPI {


    @FindBy(xpath = "//android.view.View[@text='Sign in'and@index='2']")
    WebElement signInButton;
    @FindBy(xpath = "//android.view.View[@text='Create account'and@index='3']")
    WebElement createAccount;
    @FindBy(xpath = "//android.view.View[@text='Have an account?']")
    WebElement withAnAccount;
    @FindBy(xpath = "//android.view.View[@text='Use without account']")
    WebElement useWithOutAcc;


    public void UIvalidations() {
        sleep(10);
        if (signInButton.isDisplayed()) {
            System.out.println(signInButton.getText() + " : is displayed");
        }
        if (createAccount.isDisplayed()) {
            System.out.println(createAccount.getText() + " : is displayed");
        }
        if (withAnAccount.isDisplayed()) {
            System.out.println(withAnAccount.getText() + " : is displayed");
        }
        if (useWithOutAcc.isDisplayed()) {
            System.out.println(useWithOutAcc.getText() + " : is displayed");
        }
    }



    public void clickOnUseWithOutAcc()  {
        sleep(10);
        //ad.findElement(By.xpath("abcd")).click();
        String account = useWithOutAcc.getText();
        useWithOutAcc.click();
        TestLogger.log(" message ");
        System.out.println(account + ": has been clicked");
    }

    public void clickOnSignIn()  {
        sleep(3);
        String signIn = signInButton.getText();
        signInButton.click();
        System.out.println(signIn + ": has been clicked");
        sleep(4);

    }
    public void createAccount(){
        sleep(3);
        String text = createAccount.getText();
        createAccount.click();
        System.out.println(text + ": has been clicked");
        sleep(4);

    }
    public void haveAnAccount() {
        sleep(3);
        String text = withAnAccount.getText();
        withAnAccount.click();
        System.out.println(text + ": has been clicked");
        sleep(4);

    }

    public void swipeDown(){
        sleep(5);
        MobileAPI.functionSwipe("up", 200, 200);

    }
}
