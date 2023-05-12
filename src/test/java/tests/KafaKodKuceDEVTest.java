package tests;

import helpers.KafaKodKuceDEVHelper;
import org.junit.Test;

public class KafaKodKuceDEVTest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        KafaKodKuceDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        KafaKodKuceDEVHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void RacunTest() throws InterruptedException{
        KafaKodKuceDEVHelper.RacunShopping();
        Thread.sleep(7000);
    }
    //ZAVRSI OVO IMA GRESKI U NABAVCI
    @Test
    public void Searchtest() throws InterruptedException{
        KafaKodKuceDEVHelper.SearchH();
        Thread.sleep(4000);
    }

    @Test
    public void KontaktTest() throws InterruptedException{
        KafaKodKuceDEVHelper.KontaktH();
        Thread.sleep(4000);
    }
}
