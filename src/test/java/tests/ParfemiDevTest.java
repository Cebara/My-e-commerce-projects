package tests;

import helpers.ParfemiDevHelper;
import org.junit.Test;

public class ParfemiDevTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        ParfemiDevHelper.Reg();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        ParfemiDevHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Shopping() throws InterruptedException{
        ParfemiDevHelper.ShopingHelper();
        Thread.sleep(4000);

    }

}
