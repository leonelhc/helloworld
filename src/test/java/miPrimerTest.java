import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Leonel on 25/10/2015.
 */
public class miPrimerTest {

    @Test
    public void verificarTitulo(){

        WebDriver driver= new FirefoxDriver();

        driver.navigate().to("http://www.google.com");

        Assert.assertTrue("Es Google?", driver.getTitle().contains("cho"));

        driver.close();
        driver.quit();
    }
}
