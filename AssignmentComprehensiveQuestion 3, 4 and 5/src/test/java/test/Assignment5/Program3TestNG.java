package test.Assignment5;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Program3TestNG {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void verifyAutomationAnywhereLogoPresence() {
        // Navigate to the website
        driver.get("https://www.automationanywhere.com/");

        // Verify Automation Anywhere logo is present
        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div/a/img"));
        Assert.assertTrue(logo.isDisplayed(), "Automation Anywhere logo is not present.");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        // Close the WebDriver
    	Thread.sleep(10000);
        driver.quit();
    }
}

