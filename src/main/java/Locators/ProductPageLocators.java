package Locators;

import org.openqa.selenium.By;

public class ProductPageLocators {
    public static By shoppingCartBadge = By.xpath("//a[@class='shopping_cart_link']");

    public static By productTitle(String index) {
        return By.xpath("(//div[contains(@class, 'inventory_item_name')])[" + index + "]");
    }

    public static By productDesc(String index) {
        return By.xpath("(//div[@class='inventory_item_desc'])[" + index + "]");
    }

    public static By productPrice(String index) {
        return By.xpath("(//div[@class='inventory_item_price'])[" + index + "]");
    }

    public static By buttonAddToCart(String index) {
        return By.xpath("(//button[text()='Add to cart'])[" + index + "]");
    }

    public static By buttonRemove(String index) {
        return By.xpath("(//button[text()='Remove'])[" + index + "]");
    }
    public static By buttonCheckout = By.id("checkout");
}
