package tests;

import helpers.ETehnikaHelper;
import org.junit.Test;

public class EtehnikaTest extends BaseTest {
    @Test
    public void EtehnikaRegistracijaTest() throws InterruptedException {
        ETehnikaHelper.DefRegistracija();
        Thread.sleep(3000);
    }

    @Test
    public void EtehnikaLoginTest() throws InterruptedException {
        ETehnikaHelper.DefLogin();
        Thread.sleep(3000);
    }

    @Test
    public void KarticaPlacanjeTest() throws InterruptedException {
        ETehnikaHelper.PlacanjeKarticom();
        Thread.sleep(3000);
    }

    @Test
    public void PlacanjePouzecemTest() throws InterruptedException {
        ETehnikaHelper.PlacanjePouzecem();
        Thread.sleep(3000);
    }

    @Test
    public void SearchTest() throws InterruptedException {
        ETehnikaHelper.SearchBar();
        Thread.sleep(3000);
    }
}