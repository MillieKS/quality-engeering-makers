import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TodoTest {

    private static FirefoxDriver driver;

    @BeforeAll
    static void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    // Your tests will go here!
    @Test
    void shouldLoadHomepage() {
        driver.get("https://todomvc.com");
        // Now we are on the TodoMVC homepage.
        // We'll write the rest of our code here!

        // Locate the "View on GitHub" button by its link text
        WebElement githubButton = driver.findElement(By.linkText("View on GitHub"));
        WebElement javascriptElement = driver.findElement(By.xpath("//div[contains(@class, 'tab-content') and contains(text(), 'JavaScript')]"));
        // Get the text content of the specified element
        System.out.println(githubButton.getText());
        System.out.println(javascriptElement.getText());

    }
    // Your tests will go here!


    @AfterAll
    static void closeBrowser() {
        driver.quit();
    }

}
