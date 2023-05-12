package tests;

import helpers.ReproMarketDEVHelper;
import org.junit.Test;

public class ReproMarketDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        ReproMarketDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        ReproMarketDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShoppingTest() throws InterruptedException{
        ReproMarketDEVHelper.ShopH();
        Thread.sleep(4000);
    }

    @Test
    public void Searchtest() throws InterruptedException{
        ReproMarketDEVHelper.SearchH();
    }

}
