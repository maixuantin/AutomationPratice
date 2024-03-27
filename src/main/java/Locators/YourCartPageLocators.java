package Locators;

import org.openqa.selenium.By;

public class YourCartPageLocators {
    public static By productTitle(String index) {
        return By.xpath("(//div[contains(@class, 'inventory_item_name')])[" + index + "]");
    }

    public static By productDesc(String index) {
        return By.xpath("(//div[@class='inventory_item_desc'])[" + index + "]");
    }

    public static By productPrice(String index) {
        return By.xpath("(//div[@class='inventory_item_price'])[" + index + "]");
    }
    public static By buttonRemove(String index) {
        return By.xpath("(//button[text()='Remove'])[" + index + "]");
    }
}
