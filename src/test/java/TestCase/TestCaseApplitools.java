package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCaseApplitools {
    public static ArrayList<String> readCSV(String pathname) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File myObj = new File(pathname);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                arrayList.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return arrayList;
    }

    @Test
    public void Test01() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hehe");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
        driver.findElement(By.xpath("//a[@id='log-in']")).click();
        ArrayList<String> csv = readCSV("src/main/resources/data.csv");
        int row = 1;
        for (String a : csv) {
            String expectedStatus = a.split(";")[0].toString();
            String expectedDate = a.split(";")[1].toString();
            String expectedDescription = a.split(";")[2].toString();
            String expectedCategory = a.split(";")[3].toString();
            String expectedAmount = a.split(";")[4].toString();
            String status = driver.findElement(By.xpath("//table//tbody//tr[" + row + "]/td[1]")).getText();
            String date = driver.findElement(By.xpath("//table//tbody//tr[" + row + "]/td[2]")).getText();
            String description = driver.findElement(By.xpath("//table//tbody//tr[" + row + "]/td[3]")).getText();
            String category = driver.findElement(By.xpath("//table//tbody//tr[" + row + "]/td[4]")).getText();
            String amount = driver.findElement(By.xpath("//table//tbody//tr[" + row + "]/td[5]")).getText();
            row++;
            Assert.assertEquals(status, expectedStatus);
            Assert.assertEquals(date, expectedDate);
            Assert.assertEquals(description, expectedDescription);
            Assert.assertEquals(category, expectedCategory);
            Assert.assertEquals(amount, expectedAmount);
        }

    }
}
