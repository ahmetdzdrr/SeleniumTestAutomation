import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProductDetailPage_1 extends BasePage{

    By addToCartButtonLocator1 = new By.ByCssSelector("#product-detail-app > div > div.flex-container > div.product-container > div:nth-child(2) > div.container-right-content > div.product-button-container > button > div.add-to-basket-button-text");
    By selectColorButtonLocator = new By.ByCssSelector("#product-detail-app > div > div.flex-container > div.product-container > div:nth-child(2) > div.container-right-content > div.slicing-attributes > section > div.styles-module_sliderBase__swkx1.undefined > div > a.selected.slc-img > img");
    By selectSizeButtonLocator = new By.ByCssSelector("#product-detail-app > div > div.flex-container > div.product-container > div:nth-child(2) > div.container-right-content > div.size-variant-wrapper > div.variants > div.selected.sp-itm");

    public ProductDetailPage_1(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage1() {


        return isDisplayed(addToCartButtonLocator1);


    }

    public void addDetails(){

        click(selectColorButtonLocator);
        click(selectSizeButtonLocator);

    }
    public void addToCart_1() {


        click(addToCartButtonLocator1);


    }
}
