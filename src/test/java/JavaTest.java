import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class JavaTest {
    @Test
    public void driverNew(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        assertTrue(driver.getTitle().startsWith("Google"));
        driver.quit();
    }
}
