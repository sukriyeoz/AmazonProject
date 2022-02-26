package ui.stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import ui.utilities.Log;

import java.util.logging.LogManager;
import java.util.logging.Logger;


public class US01_Login {
   // Logger log = (Logger) LogManager.getLogger(US01_Login.class);

    @Given("User navigate to amazon home page {string}")
    public void userNavigateToAmazonHomePage(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon.com. Spend less"));
        System.out.println(actualTitle);

        Log.info("Main Page Opened");

    }


}
