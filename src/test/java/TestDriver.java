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

/**
 *
 * A simple junit/selenium test.
 */
public class TestDriver {

	private WebDriver driver;

	@BeforeClass
	public static void setupDrivers() {
		System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
		WebDriverManager.chromedriver().setup();
	}

	// TODO fill me out

}
