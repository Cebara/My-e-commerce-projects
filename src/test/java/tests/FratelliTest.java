package tests;

import helpers.FratelliHelper;
import org.junit.Test;

public class FratelliTest extends BaseTest {

    @Test
    public void RegTest() throws InterruptedException {
        FratelliHelper.DefReg();
        Thread.sleep(3000);
    }

    @Test
    public void LoginTest() throws InterruptedException{
        FratelliHelper.Login();
        Thread.sleep(5000);
    }

    @Test
    public void PreuzimanjeTest() throws InterruptedException{
        FratelliHelper.PreuzimanjeHelper();
        Thread.sleep(4000);
    }
    @Test
    public void PlatnaTest() throws InterruptedException{
        FratelliHelper.PlatnaKartica();
        Thread.sleep(4000);
    }
}
