package conditions;

import locators.BaskedPage;
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

public class Basked extends BaseTest{

    @Test
    public void AddItemToBasked(){
        driver.get("https://intertop.ua/ua/product/brushes-and-sponges-ecco-242813");
        baskedPage.addToBasked.click();
        baskedPage.closeWindow.click();
        baskedPage.checkBasked.click();
        String checkitemindasket = baskedPage.checkItem.getText();
        Assertions.assertEquals(checkitemindasket,"Артикул: ZC13");
    }

    @Test
    public void IconDisplayed(){
        driver.get("https://intertop.ua/ua/product/brushes-and-sponges-ecco-242813");
        baskedPage.addToBasked.click();
        baskedPage.closeWindow.click();
        String iconDisplayed = baskedPage.iconDisplayed.getText();
        Assertions.assertEquals(iconDisplayed,"1");
        baskedPage.wait.until(ExpectedConditions.visibilityOf(baskedPage.iconDisplayed));
    }

    @Test
    public void DeleteItemFromBasked(){

        driver.get("https://intertop.ua/ua/product/brushes-and-sponges-ecco-242813");
        baskedPage.addToBasked.click();
        baskedPage.closeWindow.click();
        baskedPage.checkBasked.click();
        baskedPage.deleteItem.click();
        baskedPage.deleteComfirm.click();
        String checkmessage = baskedPage.emptyBasked.getText();
        Assertions.assertEquals(checkmessage,"Ваш кошик порожній");
    }
}
