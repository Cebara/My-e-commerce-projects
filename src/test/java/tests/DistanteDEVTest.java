package tests;

import helpers.DistanteDEVHelper;
import org.junit.Test;

import java.beans.IntrospectionException;

public class DistanteDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        DistanteDEVHelper.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginT() throws InterruptedException{
        DistanteDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void Racun() throws InterruptedException{
        DistanteDEVHelper.RacunHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Pouzece() throws InterruptedException{
        DistanteDEVHelper.PouzeceHelper();
        Thread.sleep(4000);
    }

    @Test
    public void PlatnaKarticaTest() throws InterruptedException{
        DistanteDEVHelper.PlatnaHelper();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        DistanteDEVHelper.SearchH();
        Thread.sleep(4000);
    }
}
