package tests;

import helpers.ZlatniStandardDEVHelper;
import org.junit.Test;

public class ZlatniStandardDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        ZlatniStandardDEVHelper.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        ZlatniStandardDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void PostExpressIracunTest() throws InterruptedException{
        ZlatniStandardDEVHelper.PostExpressIPrekoRacuna();
        Thread.sleep(4000);
    }

    @Test
    public  void PostExpressiPouzeceTest() throws InterruptedException{
        ZlatniStandardDEVHelper.PostExpressIPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void ZlatniStandardiRacunTest() throws InterruptedException{
        ZlatniStandardDEVHelper.ZlatniStandardiRacunH();
        Thread.sleep(4000);
    }

    @Test
    public void ZlatniStandardiPouzeceTest() throws InterruptedException{
        ZlatniStandardDEVHelper.ZlatniStandardiPouzeceH();
        Thread.sleep(4000);
    }
}
