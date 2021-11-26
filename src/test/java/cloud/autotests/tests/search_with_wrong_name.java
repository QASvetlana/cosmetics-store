package cloud.autotests.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Feature("Product search")
public class search_with_wrong_name extends TestBase {
    @Test
    @AllureId("5936")
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("search with an error in the name")
    void generatedTest() {
        open("https://www.oriflame.ru/");
        $(byCssSelector(".search__input_HsvAG")).setValue("qwerty");

        $(".popular-products__heading__PZhn").shouldHave(text("Популярные продукты в этом поисковом запросе"));
    };


}
