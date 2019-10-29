package indeed;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SearchJob extends MobileAPI {
    @FindBy(xpath = "//android.widget.EditText[@resource-id='qinput']")
    WebElement jobType;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='linput']")
    WebElement jobLocation;
    @FindBy(xpath = "//android.widget.Button[@ text='Find Jobs']")
    WebElement findJobs;
    @FindBy(xpath = "//android.view.View[@text='Post a Job']\n")
    WebElement postJob;
    @FindBy(xpath = "//android.view.View[@text='for employers']")
    WebElement employersIndeed;
    @FindBy(xpath = "//android.view.View[@text='Terms Of Service']")
    WebElement terms;
    @FindBy(xpath = "//android.view.View[@text='Sign in']")
    WebElement signIn;
    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id\t='com.google.android.gms:id/credential_picker_layout']")
    WebElement suggestions;




    public void jobPageValidation() {
        if (appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']")).isDisplayed()) {

            SoftAssert softAssertion= new SoftAssert();
            softAssertion.assertEquals(jobType.isDisplayed(),true);
            softAssertion.assertEquals(jobLocation.isDisplayed(),true);
            softAssertion.assertEquals(findJobs.isDisplayed(),true);
            softAssertion.assertAll();
        }
    }


    public void searchForJob()  {
        sleep(3);
        jobType.click();
        jobType.sendKeys("QA Analyst");
        jobLocation.click();
        jobLocation.sendKeys("New York");
        findJobs.click();
    }

    public void postJob()  {
        sleep(3);
        String jobText = postJob.getText();
        System.out.println("clicking on"+jobText);
        postJob.click();
        Assert.assertEquals(employersIndeed.isDisplayed(),true);
        System.out.println(postJob + ": has been clicked");
        sleep(4);
    }
    public void scrollDownToReadText(){
        sleep(3);
        MobileAPI.functionSwipe("up", 200, 200);
        String termsText = terms.getText();
        System.out.println("reading: "+termsText);
        sleep(4);

    }
    public void isSignInButtonClickable(){
        signIn.click();
        suggestions.isDisplayed();
    }

}
