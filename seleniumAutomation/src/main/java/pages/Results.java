package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Results {
	// variables
	private WebDriver driver;

	// locators
	private By Filters = By.xpath("//*[contains(@aria-label,'Search filters')]");
	private By VideoTabs = By.xpath("//yt-formatted-string[text()='Video']");
	private By thirdVideo = By.xpath(
			"//*[contains(@aria-label,'Selenium Course for Beginners - Web Scraping Bots, Browser Automation, Testing (Tutorial)')]");
	private By thirdVideoTestAutomation = By.xpath(
			"//*[contains(@aria-label,'Selenium Tutorial For Beginners | What Is Selenium? | Selenium Automation Testing Tutorial | Edureka')]");
	private By tenthVideoSeleniumTutorial = By.xpath(
			"//*[contains(@aria-label,'Selenium Beginner Tutorial 1 - Introduction - What is Selenium | Selenium Interview | Step by Step')]");

	// constructor
	public Results(WebDriver driver) {
		this.driver = driver;
	}
	// keywords / actions

	public void FilterButtons() {
		driver.findElement(Filters).click();

	}

	public void ClickOnVideoTab() {
		driver.findElement(VideoTabs).click();

	}

	// TestCase No.1
	public String getTiTleOfThirdVideo() {
		return driver.findElement(thirdVideo).getText();

	}

	// TestCase No.2
	public String getTiTleOfThirdVideoTestAutomation() {
		return driver.findElement(thirdVideoTestAutomation).getText();

	}
	// TestCase No.3

	public String getTiTleOfTenthVideoSeleniumTutorial() {
		return driver.findElement(tenthVideoSeleniumTutorial).getText();

	}
}
