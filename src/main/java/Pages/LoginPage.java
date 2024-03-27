package Pages;

import Locators.LoginPageLocators;
import Objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage{
    public void login(Account account){
        driver.findElement(LoginPageLocators.INPUT_USERNAME).sendKeys(account.getUsername());
        driver.findElement(LoginPageLocators.INPUT_PASSWORD).sendKeys(account.getPassword());
        driver.findElement(LoginPageLocators.BUTTON_LOGIN).click();
    }
}
