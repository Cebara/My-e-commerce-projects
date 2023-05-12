package tests;

import helpers.KeraMetalHelperLIVE;
import org.junit.Test;

public class KeraMetalTestLIVE extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        KeraMetalHelperLIVE.RegH();
        Thread.sleep(4000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        KeraMetalHelperLIVE.LoignH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaIPreuzeceTest() throws InterruptedException{
        KeraMetalHelperLIVE.IsporukaiPouzeceH();
        Thread.sleep(4000);
    }
}
