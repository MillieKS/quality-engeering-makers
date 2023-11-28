import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZaraTest {

    private static FirefoxDriver driver;

    @BeforeAll
    static void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    // Your tests will go here!
    @Test
    void shouldPrintPerfumeName() {
        driver.get("https://www.zara.com");
    }

    // Your tests will go here!


    @AfterAll
    static void closeBrowser() {
        driver.quit();
    }

}
