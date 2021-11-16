package testOzon;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SortMenu {
    private SelenideElement sort = $("[role=\"combobox\"]");
    private ElementsCollection menu = $$(".ui-J3");

    public NotePage searchResults() {
        sort.click();
        menu.find(exactText("Сначала дорогие")).click();
        return new NotePage();
    }
}
