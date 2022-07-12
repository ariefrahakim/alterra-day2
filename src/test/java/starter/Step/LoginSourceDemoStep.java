package starter.Step;

import net.thucydides.core.annotations.Step;
import starter.Pages.LoginSourceDemo;
import static org.junit.Assert.*;

public class LoginSourceDemoStep {

    LoginSourceDemo loginPage;


    @Step
    public void openLoginPage(){
        loginPage.open();
    }

    @Step
    public void InputUsername(){
        loginPage.InputUsername();
    }

    @Step
    public void InputPassword(){
        loginPage.InputPassword();
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    public void inputInvalidUsername(){
        loginPage.inputInvalidUsername();
    }

    public void inputInvalidPassword(){
        loginPage.inputInvalidPassword();
    }

    @Step
    public void inputValidAnotherAcc(){
        loginPage.inputValidAnotherAcc();
    }

    public void verifyErrorMassage(){
        assertTrue(loginPage.verifyErrorMassage());
    }
}
