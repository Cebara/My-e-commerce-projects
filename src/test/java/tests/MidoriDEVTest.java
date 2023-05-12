package tests;

import helpers.MidoriDEVHelper;
import org.junit.Test;

public class MidoriDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        MidoriDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        MidoriDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShoppingTest() throws InterruptedException{
        MidoriDEVHelper.ShoppingH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchT() throws InterruptedException{
        MidoriDEVHelper.SearchH();
        Thread.sleep(4000);
    }
}
