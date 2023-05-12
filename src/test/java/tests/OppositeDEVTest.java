package tests;

import helpers.OppositeDEVHelper;
import org.junit.Test;

public class OppositeDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        OppositeDEVHelper.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        OppositeDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIPreuzimanjeTest() throws InterruptedException{
        OppositeDEVHelper.LicnoiPreuzimanje();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIAdministrativnaZabranaTest() throws InterruptedException{
        OppositeDEVHelper.LicnoIAdministrativnaZabranaH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoICekoviTest() throws InterruptedException{
        OppositeDEVHelper.LicnoICekoviH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIKarticaTest() throws InterruptedException{
        OppositeDEVHelper.LicnoIKarticaH();
        Thread.sleep(4000);
    }

    @Test
    public void PouzeceIPreuzimanjeTest() throws InterruptedException{
        OppositeDEVHelper.PouzeceIPreuzimanjeH();
        Thread.sleep(4000);
    }

    @Test
    public void PouzeceIAdministrativnaTest() throws InterruptedException{
        OppositeDEVHelper.PouzeceIAdministrativnaH();
        Thread.sleep(4000);
    }

    @Test
    public void PouzeceICekoviTest() throws InterruptedException{
        OppositeDEVHelper.PouzeceICekoviH();
        Thread.sleep(4000);
    }

    @Test
    public void PouzeceIKarticaTest() throws InterruptedException{
        OppositeDEVHelper.PouzeceIKarticaH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        OppositeDEVHelper.SearchH();
    }
}
