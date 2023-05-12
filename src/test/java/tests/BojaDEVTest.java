package tests;

import helpers.BojaDEVHelper;
import org.junit.Test;

public class BojaDEVTest extends BaseTest {

    @Test
    public void LoginTest() throws InterruptedException{
        BojaDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShoppingTest() throws InterruptedException{
        BojaDEVHelper.ShoppingH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        BojaDEVHelper.SearchH();
        Thread.sleep(4000);
    }
}
