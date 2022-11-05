import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class donePage extends BasePage{

    By submitDoneButtonLocator = new By.ByCssSelector("#pb-container > aside > div > div:nth-child(1) > a > span");
    By donePageLocator = new By.ByCssSelector("#login-register > div.lr-title > h3");
    public donePage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnDonePage() {


        return isDisplayed(donePageLocator);


    }
    public void click_done(){
        click(submitDoneButtonLocator);
    }
}
