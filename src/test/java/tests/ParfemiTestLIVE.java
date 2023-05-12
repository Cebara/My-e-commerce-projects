package tests;

import helpers.ParfemiHelperLIVE;
import org.junit.Test;

public class ParfemiTestLIVE extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        ParfemiHelperLIVE.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        ParfemiHelperLIVE.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShoppingTest() throws InterruptedException{
        ParfemiHelperLIVE.ShoppingH();
        Thread.sleep(4000);
    }
}
