package testOzon;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class ResultsPage {

    private SelenideElement menuBrendAll = $(".a7y");

    public GameNotePage gameNotePage() throws InterruptedException {
        actions().sendKeys(Keys.CONTROL, "t").build().perform();
        Thread.sleep(500);
        menuBrendAll.click();
        Thread.sleep(500);
        switchTo().window(0);
        Thread.sleep(1500);
        return new GameNotePage();
    }
}







