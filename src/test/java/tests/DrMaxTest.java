package tests;

import helpers.DrMax;
import org.junit.Test;

public class DrMaxTest extends BaseTest {

    @Test
    public void DrmaxRegTest() throws InterruptedException {
        DrMax.DefRegistracija();
        Thread.sleep(4000);
    }

    @Test
    public void DrMaxLoginTest() throws InterruptedException {
        DrMax.DefLogin();
        Thread.sleep(4000);
    }

    @Test
    public void DrMaxPlacanjeiPretragaTest() throws InterruptedException {
        DrMax.PlacanjeIPretraga();
        Thread.sleep(4000);
    }
}