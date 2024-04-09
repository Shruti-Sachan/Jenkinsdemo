package CucumberJavaProject.sampleProject;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumProject {
    static WebDriver driver;

    @Test
    public void testSearchText() {
        System.out.println("Running testSearchText");
        initializeWebdriver();
        navigateToGoogleSearchPage();
        
    }

    // Initialize Chrome
    public static void initializeWebdriver() {
        // Set the path for chromeDriver
    	System.setProperty(" webdriver.chrome.driver",
    			"C:\\Users\\shrutisachan\\eclipse\\java-2022-12\\eclipse\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    			driver = new ChromeDriver();
    }

    // Navigate to Google home page
    public static void navigateToGoogleSearchPage() {
        driver.get("https://www.amazon.com/");
        driver.quit();
    }

    

}
