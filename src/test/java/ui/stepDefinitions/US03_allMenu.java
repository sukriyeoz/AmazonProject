package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import ui.pages.AmazonWebElements;
import ui.utilities.Driver;
import ui.utilities.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US03_allMenu {

    AmazonWebElements amazonWebElements=new AmazonWebElements();


    @And("User click on All drop down menu")
    public void userClickOnAllDropDownMenu() {
        Log.startTestCase("All Menu");
        Driver.waitAndClick(amazonWebElements.menuAll,1);
        Log.info("clicked all menu");
    }

    @And("User click on a category as {string}")
    public void userClickOnACategoryAs(String category) {
        for(int i=0;i<amazonWebElements.categoryMenu.size();i++){
            if(amazonWebElements.categoryMenu.get(i).getText().equals(category)) {
                Driver.waitAndClick(amazonWebElements.categoryMenu.get(i),2);
            }
        }
        Log.info("clicked a category");
    }

    @Then("Verify that there are {int} subcategory under the tab")
    public void verifyThatThereIsASubcategoryUnderTheTab(int subCategory) {

        System.out.println(amazonWebElements.subCategoryMenu.size());
        Assert.assertEquals(amazonWebElements.subCategoryMenu.size(), subCategory);
        Log.info("Verified subcategory number");
    }

    @Then("User verifies the title of all subcategories")
    public void userVerifiesTheTitleOfAllSubcategories() {

        List<String> expectedSubMenu= Arrays.asList(
                "MAIN MENU", "Prime Video", "Included with Prime", "Prime Video Channels", "Rent or Buy", "Your Watchlist", "Purchases & Rentals", "Watch Anywhere", "Getting Started", "Amazon Originals", "Kids", "Coming soon");


        List<String> actualSubMenu=new ArrayList<>();
        for (int i=0; i<amazonWebElements.subCategoryMenu.size();i++){
            actualSubMenu.add(amazonWebElements.subCategoryMenu.get(i).getText());
        }
        Driver.wait(3);
        System.out.println(actualSubMenu);
        Assert.assertTrue(actualSubMenu.containsAll(expectedSubMenu));

         Log.info("Verified all title of subCategories");
         Log.endTestCase("AllMenu Test");

    }
}
