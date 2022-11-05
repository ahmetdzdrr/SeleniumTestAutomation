import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;


public class TestProduct extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    ProductDetailPage_1 productDetailPage_1;
    CartPage cartPage;

    donePage donePage;

    MemberPage memberPage;

    HomePage2 homePage2;

    CartPage2 cartPage2;


    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
       // homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Ceket");

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,5200)", "");

        homePage.searchBox().nextPage();
        homePage.searchBox().preivousPage();


        Assertions.assertTrue(productsPage.isOnProductPage() ,"not products page!");





    }


    @Test
    @Order(2)
    public void select_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(0);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage() ,
                "Not on product detail page!");

        driver.get("https://www.trendyol.com/jack-wolfskin/erkek-northern-point-mont-p-50267857?boutiqueId=61&merchantId=2763&utm_source=aff_t&utm_medium=cpc&utm_campaign=akakce_urun_listeleme&adjust_tracker=ejav2ha_253g15b&adjust_campaign=akakce_urun_listeleme&v=1.23.9");
        homePage.acceptCookies();
    }

    @Test
    @Order(3)
    public void add_product(){
        productDetailPage_1 = new ProductDetailPage_1(driver);
       // productDetailPage.addDetails();
        Assertions.assertTrue(productDetailPage_1.isOnProductDetailPage1(),
                "Product did not add");

        productDetailPage_1.addDetails();
        productDetailPage_1.addToCart_1();

        Assertions.assertTrue(homePage.isProductCountUp() ,
                "Product count did not increase!");
    }



    @Test
    @Order(4)
    public void go_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded() ,
                "Product could not add to cart");

    }

    @Test
    @Order(5)
    public void done_cart(){
        donePage = new donePage(driver);
        donePage.click_done();
        Assertions.assertTrue(donePage.isOnDonePage(),
                "Could not click done!");
    }

    @Test
    @Order(6)
    public void member_info() throws CsvValidationException, IOException {
        memberPage=new MemberPage(driver);
        MemberPage.verify_Search();
        Assertions.assertTrue(memberPage.isOnMemberPage(),
                "Could not member page!");
    }

    @Test
    @Order(7)
    public void homePage2(){
        memberPage.logo();
        homePage2 = new HomePage2(driver);
        Assertions.assertTrue(homePage2.isOnHomePage2(),
                "Could not find home page!");
            homePage2.go_cart();

    }

    @Test
    @Order(8)
    public void remove_product(){
        cartPage2 = new CartPage2(driver);
        cartPage2.remove_cart();
        Assertions.assertTrue(cartPage2.isOnCartPage2(),"Wrong");
    }




}

