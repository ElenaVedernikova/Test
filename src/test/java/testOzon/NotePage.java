package testOzon;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class NotePage {

    private ElementsCollection menuBrend = $$(".g1p7");
    private ElementsCollection menuBrendAll = $$(".g1o");

    public ResultsPage resultsPage() {
        menuBrendAll.find(exactText("Посмотреть все")).click();
        menuBrend.find(exactText("MSI")).click();
        menuBrend.find(exactText("Razer")).click();
        return new ResultsPage();
    }
}
