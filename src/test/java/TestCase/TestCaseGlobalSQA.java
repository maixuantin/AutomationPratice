package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseGlobalSQA {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/accordion-and-tabs/");
        driver.switchTo().defaultContent();
        WebElement iframe1 = driver.findElement(By.xpath("(//div[@class=\"resp-tabs-container\"]//iframe)[1]"));
        driver.switchTo().frame(iframe1);
        driver.findElement(By.id("ui-id-3")).click();
        driver.findElement(By.id("ui-id-5")).click();
        driver.findElement(By.id("ui-id-7")).click();
        driver.findElement(By.id("ui-id-1")).click();
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
