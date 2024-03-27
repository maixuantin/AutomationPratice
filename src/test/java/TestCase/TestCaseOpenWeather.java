package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseOpenWeather {
    @Test
    public void Test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://openweathermap.org/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Thanh pho Ho Chi Minh, VN");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement name = driver.findElement(By.xpath("//div[@class='section-content']//h2"));
        String cityName = name.getText();
        Assert.assertTrue(cityName.toLowerCase().contains("ho chi minh"));
        driver.quit();
    }
}
