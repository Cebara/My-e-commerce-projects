package tests;

import helpers.JasminHelperDEV;
import org.junit.Test;

public class JasminDEVTEst extends BaseTest {

    @Test
    public void licnoiGotovinaTest() throws InterruptedException{
        JasminHelperDEV.LicnoiGotovinaH();
        Thread.sleep(4000);
    }
}
