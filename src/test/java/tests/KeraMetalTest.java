package tests;

import helpers.KeraMetalHelper;
import org.junit.Test;

public class KeraMetalTest extends BaseTest {
    @Test
    public void RegTest() throws InterruptedException {
        KeraMetalHelper.DefRegistracija();
        Thread.sleep(3000);
    }

    @Test
    public void Logintest() throws InterruptedException {
        KeraMetalHelper.Login();
    }
    @Test
    public void UProdavniciIPouzeceTest() throws InterruptedException{
        KeraMetalHelper.UProdavniciIPouzece();
    }

    @Test
    public void ProdzaIracuntest() throws InterruptedException{
        KeraMetalHelper.UProdziIPrekoRacuna();
    }
    @Test
    public void ProdzaIKarticaTest() throws InterruptedException{
        KeraMetalHelper.ProdzaIkartica();
    }
    @Test
    public void KurirskaIPouzeceTest() throws InterruptedException{
        KeraMetalHelper.KurirIPouzece();
    }
    @Test
    public void KurirskaIRacun() throws InterruptedException{
        KeraMetalHelper.KurirIRacun();
    }
}
