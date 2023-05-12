package tests;

import helpers.GardenDEVHelper;
import org.junit.Test;

public class GardenDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        GardenDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        GardenDEVHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Shopping() throws InterruptedException{
        GardenDEVHelper.ShoppingH();
        Thread.sleep(4000);
    }
}

