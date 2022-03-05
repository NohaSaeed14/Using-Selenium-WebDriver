package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VideoResultsPage {
	// variables
	private WebDriver driver;

	// locators
	private By seleniumVideoResultTitle = By.xpath(
			"//*[contains(@aria-label,'Selenium Course for Beginners - Web Scraping Bots, Browser Automation, Testing (Tutorial)')]");
	private By TestAutomationVideoResultTitle = By.xpath(
			"//*[contains(@aria-label,'Selenium Tutorial For Beginners | What Is Selenium? | Selenium Automation Testing Tutorial | Edureka')]");
	private By SeleniumVideoTenthResultTitle = By.xpath(
			"//*[contains(@aria-label,'Selenium Beginner Tutorial 1 - Introduction - What is Selenium | Selenium Interview | Step by Step')]");

	// constructor
	public VideoResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	// keywords / actions
	// TestCase No.1
	public void ClickOnThirdVideo() {
		driver.findElement(seleniumVideoResultTitle).click();

	}

	public String getTiTleOfseleniumVideo() {
		return driver.getTitle();

	}

	// TestCase No.2
	public void ClickOnThirdVideoOfTestAutomation() {
		driver.findElement(TestAutomationVideoResultTitle).click();

	}

	public String getTiTleOfTestAutomationVideo() {
		return driver.getTitle();

	}

	// TestCase No.3
	public void ClickOnTenthVideo() {
		driver.findElement(SeleniumVideoTenthResultTitle).click();

	}

	public String getTiTleOfTenthVideo() {
		return driver.getTitle();

	}
}
