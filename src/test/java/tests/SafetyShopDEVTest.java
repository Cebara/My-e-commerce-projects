package tests;

import helpers.SafetyShopDEVHelper;
import org.junit.Test;

public class SafetyShopDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        SafetyShopDEVHelper.Regh();
        Thread.sleep(4000);
    }

    @Test
    public void Logintest() throws InterruptedException{
        SafetyShopDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShopTest() throws InterruptedException{
        SafetyShopDEVHelper.ShoppingH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        SafetyShopDEVHelper.SearchH();
        Thread.sleep(4000);
    }
}
