package tests;

import helpers.PlanetBikeHelper;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class PlanetBiketest extends BaseTest{

    @Test
    public void RegTest() throws InterruptedException{
        PlanetBikeHelper.DefReg();
        Thread.sleep(4000);
    }
    @Test
    public void LoginTest() throws InterruptedException{
        PlanetBikeHelper.Login();
        Thread.sleep(4000);
    }

    @Test
    public void LicnoPreuzimanjeTest() throws InterruptedException{
        PlanetBikeHelper.LicnoPreuzimanje();
        Thread.sleep(4000);
    }
}
