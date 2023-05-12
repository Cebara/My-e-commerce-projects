package tests;

import helpers.ReproStylishDEVHelper;
import org.junit.Test;

public class ReproStylishDEVTest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        ReproStylishDEVHelper.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        ReproStylishDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void Shoppingtest() throws InterruptedException{
        ReproStylishDEVHelper.ShopH();
        Thread.sleep(7000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        ReproStylishDEVHelper.SearchH();
        Thread.sleep(3000);
    }
}
