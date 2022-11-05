import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MemberPage extends BasePage {

    By memberPageLocator = new By.ByCssSelector("#login-register > div.lr-container > div.q-layout.login > form > button > span");
    By logoLocator = new By.ByCssSelector("#logo > img");
    public MemberPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnMemberPage() {


        return isDisplayed(memberPageLocator);

    }

    public static void verify_Search() throws IOException, CsvValidationException {


        String CSV_File ="C:\\Users\\tek1y\\IdeaProjects\\SeleniumProject\\Test.csv";

        CSVReader reader=new CSVReader(new FileReader(CSV_File));
        String[] cell;

        while ((cell=reader.readNext())!=null){
            for (int i=0; i<1; i++){
                String email = cell[i];
                String password =cell[i+1];

                driver.findElement(By.id("login-email")).sendKeys(email);
                driver.findElement(By.id("login-password-input")).sendKeys(password);

            }



        }


        }

    public void logo(){
        click(logoLocator);
    }
}
