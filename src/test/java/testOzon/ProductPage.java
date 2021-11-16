package testOzon;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private SelenideElement horizontalMenu = $("[data-widget=\"catalogHorizontalMenu\"]");
    private SelenideElement verticalMenu = $(".g4x0");

    public SortMenu menuNote() {
        horizontalMenu.$$(".g4x8").find(exactText("Ноутбуки и планшеты")).hover();
        verticalMenu.$$(".g4x2").find(exactText("Игровые ноутбуки")).click();
        return new SortMenu();
    }
}
