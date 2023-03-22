package tests;

import helpers.NobelaHelper;
import org.junit.Test;

public class NobelaTest extends BaseTest {

    @Test
    public void RegistracijaTest() throws InterruptedException {
        NobelaHelper.DefReg();

    }

    @Test
    public void LoginTest() throws InterruptedException {
        NobelaHelper.Login();
    }

    @Test
    public void Shoppingtest() throws InterruptedException {
        NobelaHelper.Shopping();
    }

    @Test
    public void SearchTest() throws InterruptedException {
        NobelaHelper.Search();
    }
}