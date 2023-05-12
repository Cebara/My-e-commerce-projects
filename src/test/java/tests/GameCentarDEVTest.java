package tests;

import helpers.GameCentarDEVHelper;
import org.junit.Test;

public class GameCentarDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        GameCentarDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        GameCentarDEVHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIPouzeceTest() throws InterruptedException{
        GameCentarDEVHelper.KurirskaIPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIRacunTest() throws InterruptedException{
        GameCentarDEVHelper.KurirskaIRacunH();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIPlatnaTest() throws InterruptedException{
        GameCentarDEVHelper.KurirskaIPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void NoviSadIPouzeceTest() throws InterruptedException{
        GameCentarDEVHelper.NSiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void NoviSadiRacunTest() throws InterruptedException{
        GameCentarDEVHelper.NSiRacunH();
        Thread.sleep(4000);
    }

    @Test
    public void NSiPlatnaTest() throws InterruptedException{
        GameCentarDEVHelper.NSiPlatnaH();
    }

    @Test
    public void BGiPouzeceTest() throws InterruptedException{
        GameCentarDEVHelper.BgiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void BGiRacunTest() throws InterruptedException{
        GameCentarDEVHelper.BgiRacunH();
        Thread.sleep(4000);
    }

    @Test
    public void BGiPlatnaTest() throws InterruptedException{
        GameCentarDEVHelper.BgiPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        GameCentarDEVHelper.SearchH();
    }
}
