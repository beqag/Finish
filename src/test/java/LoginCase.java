import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.Login.*;

public class LoginCase extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

                       //3. ავტორიზაცია პოზიტიური მნიშვნელობებით

    @Test
    @Description("ავტორიზაცია პოზიტიური მნიშვნელობებით")
    @Severity(SeverityLevel.BLOCKER)
    public void Avtorizacia(){
        SoftAssert softAssert = new SoftAssert();

        loginPageSteps.GoToLoginPage()
                .GoToLogin();
        softAssert.assertTrue(loginPageSteps.chEmailValid.isDisplayed(), "იმეილის ველის ვალიდაციის შემოწმება");
        loginPageSteps.PasslValidCh()
                .EmailInput(loginEmail)
                .EmailValidChNeg()
                .PassInput(password)
                .PasslValidChNeg()
                .GoToLogin()
                .ChLoginComp();
        softAssert.assertAll();

    }

                       //4. ავტორიზაცია ნეგატიური მნიშვნელობებით
    @Test
    @Description("ავტორიზაცია ნეგატიური მნიშვნელობებით")
    @Severity(SeverityLevel.NORMAL)
    public void AvtorizaciaNeg(){
        loginPageSteps.GoToLoginPage()
                .GoToLogin()
                .EmailValidCh()
                .PasslValidCh()
                .EmailInput(loginEmailNeg1)
                .EmailValidChForm()
                .GoToLogin()
                .GoToLoginCh()
                .EmailInput(loginEmailNeg2)
                .PassInput(loginPassword)
                .GoToLogin();
        Assert.assertTrue(loginPageSteps.loginErrorText.isEnabled(), "ავტორიზაციის პროცესის შეწყვეტის დადასტურება არასწორი მონაცემების გამო");
    }
}
