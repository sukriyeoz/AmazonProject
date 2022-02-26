package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import ui.pages.AmazonWebElements;
import ui.utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US04_searchProduct {

    AmazonWebElements amazonWebElements = new AmazonWebElements();


    @And("User enter {string} as a key word to the search bar and click the seacrh icon")
    public void userEnterAsAKeyWordToTheSearchBarAndClickTheSeacrhIcon(String product) {
        Driver.waitAndSendText(amazonWebElements.searchBox, product, 1);
        amazonWebElements.searchSubmitButton.click();
    }

    @Then("Verify that all search result contains {string}")
    public void verifyThatAllSearchResultContains(String product) {

        List<String> allProduct = new ArrayList<>();
        //   List<String> actualSearchedProduct=new ArrayList<>();
        for (int i = 0; i < amazonWebElements.searchedProduct.size(); i++) {
            allProduct.add(amazonWebElements.searchedProduct.get(i).getText());

        }
                 int itemsize=allProduct.size();
        System.out.println("itemsize"+ itemsize);

        for (int i = 0; i < allProduct.size(); i++) {
            if (!allProduct.get(i).contains(product)) {
                allProduct.remove(allProduct.get(i));
            }
            Assert.assertTrue(allProduct.get(i).contains("Nutella"));
        }
//        int productItemsize= allProduct.size();
//        System.out.println("productItemSize"+  productItemsize);
//
//        System.out.println(allProduct.size());
//       System.out.println(allProduct);
//       Driver.wait(5);
       // Assert.assertTrue(productItemsize<itemsize);

    }
}