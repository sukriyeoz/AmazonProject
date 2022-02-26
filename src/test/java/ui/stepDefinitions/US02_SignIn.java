package ui.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.pages.AmazonSignIn;
import ui.pages.AmazonWebElements;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import ui.utilities.Log;
import ui.utilities.ReusableMethods;

public class US02_SignIn {
    AmazonWebElements amazonWebElements=new AmazonWebElements();
    AmazonSignIn amazonSignIn=new AmazonSignIn();



    @And("User click on Sign-in button")
    public void userClickOnSignInButton() {
        Log.startTestCase("Sign In Test");
       amazonWebElements.helloSignIn.click();
       Log.info("Signed In");

    }

    @And("User enter valid email as {string} then click on continue button")
    public void userEnterValidEmailAsThenClickOnContinueButton(String email) {

        amazonSignIn.emailBox.sendKeys(ConfigReader.getProperty("validEmail"));
        Driver.waitAndClick(amazonSignIn.continueButton);
        Log.info("entered valid email");

    }

    @And("User enter valid password as {string} then click Sign-in button")
    public void userEnterValidPasswordAsThenClickSignInButton(String password) {

         amazonSignIn.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
         Driver.waitAndClick(amazonSignIn.signInSubmit,2);
         Log.info("entered valid password");


    }

    @Then("User verify that page navigate to amazon home page")
    public  void userVerifyThatPageNavigateToAmazonHomePage() {

        ReusableMethods.waitFor(1);
        Assert.assertEquals(amazonSignIn.helloUserName.getText(),"Hello, Ayse");
        ReusableMethods.hover(amazonWebElements.helloSignIn);
        amazonWebElements.signOut.click();

        Log.info("Verified sign in step was successful");

    }

    @And("User enter invalid email as {string} then click on continue button")
    public void userEnterInvalidEmailAsThenClickOnContinueButton(String invalidEmail) {

         Driver.waitAndSendText(amazonSignIn.emailBox,ConfigReader.getProperty("invalidEmail"),1);
         Driver.waitAndClick(amazonSignIn.continueButton);

         Log.info("entered invalid email ");
    }

    @Then("Verify the alert mesaj {string}")
    public void verifyTheAlertMesaj(String message ){
        Driver.wait(2);
        Assert.assertTrue(amazonSignIn.errorMessage.isDisplayed());

        Log.info("Verified error message was appeared");
        Log.endTestCase("Sign In  Test");



    }

    @And("User enter invalid password as {string} then click Sign-in button")
    public void userEnterInvalidPasswordAsThenClickSignInButton(String invalidPassword) {

        Driver.waitAndSendText(amazonSignIn.passwordBox,ConfigReader.getProperty("invalidPassword"),2);
        Driver.waitAndClick(amazonSignIn.signInSubmit,1);

        Log.info("entered invalid password");
    }
}
