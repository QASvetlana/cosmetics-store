package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class search_for_shampoo {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("tests1")
    void generatedTest() {
        open("https://www.oriflame.ru/");
        $(byCssSelector(".search__input_HsvAG")).setValue("Шампунь");

        $(".popular-search-queries__query-link__xoST").shouldHave(text("шампунь"));
    };


}


