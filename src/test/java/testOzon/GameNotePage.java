package testOzon;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.val;

import static com.codeborne.selenide.Selenide.*;

public class GameNotePage {
    public SelenideElement sumSecond = $(".c2h5");
    public ElementsCollection сolours1 = $$(".db8");
    public ElementsCollection сolours2 = $$(".db6");
    public ElementsCollection сolours4 = $$(".da3");
    public SelenideElement сolour = $x("//*[@class='db8']//span[text()='Цвет']//ancestor::dt[@class='db4']/following-sibling::dd[@class='db5']");
    public SelenideElement system = $x("//*[@class='db8']//span[text()='Версия Windows']//ancestor::dt[@class='db4']/following-sibling::dd[@class='db5']");

    public int sum2 = getSecondSum();

    public int getSecondSum() {
        String valueSecond = sumSecond.getText();
        sum2 = extractBalance(valueSecond);
        return sum2;
    }

    public int comparePrices(int sum1, int sum2) {
        if (sum1 == sum2) {
            System.out.println(сolour.getText());
            System.out.println(system.getText());
        } else System.out.println("Стоимость не совпадает");
        return sum2;
    }

    public int getSum() {
        return sum2;
    }

    private int extractBalance(String text) {
        val value = text.substring(0, 3) + text.substring(4, 7);
        return Integer.parseInt(value);
    }
}
