package test.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Question_4 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.automationanywhere.com/");

        // List of link texts to verify and click
        String[] linkTexts = {"Products", "Solutions", "Resources", "Beyond RPA", "Company"};

        // Loop through the link texts and verify navigation
        for (String linkText : linkTexts) {
            WebElement linkElement = driver.findElement(By.linkText(linkText));
            if (linkElement.isDisplayed()) {
                System.out.println(linkText + " link is present.");
                linkElement.click();
                // Sleep to allow time for the page to load (you might need to adjust this)
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Verify that the page title or content indicates proper navigation
                if (driver.getTitle().contains(linkText) || driver.getPageSource().contains(linkText)) {
                    System.out.println("Navigated to the proper page: " + driver.getTitle());
                } else {
                    System.out.println("Navigation to the proper page failed.");
                }
                // Navigate back to the home page for the next link verification
                driver.navigate().back();
            } else {
                System.out.println(linkText + " link is not present.");
            }
        }

        // Close the WebDriver
        driver.quit();
    }
}

