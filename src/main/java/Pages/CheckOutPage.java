package Pages;

import Locators.CheckoutPageLocators;
import Objects.CheckoutInformation;

public class CheckOutPage extends BasePage {
    public void fulfillInformation(CheckoutInformation info) {
        driver.findElement(CheckoutPageLocators.INPUT_FIRSTNAME).sendKeys(info.getFirstName());
        driver.findElement(CheckoutPageLocators.INPUT_LASTNAME).sendKeys(info.getLastName());
        driver.findElement(CheckoutPageLocators.INPUT_POSTALCODE).sendKeys(info.getPostalCode());
    }

    public void clickContinue() {
        driver.findElement(CheckoutPageLocators.BUTTON_CONTINUE).click();
    }
    public String getTax(){
        String tax = driver.findElement(CheckoutPageLocators.LABEL_TAX).getText();
        return tax.replace("Tax: $","");

    }
    public String getItemTotal(){
        String tax = driver.findElement(CheckoutPageLocators.LABEL_ITEMTOTAL).getText();
        return tax.replace("Item total: $","");

    }
}
