import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage2 extends BasePage{

    By removeCartButtonLocator = new By.ByCssSelector("#pb-container > div > div.pb-merchant-group > div:nth-child(3) > div > div > div.pb-basket-item-actions > button > i");
    By removeCartButtonLocator2 = new By.ByCssSelector("#pb-container > div > div.pb-merchant-group > div:nth-child(3) > div.ty-display-flex.ty-modal.ty-bordered.ty-transition-appear-enter-done > div > div.pb-item-remove-confirmation-modal-footer > div > button.ty-font-w-semi-bold.ty-button.ty-bordered.ty-transition.ty-input-medium.ty-primary");
    By cartEmptyTextLocator = new By.ByCssSelector("#pb-container > div > div.pb-empty-basket > div:nth-child(1) > span");

    public CartPage2(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCartPage2(){
        return isDisplayed(cartEmptyTextLocator);
    }
    public void remove_cart(){
            click(removeCartButtonLocator);
            click(removeCartButtonLocator2);
    }
}
