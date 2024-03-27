package TestCase;

import Data.TestData;
import Objects.Product;
import Pages.*;
import Utilities.Assertion;
import Utilities.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestCaseSauceDemo {
    @Test
    public void Test01() {
        BasePage basePage = new BasePage();
        basePage.setupDriver();
        LoginPage loginPage = new LoginPage();
        loginPage.navigate(Constant.SAUCE_URL);
        loginPage.login(TestData.accountSuccess());
        ProductPage productPage = new ProductPage();
        for (int i = 1; i < 7; i++) {
            productPage.addProduct(String.valueOf(1));
            System.out.println(productPage.getProductInfo(String.valueOf(i)));
        }
        System.out.println(productPage.getShoppingCartBadge());
        ArrayList<Product> expectedProductList = productPage.productArrayList();
        productPage.clickShoppingCartBadge();
        YourCartPage yourCartPage = new YourCartPage();
        ArrayList<Product> actualProductList = yourCartPage.yourCartArrayList();
        for (int i = 1; i < expectedProductList.size(); i++) {
            Assertion.compareProducts(expectedProductList.get(i), actualProductList.get(i));
        }
        yourCartPage.clickCheckOut();
        CheckOutPage checkOutPage = new CheckOutPage();
        checkOutPage.fulfillInformation(TestData.checkoutInfo());
        checkOutPage.clickContinue();
        double totalPrice = 0;
        for (int i = 0; i < expectedProductList.size(); i++) {
            String price = expectedProductList.get(i).getPrice();
            price = price.replace("$", "");
            double p = Double.parseDouble(price);
            totalPrice = totalPrice + p;
        }
        System.out.println(totalPrice);
        Assert.assertEquals(String.valueOf(totalPrice), checkOutPage.getItemTotal());

        /*for (int i = 1; i < 7; i++){
            productPage.removeProduct(String.valueOf(1));
        }*/
        //loginPage.quit();
    }
}
