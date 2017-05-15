import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InterrogationExercise {

    @Test
    public void driverInterrogate(){

        WebDriver driver = new FirefoxDriver();

        final String pageURL = "http://compendiumdev.co.uk/selenium/basic_web_page.html";

        driver.navigate().to(pageURL);
        Assert.assertEquals(driver.getTitle(), "Basic Web Page Title");
        Assert.assertEquals(driver.getCurrentUrl(), pageURL);

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("A paragraph of text"));

        System.out.println(pageSource);
    }
}
