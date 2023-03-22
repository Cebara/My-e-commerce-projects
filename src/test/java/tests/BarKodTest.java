package tests;

import helpers.BarKodHelper;
import org.junit.Test;

public class BarKodTest extends BaseTest {

    @Test
    public void RegistracijaTest() throws InterruptedException {
        BarKodHelper.DefRegistracija();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException {
        BarKodHelper.Login();
        Thread.sleep(4000);
    }

    @Test
    public void KucnaAdresaIPouzeceTest() throws InterruptedException {
        BarKodHelper.KucnaAdresaIPouzece();
        Thread.sleep(4000);
    }

    @Test
    public void ParfimerijaIPouzeceTest() throws InterruptedException {
        BarKodHelper.UparfimerijiIPouzece();
        Thread.sleep(4000);
    }

    @Test
    public void KucnaIPlatnaTest() throws InterruptedException {
        BarKodHelper.KucnaIPlatna();
        Thread.sleep(4000);
    }

    @Test
    public void ParfimerijaIPlatnaTest() throws InterruptedException {
        BarKodHelper.ParfimerijaIPlatna();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException {
        BarKodHelper.Search();
        Thread.sleep(4000);
    }
}