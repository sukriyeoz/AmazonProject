package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class AmazonSignIn {
    public AmazonSignIn(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(id = "signInSubmit")
    public WebElement signInSubmit;

    @FindBy(id= "nav-link-accountList-nav-line-1")
    public WebElement helloUserName;

    @FindBy(xpath = "//*[text()[contains(.,'was a problem')]] ")
    public WebElement errorMessage;

}
