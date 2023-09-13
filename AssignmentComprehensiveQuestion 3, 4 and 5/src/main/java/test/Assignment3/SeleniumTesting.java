package test.Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://www.automationanywhere.com/");
		
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[1]/div/a/img"));
		if(logo.isDisplayed()) {
			System.out.println("Automation Anywhere logo is present.");
		}else {
			System.out.println("Automation Anywhere logo is not present");
		}
		WebElement requestDemoButton = driver.findElement(By.xpath("//a[contains(text(),'Request Demo')]"));
        if (requestDemoButton.isDisplayed() && requestDemoButton.isEnabled()) {
            System.out.println("Request demo button is present and clickable.");
        } else {
            System.out.println("Request demo button is not present or not clickable.");
        }
        
        // Close the WebDriver
        driver.quit();
	}

}
