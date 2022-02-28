package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.DailyRollingFileAppender;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ui.pages.AmazonWebElements;
import ui.utilities.Driver;
import ui.utilities.Log;
import ui.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US05_Filtering_Shorting {

    AmazonWebElements amazonWebElements=new AmazonWebElements();


    @And("User clicks the {string} checksbox")
    public void userClicksTheChecksbox(String filteringTag) {
        Log.startTestCase("Product Filtering");
        Driver.waitAndClick(amazonWebElements.filteringByProduct,2);
    }

    @Then("Verify the {string} text visible on items")
    public void verifyTheTextVisibleOnItems(String filter) {
        List<String > filteredProduct=new ArrayList<>();
        int allFilteredProduct=amazonWebElements.filteringTag.size();
        for (int i=0;i<amazonWebElements.filteringTag.size();i++){
            if(amazonWebElements.filteringTag.get(i).getText().contains(filter)){
                filteredProduct.add(amazonWebElements.filteringTag.get(i).getText());
                Assert.assertTrue(amazonWebElements.filteringTag.get(i).isDisplayed());
            }
        }
        System.out.println("All Filtered Product: " +allFilteredProduct );
        System.out.println("All Have Filtering Tag Product: " +filteredProduct.size());

        Log.info("Verified filter visible on items");

    }

    @And("User clicks the {string} dropdown")
    public void userClicksTheDropdown(String arg0) {
        amazonWebElements.sortDropDown.click();
    }

    @And("User selects the {string}")
    public void userSelectsThe(String arg0) {

        Driver.waitAndClick(amazonWebElements.sortPriceLowToHigh,3);
    }

    @Then("Verify the all item are arranged asc order")
    public void verifyTheAllItemAreArrangedAscOrder() {


//       List<String > sortedPriced=new ArrayList<>();
//      for (int i=0; i<amazonWebElements.sortedPriced.size();i++) {
//          Driver.wait(2);
//          sortedPriced.add(amazonWebElements.sortedPriced.get(i).getText());
//
//         // System.out.println("sorted price"+ amazonWebElements.sortedPriced.get(i).getText());

     // }
       // System.out.println("sorted"+ sortedPriced);




    }
}
