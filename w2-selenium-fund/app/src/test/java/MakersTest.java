import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakersTest {
    private static FirefoxDriver driver;

    @BeforeAll
    static void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }


    // Your tests will go here!
    @Test
    void shouldPrintPageTitle() {
        driver.get("https://makers.tech");
        System.out.println(driver.getTitle());
    }
    // Your tests will go here!

    @Test
    public void zaraPerfume() {
        driver.get("https://www.zara.com/uk/");
        driver.manage().window().setSize(new Dimension(1040, 930));
        driver.findElement(By.cssSelector(".layout-search-link__link")).click();
        driver.findElement(By.id("search-products-form-combo-input")).sendKeys("perfume new york");
        driver.findElement(By.id("search-products-form-combo-input")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".media-image__image")).click();
    }



    @AfterAll
    static void closeBrowser() {
        driver.quit();
    }
}