package tests;

import helpers.PlanetBikeRSDEVHelper;
import org.junit.Test;

public class PlanetBikeRSDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.RegHelper();
        Thread.sleep(8000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.Loginh();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiPouzeceTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.KurirskaiPouzece();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiPlatnaTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.KurirskaiPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiPredracunTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.KurirskaiPredracun();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiObjekatTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.KurirskaiObjekatH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoPreuzimanjeTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.LicnoH();
        Thread.sleep(4000);
    }

    @Test
    public void KontaktTest() throws InterruptedException{
        PlanetBikeRSDEVHelper.KontaktH();
        Thread.sleep(4000);
    }
}
