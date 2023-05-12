package tests;

import helpers.BaseHelper;
import helpers.PlanetBikeBAHelperDev;
import org.junit.Test;

public class PlanetBikeBATESTDev extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        PlanetBikeBAHelperDev.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        PlanetBikeBAHelperDev.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void ShoppingTest() throws InterruptedException{
        PlanetBikeBAHelperDev.Shopping();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        PlanetBikeBAHelperDev.SearchH();
        Thread.sleep(4000);
    }
}
