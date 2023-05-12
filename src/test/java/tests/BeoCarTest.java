package tests;

import helpers.BeoCarHelper;
import org.junit.Test;


public class BeoCarTest extends BaseTest{

    @Test
    public void BeoCarRegTest() throws InterruptedException {
        BeoCarHelper.DefRegistracija();
        Thread.sleep(4000);
    }

    @Test
    public void BeoCarLogin() throws InterruptedException {
        BeoCarHelper.DefLogin();
        Thread.sleep(4000);
    }

    @Test
    public void RacuniProdavnica1Test() throws InterruptedException {
        BeoCarHelper.RacuniProdavnica1();
        Thread.sleep(4000);
    }

    @Test
    public void RacuniProdavnica2Test() throws InterruptedException{
        BeoCarHelper.RacuniProdavnica2();
        Thread.sleep(4000);
    }
    @Test
    public void RacuniProdavnica3() throws InterruptedException{
        BeoCarHelper.RacuniProdavnica3();
        Thread.sleep(4000);
    }

    @Test
    public void RacunIKurirTest() throws InterruptedException{
        BeoCarHelper.Racunikurir();
        Thread.sleep(4000);
    }
    @Test
    public void GotovinaiPrvaProdzaTest() throws InterruptedException {
        BeoCarHelper.GotovinaIProdza1();
        Thread.sleep(4000);
    }

    @Test
    public void GotovinaIProdza2Test() throws InterruptedException{
        BeoCarHelper.GotovinaIProdza2();
        Thread.sleep(4000);
    }

    @Test
    public void GotovinaIProdza3Test() throws InterruptedException{
        BeoCarHelper.GotovinaIProdza3();
        Thread.sleep(4000);
    }

    @Test
    public void GotovinaIKurirTest() throws InterruptedException{
        BeoCarHelper.GotovinaIKurir();
        Thread.sleep(4000);
    }
    @Test
    public void KarticaIprodza1Test() throws InterruptedException {
        BeoCarHelper.KarticaIProdza1();
        Thread.sleep(4000);
    }

    @Test
    public void KarticaIProdza2Test() throws InterruptedException{
        BeoCarHelper.KarticaIProdza2();
        Thread.sleep(4000);
    }

    @Test
    public void KarticaIProdza3Test() throws InterruptedException{
        BeoCarHelper.KarticaIProdza3();
        Thread.sleep(4000);
    }

    @Test
    public void KarticaIKurirTest() throws InterruptedException{
        BeoCarHelper.KarticaIKurir();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException {
        BeoCarHelper.Search();
        Thread.sleep(4000);
    }
}
