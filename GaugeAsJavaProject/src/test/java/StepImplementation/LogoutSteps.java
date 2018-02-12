package StepImplementation;

import Utils.DriverManager;
import com.thoughtworks.gauge.Step;
import pageObjects.HomePage;


public class LogoutSteps extends Steps {
    HomePage homePage = new HomePage(DriverManager.driver);

    @Step("Log out")
    public void logout(){
        try {
            homePage.clickOnLogout();
        } catch (Exception e){}
    }

    @Step("Close the browser")
    public void closeBrowser(){
        DriverManager.driver.close();
    }

    @Step("Quit the browser")
    public void quitBrowser(){
        DriverManager.driver.quit();
    }
}
