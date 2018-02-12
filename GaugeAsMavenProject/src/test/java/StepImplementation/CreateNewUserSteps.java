package StepImplementation;

import Utils.DriverManager;
import com.thoughtworks.gauge.Step;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class CreateNewUserSteps extends Steps {

    HomePage homePage = new HomePage(DriverManager.driver);
    LoginPage loginPage = new LoginPage(DriverManager.driver);

    @Step("Click on Login")
    public void clickOnLogin(){
        homePage.clickOnLogin();
    }

    @Step("Click on Create New User link")
    public void clickOnCreateNewUserLink(){
        loginPage.clickOnCreateNewUser();
    }

    @Step("Enter user details <username> and <password>")
    public void enterCustomerDetails(String username, String password){
        loginPage.enterCustomerDetails(username,password);
    }

    @Step("User should be logged in with <expectedMsg>")
    public boolean verifyMessage(String expectedMsg){
        System.out.println(homePage.getMyAccountText());
        return(homePage.getMyAccountText().equals(expectedMsg));
    }

    @Step("Log out of the app")
    public void logout(){
        try {
            homePage.clickOnLogout();
        } catch (Exception e){}
    }
}
