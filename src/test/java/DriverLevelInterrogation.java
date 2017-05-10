import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverLevelInterrogation {

    static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        driver = new FirefoxDriver();
        driver.get("http://compendiumdev.co.uk/selenium/basic_web_page.html");
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }

    @Test
    public void assertTitleEquals() {
        Assert.assertTrue(driver.getTitle().matches("Basic Web Page Title"));
    }

    @Test
    public void assertCurrentUrl(){
        Assert.assertTrue(driver.getCurrentUrl().matches("http://compendiumdev.co.uk/selenium/basic_web_page.html"));
    }

    @Test
    public void pageSourceCheck() {
        Assert.assertTrue(driver.getPageSource().contains("A paragraph of text"));
    }
}
