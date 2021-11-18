package locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaskedPage {

    private  WebDriver driver;

    public WebDriverWait wait;

    public BaskedPage(WebDriver driver) {
        this.driver = driver;
        this.wait=new WebDriverWait(this.driver,15);
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "basket_add_preview")
    public WebElement addToBasked;

    @FindBy(xpath = "//*[@id=\"app_global_intertop_basket\"]/div/div[2]/div[2]/div")
    public WebElement closeWindow;

    @FindBy(xpath = "//*[@id=\"app_global\"]/div[2]/div[3]/div[4]/div/div[2]/div[3]/div/a/div")
    public WebElement checkBasked;

    @FindBy(xpath = "//*[@id=\"app_global_intertop_basket\"]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[3]/div[2]")
    public WebElement checkItem;

    @FindBy(xpath = "//*[@id=\"app_global\"]/div[2]/div[3]/div[4]/div/div[2]/div[3]/div/a/span/div")
    public WebElement iconDisplayed;

    @FindBy(xpath = "//*[@id=\"app_global_intertop_basket\"]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[1]")
    public WebElement deleteItem;

    @FindBy(xpath = "//*[@id=\"app_global_intertop_basket\"]/div/div[2]/div[3]/div[2]/div[1]/div/div[1]/div[2]/div[2]/span[1]")
    public WebElement deleteComfirm;

    @FindBy(xpath = "//*[@id=\"app_global_intertop_basket\"]/div/div[2]/div[3]/div/p")
    public WebElement emptyBasked;
}













