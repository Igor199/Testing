import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InterrogationExercise {

    public static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        driver = new FirefoxDriver();
    }

    @Test
    public void driverInterrogate(){

        final String pageURL = "http://compendiumdev.co.uk/selenium/basic_web_page.html";

        driver.navigate().to(pageURL);
        
        assertThat(driver.getTitle(), is("Basic Web Page Title"));
        assertThat(driver.getCurrentUrl(), is(pageURL));
        assertThat(driver.getPageSource(), containsString("A paragraph of text"));
    }

    @AfterClass
    public static void closeDriver(){
        driver.quit();
    }
}
