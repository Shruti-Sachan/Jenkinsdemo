package CucumberJavaProject.sampleProject;
 
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class FirstSeleniumProject {
    static WebDriver driver;
 
    @BeforeTest
    public static void initializeWebdriver() {
        // Set the path for chromeDriver
    	System.setProperty(" webdriver.chrome.driver",
    			"C:\\Users\\shrutisachan\\eclipse\\java-2022-12\\eclipse\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    			driver = new ChromeDriver();
    }
 
    @Test
    public static void navigateToGoogleSearchPage() {
    	try {
    		Thread.sleep(1000);
            driver.get("https://www.amazon.com/");	
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    @AfterTest
    public static void afterTest() {
    	try {
    		driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
 
    
 
}
