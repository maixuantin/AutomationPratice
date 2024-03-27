package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    static WebDriver driver = null;

    public BasePage() {
    }

    public WebDriver setupDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }
}
