package stepDefinitions;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class hooks extends env {
    @Before
    public void before() {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get (url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
    }

    @After
    public void after() {
        driver.quit();
    }
}
