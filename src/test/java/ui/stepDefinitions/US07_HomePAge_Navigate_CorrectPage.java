package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.AmazonWebElements;
import ui.utilities.Driver;
import ui.utilities.Log;

public class US07_HomePAge_Navigate_CorrectPage {

    AmazonWebElements amazonWebElements=new AmazonWebElements();

    @And("User seleck Alexa as {string} at the bottom of the home page")
    public void userSeleckAlexaAsAtTheBottomOfTheHomePage(String arg0) {
        Actions actions=new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();



    }

    @Then("Verify the prime {string} on the page")
    public void verifyThePrimeOnThePage(String arg0) {

        Driver.waitAndClick(amazonWebElements.alexaFeature,4);
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains("Alexa - Login"));


    }
}
