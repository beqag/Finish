import StepObject.FilterPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class FilterCase extends ChromeRunner {
    FilterPageSteps filterPageSteps = new FilterPageSteps();

    //                      6. ფილტრის ტესტირება

        @Test
        @Description("ფილტრის ტესტირება")
        @Severity(SeverityLevel.NORMAL)
    public void Filtri(){
        filterPageSteps.FilterC();
        }
    }
