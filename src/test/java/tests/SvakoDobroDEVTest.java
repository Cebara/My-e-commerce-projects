package tests;

import helpers.SvakoDobroDEVHelper;
import org.junit.Test;

public class SvakoDobroDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        SvakoDobroDEVHelper.RegHelper();
        Thread.sleep(7000);
    }

    @Test
    public void Logintest() throws InterruptedException{
        SvakoDobroDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void PlacanjePouzecemTest() throws InterruptedException{
        SvakoDobroDEVHelper.PouzeceH();
        Thread.sleep(7000);
    }

    @Test
    public void IntesaTest() throws InterruptedException{
        SvakoDobroDEVHelper.IntesaH();
        Thread.sleep(7000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        SvakoDobroDEVHelper.SearchH();
        Thread.sleep(4000);
    }

    @Test
    public void KontaktTest() throws InterruptedException{
        SvakoDobroDEVHelper.KontaktH();
        Thread.sleep(4000);
    }
}
