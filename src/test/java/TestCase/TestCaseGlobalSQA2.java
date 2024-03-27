package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseGlobalSQA2 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/samplepagetest/");
        WebElement inputProfilePic = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        inputProfilePic.sendKeys(System.getProperty("user.dir") + "/src/main/resources/abc.doc");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Tin");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Tin");

    }
}
