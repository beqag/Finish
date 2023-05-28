package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShopBasketPage {
    public SelenideElement
    downAccess = $(byId("accessories")),
            chProductPage = $(byLinkText("ქამარი")),
                    chProduct = $(byClassName("scale"), 2),
                            chProdPage = $(byText("Geox ქამარი")),
                                    chSize = $(byClassName("scale"), 1),
                                            addInBasket = $(byText("კალათაში დამატება / ონლაინ შეძენა")),
                                                   chAddInBasket = $(byText("\"Geox ქამარი\" დამატებულია კალათაში.")),
                                                           goBasketPage = $(byClassName("btn-outline-dark"), 1),
                                                                   chBasketPage = $(byText("გადახდა / განვადება")),
                                                                           payButton = $(byClassName("button-cont"), 1),
                                                                                   chPayButton = $(byText("ავტორიზაცია"));



}
