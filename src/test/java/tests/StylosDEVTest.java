package tests;

import helpers.BaseHelper;
import helpers.StylosDEVHelper;
import org.junit.Test;

public class StylosDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException {
        StylosDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException {
        StylosDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShopTest() throws InterruptedException {
        StylosDEVHelper.ShoppingH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException {
        StylosDEVHelper.SearchH();
    }
}
