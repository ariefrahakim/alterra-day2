//package starter.Step;
//
//import net.thucydides.core.annotations.Step;
//import starter.Pages.LoginFeature;
//
//import static org.junit.Assert.assertTrue;
//
//public class LoginFeatureStep {
//
//    LoginFeature login;
//
//    @Step
//    public void openLoginPage(){
//
//        login.open();
//    }
//
//    @Step
//    public void InputUsername(){
//        String username = new String();
//        login.InputUsername(username);
//    }
//
//    @Step
//    public void InputPassword()
//    {
//        String password = new String();
//        login.InputPassword(password);
//    }
//
//    @Step
//    public void clickLoginButton(){
//
//        login.btnLogin();
//    }
//
//    public void verifyLandingPage(){
//        assertTrue(login.verifyLandingHomePage());
//    }
//}
