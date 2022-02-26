package ui.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;

public class Hooks {

    @Before(order=2, value="@UIlogin")
    public void beforeScenario() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }



    @After(order=3, value="@UILogin")
    public void tearDown(){

    }
}
