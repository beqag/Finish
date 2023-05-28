package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class FilterPageSteps extends LoginPage {

    @Test
    @Step("ფილტრში სორტირების შემოწმების მეთოდი")
    public FilterPageSteps FilterC() {
        SoftAssert softAssert = new SoftAssert();
        $(byId("footwear")).click();
        $(byId("new")).hover();
        sleep(500);
        $(byClassName("fa-sort-amount-up")).click();
        int count = $$(byClassName("scale")).size();
        String price = $(byClassName("special"), 0).getText();
        float firstPriceFloat = Float.parseFloat(price);
        for (int i = 1; i <= count; i++) {
            String secondPrice = $(byClassName("special"), i).getText();
            Float secondPriceFloat = Float.parseFloat(secondPrice);
            softAssert.assertTrue(secondPriceFloat >= firstPriceFloat, "თანმიმდევრობის გადამოწმება");
            firstPriceFloat = secondPriceFloat;
            softAssert.assertAll();
        }
        return this;


    }
}
