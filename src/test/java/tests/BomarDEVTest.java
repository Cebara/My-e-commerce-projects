package tests;

import helpers.BomarDEVHelper;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.junit.Test;

public class BomarDEVTest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        BomarDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        BomarDEVHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void PreuzimanjeIGotovinaTest() throws InterruptedException{
        BomarDEVHelper.PreuzimanjeIGotovina();
        Thread.sleep(4000);
    }

    @Test
    public void PreuzimanjeIPlatnatest() throws InterruptedException{
        BomarDEVHelper.PreuzimanjeIPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaIGotovina() throws InterruptedException{
        BomarDEVHelper.IsporukaIGotovina();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaIPlatna() throws InterruptedException{
        BomarDEVHelper.IsporukaIPlatna();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        BomarDEVHelper.SearchH();
        Thread.sleep(4000);
    }

    @Test
    public void KontantTest() throws InterruptedException{
        BomarDEVHelper.KontaktH();
        Thread.sleep(4000);
    }
}
