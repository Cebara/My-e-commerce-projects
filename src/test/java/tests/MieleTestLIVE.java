package tests;

import helpers.MieleDevHelper;
import helpers.MieleHelperLIVE;
import org.junit.Test;

public class MieleTestLIVE extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException{
        MieleHelperLIVE.RegHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        MieleHelperLIVE.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiGotovinaTest() throws InterruptedException{
        MieleHelperLIVE.KurirskaiGotovina();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaiPreracunTest() throws InterruptedException{
        MieleHelperLIVE.KurirskaIPreracun();
        Thread.sleep(4000);
    }

    @Test
    public void KurirskaIKupovinaNaRate() throws InterruptedException{
        MieleHelperLIVE.KurirskaIKupovinanarate();
        Thread.sleep(4000);
    }

    @Test
    public void LicnaIGotovinaTest() throws InterruptedException{
        MieleHelperLIVE.LicnaIGotovina();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIPredracunTest() throws InterruptedException{
        MieleHelperLIVE.LicnoIPreracun();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoIKupovinaNaRate() throws InterruptedException{
        MieleHelperLIVE.LicnoIKupovinaNaRate();
        Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        MieleHelperLIVE.SearchH();
        Thread.sleep(4000);
    }
}
