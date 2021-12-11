package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Database;
import pages.HomePage;

import java.sql.SQLException;


public class Base {
    private static WebDriver driver;
    protected HomePage homePage;
    protected Database database;

    @BeforeClass
    public void setUp() throws SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.rogers.com");

        homePage = new HomePage(driver);
        database = new Database();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
