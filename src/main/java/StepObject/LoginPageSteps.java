package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static DataObject.Registration.email;

public class LoginPageSteps extends LoginPage {

    @Step("ავტორიზაციის გვერდზე გადასვლა")
    public LoginPageSteps GoToLoginPage(){
        goToLoginPage.click();
        return this;
    }

    @Step("ავტორიზაციის ღილაკზე კლიკი")
    public LoginPageSteps GoToLogin(){
        goToLogin.click();
        return this;
    }

    @Step("ავტორიზაციის გვერდზე გადასვლის დასტური")
    public LoginPageSteps GoToLoginCh(){
        goToLogin.shouldBe(Condition.visible);
        return this;
    }

    @Step("იმეილის ველის ვალიდაციის შემოწმება")
    public LoginPageSteps EmailValidCh (){
        chEmailValid.shouldBe(Condition.visible);
        return this;
    }

    @Step("იმეილის ველის ვალიდაციის შემოწმება")
    public LoginPageSteps EmailValidChNeg (){
        chEmailValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("იმეილის ველის ვალიდაციის შემოწმება")
    public LoginPageSteps EmailValidChForm (){
        chEmailForm.shouldBe(Condition.visible);
        return this;
    }

    @Step("პაროლის ველის ვალიდაციის შემოწმება")
    public LoginPageSteps PasslValidCh (){
        chPassValid.shouldBe(Condition.visible);
        return this;
    }

    @Step("პაროლის ველის ვალიდაციის მოხსნის შემოწმება")
    public LoginPageSteps PasslValidChNeg (){
        chPassValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("იმეილის ველის შევსება მონაცემით: {email}")
    public LoginPageSteps EmailInput (String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("პაროლის ველის შევსება მონაცემით: {pass}")
    public LoginPageSteps PassInput (String pass){
        passInput.setValue(pass);
        return this;
    }

    @Step("ავტორიზაციის წარმატებით გავლის შემოწმება")
    public LoginPageSteps ChLoginComp(){
        chLoginComp.shouldBe(Condition.enabled);
        return this;
    }

    @Step("შეცდომის ტექსტის შემოწმება არასწორი მონაცემების ავტორიზაციის მცდელობის დროს")
    public LoginPageSteps LoginErrorText(){
        loginErrorText.shouldBe(Condition.visible);
        return this;
    }
}
