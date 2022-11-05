import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    By productNameLocator = new By.ByCssSelector("#pb-container > div > div.pb-merchant-group > div:nth-child(3) > div > div > a > p.pb-item");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size()>0;
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }
}
