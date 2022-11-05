import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("q");
    By submitButtonLocator = new By.ByCssSelector("#H_s_v8 > button > i");

    By nextButtonLocator = new By.ByCssSelector("body > div.rw_v8.search_v8 > p.pager_v8 > a:nth-child(3)");

    By previousButtonLocator = new By.ByCssSelector("body > div.rw_v8.search_v8 > p.pager_v8 > a:nth-child(1)");

    By verifyButtonLocator = new By.ByCssSelector("#norobot-container > input");
    public SearchBox(WebDriver driver) {

        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitButtonLocator);

    }

    public void nextPage(){
        click(nextButtonLocator);

    }

    public void preivousPage(){
        click(previousButtonLocator);
    }


}
