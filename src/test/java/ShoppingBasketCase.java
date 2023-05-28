import StepObject.ShopBasketSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingBasketCase extends ChromeRunner {
    ShopBasketSteps shopBasketSteps = new ShopBasketSteps();

                        //5. კალათაში პროდუქტის დამატება

    @Test
    @Description("კალათაში პროდუქტის დამატება")
    @Severity(SeverityLevel.BLOCKER)
    public void Basket(){
        shopBasketSteps.DownAccess()
                .ChProductType()
                .ChProduct()
                .ChProdPage()
                .ChSize()
                .AddInBasket()
                .ChAddInBasket()
                .GoBasketPage()
                .ChBasketPage()
                .PayButton()
                .ChPayButton();
        Assert.assertTrue(shopBasketSteps.chPayButton.isDisplayed(), "გადამოწმება, რომ ნივთის შესაძენად სავალდებულოდ ითხოვს ავტორიზაციას");
    }
}
