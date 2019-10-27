package indeed;

import common.MobileAPI;
import org.testng.annotations.Test;

public class SignIn extends MobileAPI {
    @Test
    public void signIn(){
        clickByXpath("//android.view.View[@text=\"Create account\"]");
    }
}
