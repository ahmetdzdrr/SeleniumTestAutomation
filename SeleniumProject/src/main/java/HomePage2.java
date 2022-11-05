import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage2 extends BasePage{

    By cartLogoButtonLocator = new By.ByCssSelector("#account-navigation-container > div > div.account-nav-item.basket-preview > a");

    public HomePage2(WebDriver driver) {
        super(driver);
    }

    public boolean isOnHomePage2() {


        return isDisplayed(cartLogoButtonLocator);


    }

    public void go_cart(){
        click(cartLogoButtonLocator);
    }


}
