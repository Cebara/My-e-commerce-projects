package tests;

import helpers.MishelHelper;
import org.junit.Test;

public class MishelTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException {
        MishelHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException {
        MishelHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Shoppingtest() throws InterruptedException {
        MishelHelper.Shopping();
        Thread.sleep(4000);
    }
    @Test
    public void SearchTest() throws InterruptedException{
        MishelHelper.SearchH();
        Thread.sleep(4000);
    }
}



