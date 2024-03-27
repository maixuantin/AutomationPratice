package Pages;

import Locators.ProductPageLocators;
import Locators.YourCartPageLocators;
import Objects.Product;

import java.util.ArrayList;

public class YourCartPage extends BasePage {
    public Product getYourCartInfo(String index) {
        Product product = new Product();
        product.setName(driver.findElement(YourCartPageLocators.productTitle(index)).getText());
        product.setDescription(driver.findElement(YourCartPageLocators.productDesc(index)).getText());
        product.setPrice(driver.findElement(YourCartPageLocators.productPrice(index)).getText());
        return product;
    }

    public ArrayList<Product> yourCartArrayList() {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            products.add(getYourCartInfo(String.valueOf(i)));
        }
        return products;
    }

    public void clickCheckOut() {
        driver.findElement(ProductPageLocators.buttonCheckout).click();

    }
}
