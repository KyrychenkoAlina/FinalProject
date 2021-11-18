package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PricePage {

    public WebDriver driver;

    public WebDriverWait wait;

    public PricePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 15);
        PageFactory.initElements(driver, this);
    }
   // @FindBy(id = "basket_add_preview")
   //public WebElement addToBasked;
    @FindBy(id = "basket_add_preview")
    public WebElement addToBasked;

    @FindBy(linkText = "Оформити замовлення")
    public WebElement buyItem;

    @FindBy(xpath = "//*[@id=\"app_global_intertop_basket\"]/div/div[2]/div[3]/div[2]/div[1]")
    public WebElement checkBuy;

}
