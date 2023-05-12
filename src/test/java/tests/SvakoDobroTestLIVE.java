package tests;

import helpers.SvakoDobroHelperLIVE;
import org.junit.Test;

public class SvakoDobroTestLIVE extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        SvakoDobroHelperLIVE.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        SvakoDobroHelperLIVE.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void PouzeceTest() throws InterruptedException{
        SvakoDobroHelperLIVE.PouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void Karticatest() throws InterruptedException{
        SvakoDobroHelperLIVE.KarticaH();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        SvakoDobroHelperLIVE.SearchH();
    }

    @Test
    public void KontaktTest() throws InterruptedException{
        SvakoDobroHelperLIVE.KontaktH();
        Thread.sleep(4000);
    }
}
