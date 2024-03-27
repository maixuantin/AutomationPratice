package Locators;

import org.openqa.selenium.By;

public class CheckoutPageLocators {
    public static By INPUT_FIRSTNAME = By.id("first-name");
    public static By INPUT_LASTNAME = By.id("last-name");
    public static By INPUT_POSTALCODE = By.id("postal-code");
    public static By BUTTON_CANCEL = By.id("cancel");
    public static By BUTTON_CONTINUE = By.id("continue");
    public static By LABEL_ITEMTOTAL = By.xpath("//div[@class='summary_subtotal_label']");
    public static By LABEL_TAX = By.xpath("//div[@class='summary_tax_label']");

}
