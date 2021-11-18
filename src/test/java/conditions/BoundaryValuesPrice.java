package conditions;

import locators.BaskedPage;
import locators.PricePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BoundaryValuesPrice extends BaseTest{


    @Test
    public void BuyMinValidPrice(){
        driver.get("https://intertop.ua/ua/product/brushes-and-sponges-ecco-242813");
        pricePage.addToBasked.click();
        pricePage.buyItem.click();
    }

    @Test
    public void BuyValidPrice(){
        driver.get("https://intertop.ua/ua/product/hair-accessories-braska-4454936");
        pricePage.addToBasked.click();
        pricePage.buyItem.click();
    }

    @Test
    public void BuyInvalidPrice(){
        driver.get("https://intertop.ua/ua/product/scarf-conte-1911337");
        pricePage.addToBasked.click();
        String purchasenotactive = pricePage.checkBuy.getText();
        Assertions.assertEquals(purchasenotactive,"Мінімальна сума замовлення 199 грн");

    }

}

