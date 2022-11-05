import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {

    SearchBox searchBox;
    By cartCountLocator = new By.ByCssSelector("#account-navigation-container > div > div.account-nav-item.basket-preview > a > div.basket-item-count-container.visible");
    By cartContainerLocator = new By.ByCssSelector("#account-navigation-container > div > div.account-nav-item.basket-preview > a > div.icon-container > i.i-bagg-orange.hover-icon");
    By acceptCookiesLocator = By.id("onetrust-accept-btn-handler");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount()>0;

    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
      String count =  find(cartCountLocator).getText();
      return Integer.parseInt(count);
    }


    public void acceptCookies(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
            }
        }

    }


