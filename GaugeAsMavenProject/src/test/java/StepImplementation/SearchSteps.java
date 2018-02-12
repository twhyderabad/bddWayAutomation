package StepImplementation;

import Utils.DriverManager;
import com.thoughtworks.gauge.Step;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class SearchSteps extends Steps {

    HomePage homePage = new HomePage(DriverManager.driver);
    ProductListingPage productListingPage = new ProductListingPage(DriverManager.driver);

    @Step("Search for product <keyword>")
    public void searchForKeyword(String keyword) {
        homePage.searchForKeyword(keyword);
    }

    @Step("Search results should have the products with the text <keyword> in their names")
    public boolean verifySearchResults(String keyword) {
        return productListingPage.verifySearchResults(keyword);
    }

    @Step("'No products found' message should be displayed")
    public boolean noProductsFound() {
        return productListingPage.noProductsFoundMsgIsDisplayed();
    }

    @Step("Clear the search field")
    public void clearSearchField() {
        homePage.searchText.clear();
    }
}
