package tests;

import helpers.BarKodHelperLIVE;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BarKodTestLIVE extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        BarKodHelperLIVE.RegH();
        Thread.sleep(3000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        BarKodHelperLIVE.LoginH();
        Thread.sleep(3000);
    }
    @Test
    public void IsporukaiPouzeceH() throws InterruptedException{
        BarKodHelperLIVE.IsporukaiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void IsporukaiKartica() throws InterruptedException{
        BarKodHelperLIVE.IsporukaiKarticaH();
        Thread.sleep(5000);
    }

    @Test
    public void LicnoiPouzece() throws InterruptedException{
        BarKodHelperLIVE.LicnoiPouzeceH();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoiKarticaTest() throws InterruptedException{
       BarKodHelperLIVE.LicnoiKarticaH();
       Thread.sleep(4000);
    }

    @Test
    public void SearchTest() throws InterruptedException{
        BarKodHelperLIVE.SearchH();
        Thread.sleep(4000);
    }
}
