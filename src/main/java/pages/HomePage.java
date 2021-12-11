package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HomePage {

    protected Database database;
    private WebDriver driver;
    private By amazonPrice = By.xpath("//*[@id=\"mainContent\"]/ng-component/div/div/rci-ui-dock[2]/dsa-layout/div/div/rci-ui-block-wrapper/div/div/rci-ui-block-tabs/section/div/dsa-tabs/div/div[2]/div/div/div/dsa-card-carousel/div/div/div/rci-ui-block-cards/dsa-card-carousel/div/div/div/dsa-card[1]/div/dsa-card-item-offer/div/div[2]");
    private By shopNowCard = By.xpath("//*[@id=\"mainContent\"]/ng-component/div/div/rci-ui-dock[6]/dsa-layout/div/div/rci-ui-block-wrapper/div/div/ng-component/dsa-layout/div/div/div/dsa-ways-to-buy/div/div[2]/div[1]/div/a");
    private By name = By.xpath("//*[@id=\"mainContent\"]/ng-component/r-choose-phone/dsa-layout/div/div/div[3]/div/div[24]/r-nac-tile/ds-tile/div/div/div[1]/div[2]/p");
    private By price = By.xpath("//*[@id=\"mainContent\"]/ng-component/r-choose-phone/dsa-layout/div/div/div[3]/div/div[24]/r-nac-tile/ds-tile/div/div/div[2]/div/div[2]/div/p[2]");



    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void wireless() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.findElement(amazonPrice).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainContent\"]/ng-component/div/div/rci-ui-dock[2]/dsa-layout/div/div/rci-ui-block-wrapper/div/div/rci-ui-block-tabs/section/div/dsa-tabs/div/div[2]/div/div/div/dsa-card-carousel/div/div/div/rci-ui-block-cards/dsa-card-carousel/div/div/div/dsa-card[1]/div/dsa-card-item-offer/div/div[2]"))).click();
    }

    public void shopNow() throws InterruptedException {
//        Thread.sleep(9000);
//        driver.findElement(shopNowCard).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 5);
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mainContent\"]/ng-component/div/div/rci-ui-dock[6]/dsa-layout/div/div/rci-ui-block-wrapper/div/div/ng-component/dsa-layout/div/div/div/dsa-ways-to-buy/div/div[2]/div[1]/div/a"))).click();
    }

    public void scrapWholePage() throws InterruptedException, SQLException, ClassNotFoundException {
        //database = new Database();
        String ime = "iPhone 11";

//        String a = driver.findElement(name).getText();
//        String b = driver.findElement(price).getText();
//        database.setUpConn(a,b);
        String pageSource = driver.getPageSource();
        Pattern pattern = Pattern.compile(ime, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(pageSource);
        if(matcher.find()){
            System.out.println(ime);
        }
        else{
            System.out.println("nema elementa");
        }
    }

//    public void displayItems() throws SQLException, ClassNotFoundException {
//        database = new Database();
//        database.setUpConn();
//    }
}

