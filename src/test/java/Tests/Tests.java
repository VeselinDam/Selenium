package Tests;

import Base.Base;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class Tests extends Base {
    @Test
    public void goToShop() throws InterruptedException, SQLException, ClassNotFoundException {
        homePage.wireless();
        homePage.shopNow();
        homePage.scrapWholePage();
        //homePage.displayItems();
    }
}
