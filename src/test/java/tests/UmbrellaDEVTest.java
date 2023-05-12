package tests;

import helpers.UmbrellaDEVHelper;
import org.junit.Test;

public class UmbrellaDEVTest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        UmbrellaDEVHelper.Reghelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        UmbrellaDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShopTest() throws InterruptedException{
        UmbrellaDEVHelper.Shopping();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        UmbrellaDEVHelper.SearchH();
    }
}
