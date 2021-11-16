package testOzon;

import com.codeborne.selenide.Configuration;
import lombok.val;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class OzonTest {
    @Test
    public void userCanSearch() throws InterruptedException {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1500x1200";
        open("http://ozon.ru");
        val ozonPage = new OzonPage();
        val productPage = ozonPage.menuElectronics();
        val sort = productPage.menuNote();
        Thread.sleep(700);
        val notePage = sort.searchResults();
        Thread.sleep(700);
        val result = notePage.resultsPage();
        Thread.sleep(700);
        int summa1 = new SaveSum().getSum();
        System.out.println(summa1);
        Thread.sleep(700);
        val gameNote = result.gameNotePage();
        int summa2 = new GameNotePage().getSum();
        System.out.println(summa2);
        val compare = new GameNotePage().comparePrices(summa1, summa2);
    }
}
