package tests;

import helpers.PositiveLineDEVHelper;
import org.junit.Test;

public class PositiveLineDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        PositiveLineDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        PositiveLineDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void PlatnaKarticaTest() throws InterruptedException{
        PositiveLineDEVHelper.PlatnaKHelper();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaTest() throws InterruptedException{
        PositiveLineDEVHelper.IsporukaH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchT() throws InterruptedException{
        PositiveLineDEVHelper.SearchH();
        Thread.sleep(4000);
    }
}
