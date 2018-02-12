package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by apreeti on 12/28/17.
 */
public class HomePage{
    final WebDriver driver;

    @FindBy(how= How.LINK_TEXT, using = "MY ACCOUNT")
    public WebElement myAccount;

    @FindBy(how= How.ID, using = "link-to-login")
    public WebElement login;

    @FindBy(how= How.LINK_TEXT, using = "LOGOUT")
    public WebElement logout;

    @FindBy(how= How.XPATH, using = "//*[@id=\"search-bar\"]/form/input[2]")
    public WebElement searchButton;

    @FindBy(how= How.ID, using = "keywords")
    public WebElement searchText;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }


    public void clickOnLogin(){
        login.click();
    }

    public void clickOnLogout(){
        logout.click();
    }

    public String getMyAccountText(){
        return myAccount.getText();
    }

    public void searchForKeyword(String keyword){
        searchText.sendKeys(keyword);
        searchButton.click();
    }
}
