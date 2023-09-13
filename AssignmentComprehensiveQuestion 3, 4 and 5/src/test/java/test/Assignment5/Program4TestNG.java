package test.Assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Program4TestNG {
    private WebDriver driver;
    private String baseUrl = "https://www.automationanywhere.com/";

    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        // Initialize the Chrome WebDriver
        driver = new ChromeDriver();

        // Navigate to the website
        driver.get(baseUrl);
    }

    @Test
    public void verifyProductsLink() {
        WebElement productsLink = driver.findElement(By.linkText("Products"));
        Assert.assertTrue(productsLink.isDisplayed());
        productsLink.click();
        // Add navigation verification for the "Products" page
        // Assert.assertTrue(driver.getTitle().contains("Products Page Title"));
    }

    @Test
    public void verifySolutionsLink() {
        WebElement solutionsLink = driver.findElement(By.linkText("Solutions"));
        Assert.assertTrue(solutionsLink.isDisplayed());
        solutionsLink.click();
        // Add navigation verification for the "Solutions" page
        // Assert.assertTrue(driver.getTitle().contains("Solutions Page Title"));
    }

    @Test
    public void verifyResourcesLink() {
        WebElement resourcesLink = driver.findElement(By.linkText("Resources"));
        Assert.assertTrue(resourcesLink.isDisplayed());
        resourcesLink.click();
        // Add navigation verification for the "Resources" page
        // Assert.assertTrue(driver.getTitle().contains("Resources Page Title"));
    }

    @Test
    public void verifyBeyondRPALink() {
        WebElement beyondRPALink = driver.findElement(By.linkText("Beyond RPA"));
        Assert.assertTrue(beyondRPALink.isDisplayed());
        beyondRPALink.click();
        // Add navigation verification for the "Beyond RPA" page
        // Assert.assertTrue(driver.getTitle().contains("Beyond RPA Page Title"));
    }

    @Test
    public void verifyCompanyLink() {
        WebElement companyLink = driver.findElement(By.linkText("Company"));
        Assert.assertTrue(companyLink.isDisplayed());
        companyLink.click();
        // Add navigation verification for the "Company" page
        // Assert.assertTrue(driver.getTitle().contains("Company Page Title"));
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver
        driver.quit();
    }
}


