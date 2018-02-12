package StepImplementation;

import Utils.DriverManager;
import com.thoughtworks.gauge.Step;
import pageObjects.HomePage;
import pageObjects.LoginPage;


/**
 * Created by apreeti on 12/29/17.
 */
public class LoginSteps extends Steps {

    HomePage homePage = new HomePage(DriverManager.driver);
    LoginPage loginPage = new LoginPage(DriverManager.driver);

    @Step("Navigate to <targetSite>")
    public void initializeDriver(String URL){
        DriverManager.URL = "http://localhost:3000";
    }

    @Step("Enter log in details <username> and password <password>")
    public void enterLoginDetails(String username, String password){
        homePage.clickOnLogin();
        loginPage.enterLoginDetails(username,password);
    }

    @Step("Submit the form")
    public void submitForm(){
        loginPage.clickOnLogin();
    }

    @Step("User should be logged in with message <expectedMsg>")
    public boolean verifyMessage(String expectedMsg){
        System.out.println(homePage.getMyAccountText());
        return(homePage.getMyAccountText().equals(expectedMsg));
    }
}
