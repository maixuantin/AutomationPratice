package Data;

import Objects.Account;
import Objects.CheckoutInformation;

public class TestData {
    public static Account accountSuccess() {
        return new Account("standard_user", "secret_sauce");
    }

    public static CheckoutInformation checkoutInfo() {
        return new CheckoutInformation("Tin", "Mai", "70000");
    }

}
