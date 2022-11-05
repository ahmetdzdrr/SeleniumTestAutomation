import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = new By.ByCssSelector("#pd_v8 > div.bb_w > a > span > b");
    By selectSizePageLocator = new By.ByCssSelector("#variation_size_name > span > span");
    By getSelectSizeButtonLocator = By.id("native_size_name_0");
    By selectColorButtonLocator = By.id("color_name_0");
    public ProductDetailPage(WebDriver driver) {
        super(driver);

    }


    public boolean isOnProductDetailPage() {


        return isDisplayed(addToCartButtonLocator);


    }





}
