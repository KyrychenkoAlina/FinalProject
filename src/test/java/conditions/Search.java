package conditions;

import locators.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Search extends BaseTest {
    @BeforeEach
    public void openIntertop(){

        searchPage.openIntertop();
    }

    @Test
    public void SearchByName(){
        searchPage.searchFind.sendKeys("Geox Phaolae");
        searchPage.searchButton.click();
        WebElement result = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]"));
    }

    @Test
    public void SearchByCode(){
        searchPage.searchFind.sendKeys("5606428996915");
        searchPage.searchButton.click();
        WebElement result = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[1]/div/div"));
    }

    @Test
    public void SearchEmptyField(){
        searchPage.searchFind.sendKeys("сапоггги");
        searchPage.searchButton.click();
        String checkmessage = searchPage.searchwrong.getText();
        Assertions.assertEquals(checkmessage,"За запитом сапоггги ми знайшли 0 товарів");
    }

}
