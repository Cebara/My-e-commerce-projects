package tests;

import helpers.InvesticionoZlatoLIVEHelper;
import org.junit.Test;

public class InvesticionoZlatoLIVETest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        InvesticionoZlatoLIVEHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        InvesticionoZlatoLIVEHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiRacunTest() throws InterruptedException{
        InvesticionoZlatoLIVEHelper.IsporukaiRacun();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiPouzeceTest() throws InterruptedException{
        InvesticionoZlatoLIVEHelper.IsporukaiPouzece();
        Thread.sleep(4000);
    }

    @Test
    public void PreuzimanjeiRacun() throws InterruptedException{
        InvesticionoZlatoLIVEHelper.PreuzimanjeiRacunh();
        Thread.sleep(4000);
    }

    @Test
    public void PreuzimanjeiPouzeceTest() throws InterruptedException{
        InvesticionoZlatoLIVEHelper.PreuzimanjeiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void KontaktTest() throws InterruptedException{
        InvesticionoZlatoLIVEHelper.KontaktH();
        Thread.sleep(3000);
    }
}

