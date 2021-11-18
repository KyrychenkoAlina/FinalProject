package conditions;

import locators.BaskedPage;
import locators.PricePage;
import locators.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    BaskedPage baskedPage;
    PricePage pricePage;
    SearchPage searchPage;

    Actions action;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        baskedPage = new BaskedPage(driver);
        baskedPage = new BaskedPage(driver);
        pricePage = new PricePage(driver);
        searchPage = new SearchPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.close();
    }
}