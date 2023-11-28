import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChallengeMakersTest {
  private  static ChromeDriver driver;

  @BeforeAll
  static void launchBrowser() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  @AfterAll
  static void tearDown() {
    driver.quit();
  }

  @Test
  public void challengeMakers() throws InterruptedException {
    // Test name: ChallengeMakers
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://makers.tech/");
    // 2 | setWindowSize | 1206x900 | 
    driver.manage().window().setSize(new Dimension(1206, 900));
    // Assert that the page title includes the text "Change Your Life".
    assertTrue(driver.getTitle().contains("Change Your Life"));
    // 3 | click | css=.column:nth-child(7) a > strong | Code of Conduct
    driver.findElement(By.id("cookie_action_close_header")).click();
    assertTrue(driver.findElement(By.partialLinkText("Code of Conduct")).isDisplayed());

    driver.findElement(By.linkText("Code of Conduct")).click();
    assertEquals("https://makers.tech/code-of-conduct/", driver.getCurrentUrl());
    // that the page title includes the text "Code of Conduct".
    assertTrue(driver.getTitle().contains("Code of Conduct"));
    // 4 | click | linkText=Makers Academy | Homepage
    driver.findElement(By.linkText("Makers Academy")).click();
    // 5 | click | linkText=FAQs | 
    driver.findElement(By.linkText("FAQs")).click();
    //  check its goes to the FAQ page by checking URL
    assertEquals("https://faq.makers.tech/en/knowledge", driver.getCurrentUrl());
    // 6 | click | css=.kb-search__bar .kb-search__input | 
    driver.findElement(By.cssSelector(".kb-search__bar .kb-search__input")).click();
    // 7 | type | css=.kb-search__bar .kb-search__input | badger
    driver.findElement(By.cssSelector(".kb-search__bar .kb-search__input")).sendKeys("badger");
    // 8 | sendKeys | css=.kb-search__bar .kb-search__input | ${KEY_ENTER}
    driver.findElement(By.cssSelector(".kb-search__bar .kb-search__input")).sendKeys(Keys.ENTER);
    // No results for "badger"
    WebElement result = driver.findElement(By.cssSelector(".kb-search-results__heading"));
    assertEquals("No results for \"badger\"", result.getText());

  }
}
