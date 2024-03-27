package Utilities;

import Locators.ProductPageLocators;
import Objects.Product;
import org.testng.Assert;

public class Assertion {
    public static void compareProducts(Product expectedProduct, Product actualProduct){
        Assert.assertEquals(expectedProduct.getName(),actualProduct.getName());
        Assert.assertEquals(expectedProduct.getDescription(),actualProduct.getDescription());
        Assert.assertEquals(expectedProduct.getPrice(),actualProduct.getPrice());
    }
}
