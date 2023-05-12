package tests;

import helpers.FratelliHelperLIVE;
import org.junit.Test;

public class FratelliTestLIVE extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        FratelliHelperLIVE.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        FratelliHelperLIVE.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void PreuzimanjeTest() throws InterruptedException{
        FratelliHelperLIVE.Preuzimanje();
        Thread.sleep(4000);
    }

    @Test
    public void PlatnaKarticaTest() throws InterruptedException{
        FratelliHelperLIVE.PlatnaH();
        Thread.sleep(4000);
    }
}
