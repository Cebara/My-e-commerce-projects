package tests;

import helpers.RomaHelper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RomaTest  extends BaseTest {
    @Test
    public void RomaRegistracijaTest() throws InterruptedException {
        RomaHelper.DefRegistracija();
        Thread.sleep(3000);
    }

    @Test
    public void RomaPrijavaTest() throws InterruptedException {
        RomaHelper.DefLogin();
        Thread.sleep(3000);
    }

    @Test
    public void KorpicaPlacanjeKarticomTest() throws InterruptedException {
        RomaHelper.KorpaKartica();
        Thread.sleep(3000);
    }

    @Test
    public void KorpicaPlacanjePouzecemTest() throws InterruptedException {
        RomaHelper.KorpaPouzece();
        Thread.sleep(3000);
    }

    @Test
    public void SearchTest() throws InterruptedException {
        RomaHelper.SearchBar();

        Thread.sleep(3000);
    }
}