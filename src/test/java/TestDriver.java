import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * A simple junit/selenium test.
 */
public class TestDriver {

	private WebDriver driver;

	@BeforeAll
	public static void setupDrivers() {
		WebDriverManager.chromedriver().setup();
	}

	// Your task:
    // navigate to https://weather.gov
	// Then do a lookup in the forecast box for "New York" and get the forecast for "New York, FL"
	// Note: It will (strangely) return the weather for Mobile, AL, this is expected.
	// You can google!

}
