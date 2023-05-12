package tests;

import helpers.MishelHelperLIVE;
import org.junit.Test;

import java.beans.IntrospectionException;

public class MishelTestLIVE extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException {
        MishelHelperLIVE.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Logintest() throws InterruptedException {
        MishelHelperLIVE.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void ShopTest() throws InterruptedException {
        MishelHelperLIVE.Shopping();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException {
        MishelHelperLIVE.SearchH();
        Thread.sleep(4000);
    }
}
