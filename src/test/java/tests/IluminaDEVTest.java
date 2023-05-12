package tests;

import helpers.IluminaDEVHelper;
import org.junit.Test;

public class IluminaDEVTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        IluminaDEVHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        IluminaDEVHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIPouzeceTest() throws InterruptedException{
        IluminaDEVHelper.KurirskaIPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIPlatnaTest() throws InterruptedException{
        IluminaDEVHelper.KurirskaIPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaILicno() throws InterruptedException{
        IluminaDEVHelper.KurirskaILicnoH();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIRacun() throws InterruptedException{
        IluminaDEVHelper.KurirskaIPrekoRacuna();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiPouzeceTest() throws InterruptedException{
        IluminaDEVHelper.LicnoIPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIPlatnaTest() throws InterruptedException{
        IluminaDEVHelper.LicnoIPlatnaH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoILicnoPTest() throws InterruptedException{
        IluminaDEVHelper.LicnoILicnoPH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIuplataPrekoRacunaTest() throws InterruptedException{
        IluminaDEVHelper.LicnoiUplataH();
        Thread.sleep(4000);
    }

    @Test
    public void Searchtest() throws InterruptedException{
        IluminaDEVHelper.SearchH();
    }
}
