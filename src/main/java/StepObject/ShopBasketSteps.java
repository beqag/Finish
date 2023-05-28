package StepObject;

import PageObject.ShopBasketPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class ShopBasketSteps extends ShopBasketPage {
    @Step("აქსესუარების ღილაკის ჩამოშლა")
    public ShopBasketSteps DownAccess(){
        downAccess.hover();
        return this;
    }

    @Step("კონკრეტული კატეგორიის არჩევა")
    public ShopBasketSteps ChProductType(){
        chProductPage.click();
        return this;
    }

    @Step("კონკრეტული პროდუქტის არჩევა")
    public ShopBasketSteps ChProduct(){
        chProduct.click();
        return this;
    }

    @Step("პროდუქტზე გადასვლის შემოწმება")
    public ShopBasketSteps ChProdPage(){
        chProdPage.shouldBe(Condition.visible);
        return this;
    }

    @Step("ზომის არჩევა")
    public ShopBasketSteps ChSize(){
        chSize.click();
        return this;
    }

    @Step("კალათაში დამატება")
    public ShopBasketSteps AddInBasket(){
        addInBasket.click();
        return this;
    }

    @Step("კალათაში პროდუქტის დამატების შემოწმება")
    public ShopBasketSteps ChAddInBasket(){
        chAddInBasket.shouldBe(Condition.visible);
        return this;
    }

    @Step("კალათაში გადასვლა")
    public ShopBasketSteps GoBasketPage(){
        goBasketPage.click();
        return this;
    }

    @Step("კალათაში დამატებული პროდუქტის შემოწმება")
    public ShopBasketSteps ChBasketPage(){
        chBasketPage.shouldBe(Condition.visible);
        return this;
    }

    @Step("გადახდის ღილაკზე კლიკი")
    public ShopBasketSteps PayButton(){
        payButton.click();
        return this;
    }

    @Step("გადამოწმება, რომ ითხოვს ავტორიზაციას")
    public ShopBasketSteps ChPayButton(){
        chPayButton.shouldBe(Condition.visible);
        return this;
    }
}
