package tests;

import helpers.PiccoloHelper;
import org.junit.Test;

public class Piccolotest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        PiccoloHelper.Registracija();
        Thread.sleep(4000);
    }

    @Test
    public void Logintest() throws InterruptedException{
        PiccoloHelper.Login();
        Thread.sleep(4000);
    }

    @Test
    public void Narucivanjetest() throws InterruptedException{
        PiccoloHelper.Narucivanje();
    }

    @Test
    public void SearchTest() throws InterruptedException{
        PiccoloHelper.Search();
        Thread.sleep(4000);
    }
}
