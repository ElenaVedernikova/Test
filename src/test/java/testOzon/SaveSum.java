package testOzon;

import com.codeborne.selenide.SelenideElement;
import lombok.val;

import static com.codeborne.selenide.Selenide.$;

public class SaveSum {
    public SelenideElement sumFirst = $(".ui-p5");
    public int sum = getFirstSum();

    public int getFirstSum() {
        String valueFirst = sumFirst.getText();
        sum = extractBalance(valueFirst);
        return sum;
    }

    private int extractBalance(String text) {
        val value = text.substring(0, 3) + text.substring(4, 7);
        return Integer.parseInt(value);
    }

    public int getSum() {
        return sum;
    }
}
