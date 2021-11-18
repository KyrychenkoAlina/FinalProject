package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class SearchPage {

    public WebDriver driver;

    public WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 15);
        PageFactory.initElements(driver, this);
}

    @FindBy(xpath = "//*[@id=\"v_search_input\"]")
    public WebElement searchFind;

    @FindBy(xpath = "//*[@id=\"v_search_form\"]/button")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div/div/div[1]")
    public WebElement searchwrong;

        public void openSearch(){

            driver.get("https://intertop.ua/ua/");
        }

    }
