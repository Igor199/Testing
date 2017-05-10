import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class BeforeAfterTest {
    static WebDriver driver ;

    @BeforeClass
    public static void createDriver() {
        driver = new FirefoxDriver();
    }

    @Test
    public void seleniumTest() {
        driver.navigate().to("http://compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }

    @Test
    public void searchTest() {
        driver.navigate().to("http://compendiumdev.co.uk/selenium/search.php");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified Search Engine"));
    }

    @Test
    public void basicHtmlForm() {
        driver.navigate().to("http://compendiumdev.co.uk/selenium/basic_html_form.html");
        assertTrue(driver.getTitle().startsWith("HTML Form Elements"));
    }

    @Test
    public void refreshPage(){
        driver.navigate().to("http://compendiumdev.co.uk/selenium/refresh.php");
        assertTrue(driver.getTitle().matches("Refreshed Page on [0-9]{10}"));
    }

    @Test
    public void basicWebPage(){
        driver.get("http://compendiumdev.co.uk/selenium/basic_web_page.html");
        assertTrue(driver.getTitle().startsWith("Basic Web Page Title"));
    }

    @AfterClass
    public static void quitDriver() {
       driver.quit();
    }

}
