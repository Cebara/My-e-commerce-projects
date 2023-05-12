package tests;

import helpers.BomarHelperLIVE;
import org.junit.Test;

public class BomarTestLIVE extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        BomarHelperLIVE.Reghelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        BomarHelperLIVE.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiGotovinaTest() throws InterruptedException{
        BomarHelperLIVE.IsporukaiGotovinaH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiPlatnaKTest() throws InterruptedException{
        BomarHelperLIVE.IsporukaIPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIGotovinaTest() throws InterruptedException{
        BomarHelperLIVE.LicnoIGotovina();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIPlatnaKTest() throws InterruptedException{
        BomarHelperLIVE.LicnoIPlatnakH();
        Thread.sleep(4000);
    }

    @Test
    public void KontaktTest() throws InterruptedException{
        BomarHelperLIVE.KontaktH();
        Thread.sleep(4000);
    }
    @Test
    public void SearchTest() throws InterruptedException{
        BomarHelperLIVE.SearchH();
    }
}
