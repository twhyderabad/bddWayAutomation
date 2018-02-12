package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by apreeti on 12/28/17.
 */
public class LoginPage{
    final WebDriver driver;

    @FindBy(how= How.ID, using = "spree_user_email")
    WebElement email;

    @FindBy(how= How.ID, using = "spree_user_password")
    WebElement password;

    @FindBy(how= How.NAME, using = "commit")
    WebElement login_button;

    @FindBy(how = How.XPATH, using = "//*[@id='content']/div[1]")
    WebElement invalidEmail;

    @FindBy(how = How.LINK_TEXT, using = "Create a new account")
    WebElement createNewUserLink;

    @FindBy(how = How.ID, using = "spree_user_password_confirmation")
    WebElement confirmPassword;

    @FindBy(how = How.NAME, using = "commit")
    WebElement createButton;

    public  LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }


    public void enterLoginDetails(String username, String password){
        email.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickOnLogin(){
        login_button.click();
    }

    public String getInvalidLoginText() {
        return invalidEmail.getText();
    }

    public void clickOnCreateNewUser(){
        createNewUserLink.click();
    }

    public void clickOnCreateButton(){
        createButton.click();
    }

    public void enterCustomerDetails(String username, String password){
        email.sendKeys(username);
        this.password.sendKeys(password);
        confirmPassword.sendKeys(password);
        createButton.click();
    }
}
