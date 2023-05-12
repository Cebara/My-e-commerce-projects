package tests;

import helpers.MieleDevHelper;
import org.junit.Test;

public class MieleTestDEV extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        MieleDevHelper.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        MieleDevHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiGotovinaTest() throws InterruptedException{
        MieleDevHelper.KurirskaiGotovina();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiPreracunTest() throws InterruptedException{
        MieleDevHelper.KurirskaIPreracun();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIKupovinaNaRate() throws InterruptedException{
        MieleDevHelper.KurirskaIKupovinanarate();
        Thread.sleep(4000);
    }

    @Test
    public void LicnaIGotovinaTest() throws InterruptedException{
        MieleDevHelper.LicnaIGotovina();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIPredracunTest() throws InterruptedException{
        MieleDevHelper.LicnoIPreracun();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIKupovinaNaRate() throws InterruptedException{
        MieleDevHelper.LicnoIKupovinaNaRate();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        MieleDevHelper.SearchH();
        Thread.sleep(4000);
    }
}
