package tests;

import helpers.CentrumHelper;
import org.junit.Test;

public class CentrumTest extends BaseTest {

    @Test
    public void Regtest() throws InterruptedException{
        CentrumHelper.RegHelper();
        Thread.sleep(4000);
    }
    //Kaze Gidra ovo da preskocim za sad

}
