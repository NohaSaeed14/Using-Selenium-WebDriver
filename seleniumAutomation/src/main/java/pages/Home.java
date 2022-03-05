package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	// variables
	private WebDriver driver;
	private String url = "https://www.youtube.com/";

	// locators
	private By searchBox = By.xpath("//*[contains(@aria-label,'Search')]");

	// constructor
	public Home(WebDriver driver) {
		this.driver = driver;
	}

	// keywords / actions
	public void navigate() {
		driver.navigate().to(url);
	}

	public void search(String query) {
		driver.findElement(searchBox).sendKeys(query + Keys.ENTER);
	}

}
