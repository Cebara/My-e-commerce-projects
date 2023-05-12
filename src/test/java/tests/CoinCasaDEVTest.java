package tests;

import helpers.CoinCasaDEVHelper;
import org.junit.Test;

public class CoinCasaDEVTest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        CoinCasaDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        CoinCasaDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiPouzeceTest() throws InterruptedException{
        CoinCasaDEVHelper.LicnoIPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiRacunTest() throws InterruptedException{
        CoinCasaDEVHelper.LicnoIRacunH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiPlatnaTest() throws InterruptedException{
        CoinCasaDEVHelper.LicnoIPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void DostavaiPouzeceTest() throws InterruptedException{
        CoinCasaDEVHelper.DostavaiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void DostavaiRacunTest() throws InterruptedException{
        CoinCasaDEVHelper.DostavaiRacunH();
        Thread.sleep(4000);
    }

    @Test
    public void DostavaiPlatnaTest() throws InterruptedException{
        CoinCasaDEVHelper.DostavaiPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        CoinCasaDEVHelper.SearchH();
    }
}
