package tests;

import helpers.BeanzDEVHelper;
import org.junit.Test;

public class BeanzDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        BeanzDEVHelper.Reghelper();
        Thread.sleep(4000);
    }

    @Test
    public void Logintest() throws InterruptedException{
        BeanzDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ProfakturaTest() throws InterruptedException{
        BeanzDEVHelper.ProfakturaH();
        Thread.sleep(4000);
    }

    @Test
    public void PouzeceTest() throws InterruptedException{
        BeanzDEVHelper.PouzeceH();
        Thread.sleep(4000);
    }
}
