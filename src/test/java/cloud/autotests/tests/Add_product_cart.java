package cloud.autotests.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Feature("Product search")
public class Add_product_cart extends TestBase {
    @Test
    @AllureId("5938")
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Add product card to cart")
    void generatedTest() {
        open("https://www.oriflame.ru/");
        $(byCssSelector(".search__input_HsvAG")).setValue("мыло");
        $(byCssSelector(".product-tile__title_dn24H")).click();
        $(byText("Купить")).click();
        $(".shopping-bag-counter_nZmuv").shouldHave(text("1"));
    };


}
