package tests;

import helpers.PlanetBikeBAHelperLIVE;
import org.junit.Test;

public class PlanetBikeBATestLIVE extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        PlanetBikeBAHelperLIVE.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        PlanetBikeBAHelperLIVE.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void PouzeceTest() throws InterruptedException{
        PlanetBikeBAHelperLIVE.PouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void PredracunTest() throws InterruptedException{
        PlanetBikeBAHelperLIVE.PredracunH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTEst() throws InterruptedException{
        PlanetBikeBAHelperLIVE.SearchH();
    }

    @Test
    public void KontaktTest() throws InterruptedException{
        PlanetBikeBAHelperLIVE.KontaktH();
        Thread.sleep(3000);
    }
}
