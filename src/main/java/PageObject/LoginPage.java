package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
public SelenideElement
goToLoginPage = $(byClassName("fa-user"), 1),
    goToLogin = $(byText("პროფილში შესვლა")),
    chEmailValid = $(byText("ელ. ფოსტა სავალდებულოა.")),
    chPassValid = $(byText("პაროლი სავალდებულოა.")),
    chEmailForm = $(byText("ელ. ფოსტის ფორმატი არასწორია.")),
    emailInput = $(byAttribute("formcontrolname", "email")),
    passInput = $(byAttribute("formcontrolname", "password")),
    chLoginComp = $(byClassName("fa-sign-out-alt")),
    loginErrorText = $(byText("მომხმარებელის მონაცემები არასწორია."));

}
