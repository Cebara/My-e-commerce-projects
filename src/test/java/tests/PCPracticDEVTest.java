package tests;

import helpers.PCPracticDEVHelper;
import helpers.PCPracticLIVEHelper;
import org.junit.Test;

public class PCPracticDEVTest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        PCPracticDEVHelper.Reghelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        PCPracticDEVHelper.LoginH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiPouzeceTest() throws InterruptedException{
        PCPracticDEVHelper.LicnoiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiPlatnaKTest() throws InterruptedException{
        PCPracticDEVHelper.LicnoiPlatnaKH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiPredracunTest() throws InterruptedException{
        PCPracticDEVHelper.LicnoiPredracunH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoKMICekovi1Test() throws InterruptedException{
        PCPracticLIVEHelper.LicnoICEKOVI1();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoKMICekovi2Test() throws InterruptedException{
        PCPracticLIVEHelper.LicnoICekovi2();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoKMIRaiffeisenTest() throws InterruptedException{
        PCPracticLIVEHelper.LicnoIRaiffeisen();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoAiPouzeceTest() throws InterruptedException{
        PCPracticLIVEHelper.LicnoARANDJELOVACIPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoAiPlatnaK() throws InterruptedException{
        PCPracticLIVEHelper.LicnoAiPlatnaKH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoAiPredracunTest() throws InterruptedException{
        PCPracticLIVEHelper.LicnoAiPredracunH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoAiCEKOVI1() throws InterruptedException{
        PCPracticLIVEHelper.LicnoAiCEKOVI1H();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoAiCEKOVI2() throws InterruptedException{
        PCPracticLIVEHelper.LicnoAiCEKOVI2();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoAiRaiffeisen() throws InterruptedException{
        PCPracticLIVEHelper.LicnoAiRaifesseinH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiPouzeceTest() throws InterruptedException{
        PCPracticLIVEHelper.IsporukaiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiPlatnaTest() throws InterruptedException{
        PCPracticLIVEHelper.IsporukaiPlatnaKH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiPredracunTest() throws InterruptedException{
        PCPracticLIVEHelper.IsporukaiPredracunH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiCEKOVI1Test() throws InterruptedException{
        PCPracticLIVEHelper.IsporukaiCekovi1H();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiCEKOVI2Test() throws InterruptedException{
        PCPracticLIVEHelper.IsporukaiCekovi2H();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaIRaiffeseinTest() throws InterruptedException{
        PCPracticLIVEHelper.IsporukaiRaifessein();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        PCPracticLIVEHelper.SearchH();
    }
}
