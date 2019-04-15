import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class exampleTest {
    private WebDriver driver;
    private By loginBtn = By.xpath(ta("w3c:loginBtn", "//div[./span[text()='Login']]"));
    private By signupBtn = By.cssSelector(ta("w3c:signupBtn", "div.sign-up-container > a"));
    private By emailFl = By.name(ta("w3c:emailFl", "email"));

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        driver = new TrueAutomationDriver(new URL("http://localhost:4444"), new DesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() {
        driver.get("https://trueautomation.io");

        driver.findElement(loginBtn).click();
        driver.findElement(signupBtn).click();

        driver.findElement(emailFl).sendKeys("your@mail.com");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
