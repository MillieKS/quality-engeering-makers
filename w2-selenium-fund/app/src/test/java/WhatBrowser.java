import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WhatBrowser {

    public static void main(String[] args) throws Exception {

        // Create a new instance of Selenium
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();

        // Use WebDriver to open a new instance of FireFox and Edge
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver firefoxDriver = new FirefoxDriver();
        WebDriver edgeDriver = new EdgeDriver();

        // Instruct the driver to browse to the Makers website
        firefoxDriver.get("https://www.duolingo.com");
        edgeDriver.get("https://www.duolingo.com");

        // Take a screenshot of what's currently on the page,
        // and store it in a file 'makers.png' in your project root
        takeScreenshot(firefoxDriver, "fire.png");
        takeScreenshot(edgeDriver, "edge.png");

        // Find the title of the webpage (the value inside the HTML
        // <title> element) and print it to the terminal
        System.out.println(firefoxDriver.getTitle());
        System.out.println(edgeDriver.getTitle());

        // Close down Selenium and end the test
        firefoxDriver.quit();
        edgeDriver.quit();
    }

    // Helper function for taking screenshots using WebDriver
    public static void takeScreenshot(WebDriver webdriver,String desiredPath) throws Exception{
        TakesScreenshot screenshot = ((TakesScreenshot)webdriver);
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(desiredPath);
        FileUtils.copyFile(screenshotFile, targetFile);
    }
}
