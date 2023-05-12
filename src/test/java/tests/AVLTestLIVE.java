package tests;

import helpers.AvlDEVHelper;
import org.junit.Test;

public class AVLTestLIVE extends BaseTest {

    @Test
    public void RegTEst() throws InterruptedException{
        AvlDEVHelper.RegistracijaHelper();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        AvlDEVHelper.LoginHelper();
        Thread.sleep(4000);
    }

    @Test
    public void EbankingTest() throws InterruptedException{
        AvlDEVHelper.EbankingHelper();
        Thread.sleep(4000);
    }

    @Test
    public void UplatnicaTest() throws InterruptedException{
        AvlDEVHelper.UplatnicaH();
        Thread.sleep(4000);
    }

    @Test
    public void VirmanTest() throws InterruptedException{
        AvlDEVHelper.VirmanHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Pouzece() throws InterruptedException{
        AvlDEVHelper.PouzeceHelper();
        Thread.sleep(4000);
    }

    @Test
    public void PlatnaTest() throws InterruptedException{
        AvlDEVHelper.PlatnaHelper();
        Thread.sleep(4000);
    }

    @Test
    public void Searchtest() throws InterruptedException{
        AvlDEVHelper.SearchH();
        Thread.sleep(4000);
    }
}
