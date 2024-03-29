package Selenium_Automation_framework.selenium_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_GooglePage_Open {

    public static void main(String[] args) {
        try {
            // Set the path to your Chrome WebDriver executable
            System.setProperty("webdriver.chrome.driver", "/Users/amit.pandey1/Desktop/amit_git_project/chromedriver");

            // Create a new instance of the Chrome driver
            WebDriver driver = new ChromeDriver();

            // Navigate to Google's homepage
            driver.get("https://www.google.com");

            // Print the title of the page to the console
            System.out.println("Title of the page: " + driver.getTitle());

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
