package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class AmazonWebElements {

    public AmazonWebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//span[@class='nav-action-inner'][1]")
//    public WebElement signIn;

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement helloSignIn;

    @FindBy(xpath = "//*[text()[contains(.,'Sign Out')]]//parent::span")
    public WebElement signOut;

    @FindBy(xpath = "//span[@class='hm-icon-label']")
    public WebElement menuAll;

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible']//a")
    public List<WebElement> categoryMenu;

    @FindBy(xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//a")
    public List<WebElement> subCategoryMenu;

    @FindBy(id ="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id ="nav-search-submit-button")
    public WebElement searchSubmitButton;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
   // @FindBy(xpath = "//div[@data-component-type= 's-search-result']")
   // @FindBy(xpath = "//*[text()[contains(.,'Nutella')]]")
    public List<WebElement> searchedProduct;







}
