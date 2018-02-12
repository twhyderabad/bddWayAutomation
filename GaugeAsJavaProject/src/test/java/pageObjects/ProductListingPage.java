package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListingPage {
    final WebDriver driver;

    public ProductListingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(how = How.CSS, using = "ul#products li")
    List<WebElement> product_list;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/h6")
    WebElement noProductsFoundMsg;

    public boolean verifySearchResults(String keyword){
        boolean result = false;
        for (WebElement item:product_list){
            if(item.getText().contains(keyword))
                result = true;
            else
                return false;
        }
        return result;
    }

    public boolean noProductsFoundMsgIsDisplayed(){
        return noProductsFoundMsg.isDisplayed();
    }
}
