package Pages;

import Locators.ProductPageLocators;
import Locators.YourCartPageLocators;
import Objects.Product;

import java.util.ArrayList;

public class ProductPage extends BasePage{
    public void addProduct(String index){
        driver.findElement(ProductPageLocators.buttonAddToCart(index)).click();
    }
    public void removeProduct(String index){
        driver.findElement(ProductPageLocators.buttonRemove(index)).click();
    }
    public Product getProductInfo(String index){
        Product product = new Product();
        product.setName(driver.findElement(ProductPageLocators.productTitle(index)).getText());
        product.setDescription(driver.findElement(ProductPageLocators.productDesc(index)).getText());
        product.setPrice(driver.findElement(ProductPageLocators.productPrice(index)).getText());
        return product;
    }
    public String getShoppingCartBadge(){
        return driver.findElement(ProductPageLocators.shoppingCartBadge).getText();
    }
    public void clickShoppingCartBadge(){
        driver.findElement(ProductPageLocators.shoppingCartBadge).click();
    }
    public ArrayList<Product> productArrayList(){
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            products.add(getProductInfo(String.valueOf(i)));
        }
        return products;
    }
}
