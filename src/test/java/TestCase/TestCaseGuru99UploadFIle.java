package TestCase;

import Objects.Account;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestCaseGuru99UploadFIle {
    @Test
    public void Test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(System.getProperty("user.dir") + "\\src\\main\\resources\\abc.doc");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(3000);
        WebElement actualMsg = driver.findElement(By.id("res"));
        String msg = actualMsg.getText();
        Assert.assertTrue(msg.contains("1 file"));
        Assert.assertTrue(msg.contains("has been successfully uploaded."));
        Assert.assertEquals(msg, "1 file\nhas been successfully uploaded.");
        driver.quit();

    }

    @Test
    public void Test02() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(System.getProperty("user.dir") + "\\src\\main\\resources\\abc.doc");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(3000);
        WebElement actualMsg = driver.findElement(By.id("res"));
        String msg = actualMsg.getText();
        Assert.assertEquals(msg, "Please accept Terms Of Service");
        driver.quit();

    }

    @Test
    public void Test03() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\postgresql-16.2-1-windows-x64.exe");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(3000);
        WebElement actualMsg = driver.findElement(By.id("res"));
        String msg = actualMsg.getText();
        Assert.assertEquals(msg, "File exceeds limitation");
        driver.quit();
    }

}
