import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.Registration.*;

public class RegistrationCase extends ChromeRunner {
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();


                                                   // 1. რეგისტრაცია პოზიტიური მნიშვნელობებით
    @Test
    @Description("რეგისტრაციის დადებითი მნიშვნელობებით შემოწმება")
    @Severity(SeverityLevel.BLOCKER)
    public void Registracia() {

        registrationPageSteps.GoToRegPage()
                .MainRegistrationButton()
                .Validations()
                .FirstName(firstName)
                .LastName(lastName)
                .PersonalNumber(personalNumber)
                .PhoneNumber(phone)
                .GenderCh()
                .DateCh()
                .CityCh()
                .AddressCh(address)
                .EmailCh(email)
                .PasswordCh(password)
                .ConfPasswordCh(confirmPassword)
                .Marks()
                .MainRegistrationButton()
                .Agree();
        Assert.assertTrue(registrationPageSteps.checkRegComp.isEnabled(), "უნდა გადავიდეს მთავარ გვერდზე");

    }
                                                   //2. რეგისტრაცია ნეგატიური მნიშვნელობებით
    @Test
    @Description("რეგისტრაციის უარყოფითი მნიშვნელობებით შემოწმება")
    @Severity(SeverityLevel.NORMAL)
    public void RegistraciaNeg(){
        SoftAssert softAssert = new SoftAssert();

        registrationPageSteps.GoToRegPage()
                .FirstName(firstName)
                .LastName(lastName)
                .PersonalNumber(incorrectPersNum)
                .MainRegistrationButton();
        softAssert.assertTrue(registrationPageSteps.persNumNegValid.isDisplayed(), "პირადობის მოწმობა უნდა იყოს 11 ნიშნა ციფრი.");
        registrationPageSteps.PhoneNumber(incorrectPhoneNum);
        softAssert.assertTrue(registrationPageSteps.phoneNumNegValid.isDisplayed(), "ტელეფონის ფორმატი არასწორია");
        registrationPageSteps.EmailCh(incorrectEmail);
        softAssert.assertTrue(registrationPageSteps.emailNegValid.isDisplayed(), "ელ. ფოსტის ფორმატი არასწორია.");
        registrationPageSteps.PasswordCh(incorrectPass);
        softAssert.assertTrue(registrationPageSteps.passNegValid.isDisplayed(), "პაროლის სიგრძე უნდა იყოს 6 სიმბოლოზე მეტი");
        registrationPageSteps.ConfPasswordCh(incorrectConfPass);
        softAssert.assertTrue(registrationPageSteps.confPassNeg.isDisplayed(), "პაროლები არ ემთხვევა");
        registrationPageSteps.GoToRegPage();
        softAssert.assertTrue(registrationPageSteps.regPageText.isDisplayed(), "უნდა დარჩეს რეგისტრაციის გვერდზე");
        softAssert.assertAll();
    }

}
