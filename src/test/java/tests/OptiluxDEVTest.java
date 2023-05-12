package tests;

import helpers.OptiluxDEVHelper;
import org.junit.Test;

public class OptiluxDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        OptiluxDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        OptiluxDEVHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Shoping1test() throws InterruptedException{
        OptiluxDEVHelper.Shoping1();
        Thread.sleep(4000);
    }

    @Test
    public void Searchtest() throws InterruptedException{
        OptiluxDEVHelper.SearchH();
        Thread.sleep(4000);
    }


}
