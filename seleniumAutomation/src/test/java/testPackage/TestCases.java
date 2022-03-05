package testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Home;
import pages.Results;
import pages.VideoResultsPage;

public class TestCases {
	private WebDriver driver;
	private Home home;
	private Results results;
	private VideoResultsPage videoResult;

	@Test
	public void assertTheVideoTitleforSeleniumTutorial() {
		home.search("Selenium Tutorial");
		results.FilterButtons();
		results.ClickOnVideoTab();
		String nameOfThirdVideo = results.getTiTleOfThirdVideo();
		videoResult.ClickOnThirdVideo();
		String titleOfVideo = videoResult.getTiTleOfseleniumVideo();
		Assert.assertEquals(nameOfThirdVideo,
				"Selenium Course for Beginners - Web Scraping Bots, Browser Automation, Testing (Tutorial)");

	}

	@Test
	public void assertTheVideoTitleforTestAutomationTutorial() {
		home.search("Test Automation Tutorial");
		results.FilterButtons();
		results.ClickOnVideoTab();
		String nameOfThirdVideoOfTestAutomation = results.getTiTleOfThirdVideoTestAutomation();
		videoResult.ClickOnThirdVideoOfTestAutomation();
		String titleOfVideoOfTestAutomation = videoResult.getTiTleOfTestAutomationVideo();
		Assert.assertEquals(nameOfThirdVideoOfTestAutomation,
				"Selenium Tutorial For Beginners | What Is Selenium? | Selenium Automation Testing Tutorial | Edureka");

	}

	@Test
	public void assertTheVideoTitlefor10thResult() {
		home.search("Selenium Tutorial");
		results.FilterButtons();
		results.ClickOnVideoTab();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,350)", "");
		String nameOfTenthVideoOfSeleniumTutorial = results.getTiTleOfTenthVideoSeleniumTutorial();
		videoResult.ClickOnTenthVideo();
		String titleOfTenthVideoOfSeleniumTutorial = videoResult.getTiTleOfTenthVideo();
		Assert.assertEquals(nameOfTenthVideoOfSeleniumTutorial,
				"Selenium Beginner Tutorial 1 - Introduction - What is Selenium | Selenium Interview | Step by Step");
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		home = new Home(driver);
		results = new Results(driver);
		videoResult = new VideoResultsPage(driver);
		home.navigate();
		/*
		 * HSSFWorkbook workbook; HSSFSheet sheet; Import excel sheet File src=new
		 * File("C:\\Users\\dell\\OneDrive\\Desktop\\TestData.xls"); Load the file
		 * FileInputStream finput = new FileInputStream(src);
		 * 
		 * Load the workbook workbook = new HSSFWorkbook(finput);
		 * 
		 * Load the sheet in which data is stored. sheet= workbook.getSheetAt(0);
		 */
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
