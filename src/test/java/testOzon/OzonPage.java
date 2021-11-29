package testOzon;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class OzonPage {
    private SelenideElement closeButton = $("[d=\"M12 10.587l6.293-6.294a1 1 0 111.414 1.414l-6.293 6.295 6.293 6.294a1 1 0 11-1.414 1.414L12 13.416 5.707 19.71a1 1 0 01-1.414-1.414l6.293-6.294-6.293-6.295a1 1 0 111.414-1.414L12 10.587z\"]");
    private SelenideElement horizontalMenu = $("[data-widget=\"horizontalMenu\"]");

    public ProductPage menuElectronics() {
//        closeButton.click();
        horizontalMenu.$$(".g5e2").find(exactText("Электроника")).click();
        return new ProductPage();
    }
}

