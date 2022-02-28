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

    @FindBy(xpath = "//span[@class='a-size-base a-color-base'][text()='Free Shipping by Amazon']")
    public WebElement filteringByProduct;

    @FindBy(xpath = "//div[@class='sg-col-inner']")
    public List<WebElement> filteringTag;

    @FindBy(xpath = "//span[@data-action='a-dropdown-button']")
    public WebElement sortDropDown;

    @FindBy(xpath = "//a[@id='s-result-sort-select_1'][text()='Price: Low to High'][1]")
    public WebElement sortPriceLowToHigh;

    @FindBy(xpath = "//span[@class='a-offscreen']")
    public List<WebElement> sortedPriced;

    @FindBy(xpath = "//span[@class='a-price-whole']")
    public List<WebElement>  priceWhole;

    @FindBy(xpath = "//span[@class='a-price-fraction']")
    public List<WebElement>  priceFraction;

    @FindBy(xpath = "(//span[@class='a-price'])[1]")
    public WebElement sortedPricedDeneme;

    @FindBy(xpath = "//tr[1]/td[13]")
    public WebElement alexaFeature;





}
