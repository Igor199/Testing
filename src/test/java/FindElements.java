import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class FindElements {
    static WebDriver driver;
    static String pageURL;

    @BeforeClass
    public static void createDriver() {
        pageURL = "http://compendiumdev.co.uk/selenium/find_by_playground.php";
        driver = new FirefoxDriver();
        driver.get(pageURL);
    }

    @Test
    public void findElementTestsByID() {
        WebElement aParagraph = driver.findElement(By.id("p1"));
        String a1 = aParagraph.getText();
        assertEquals("This is a paragraph text", a1);
    }

    @Test
    public void findElementTestsBylinkText() {
        WebElement jumpToPara0 = driver.findElement(By.linkText("jump to para 0"));
        assertEquals("a26", jumpToPara0.getAttribute("id"));
    }

    @Test
    public void findElementByName() {
        WebElement cParagraph = driver.findElement(By.name("pName3"));
        assertEquals("This is c paragraph text", cParagraph.getText());
    }

    @Test
    public void findElementByPartialLinkText() {
        WebElement jumpTo = driver.findElement(By.partialLinkText("jump to"));
        assertEquals("jump to para 0", jumpTo.getText());

        WebElement to = driver.findElement(By.partialLinkText("to"));
        assertEquals("jump to para 0", to.getText());

        WebElement seven = driver.findElement(By.partialLinkText("7"));
        assertEquals("jump to para 7", seven.getText());
    }

    @Test
    public void findElementByClassName() {
        WebElement div1 = driver.findElement(By.className("specialDiv"));
        assertEquals("mydivname", div1.getAttribute("name"));
    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }
}
