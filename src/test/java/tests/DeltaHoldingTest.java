package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeltaHoldingTest extends BaseTest {

    @Test
    public void DeltaHoldingPouzecem() throws InterruptedException {
        String url = "https://deltaterm.dev.smartweb.rs/";
        driver.get(url);
        WebElement Kanalizacija = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/nav/ul[1]/li[1]/a/span"));
        Kanalizacija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_21124")));
        WebElement SlivnikCrni = driver.findElement(By.id("product-item-info_21124"));
        SlivnikCrni.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/div[1]/div")));
        WebElement Velicina = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/div[1]/div"));
        Velicina.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("custom-label-web_f_serija-171-item-2098")));
        WebElement PrvaOpcija = driver.findElement(By.id("custom-label-web_f_serija-171-item-2098"));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.id("custom-label-web_f_serija-171-item-2098")));
        PrvaOpcija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        DodajUKorpu.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("counter-number")));

        WebElement minikorpa = driver.findElement(By.className("counter-number"));
        minikorpa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement CheckOut = driver.findElement(By.id("top-cart-btn-checkout"));
        CheckOut.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement emailpolje = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(emailpolje));
        emailpolje.sendKeys("nikola.cebic9@gmail.com");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sretena Mladenovica Mike 5");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("country_id")));
        WebElement Drzava = driver.findElement(By.name("country_id"));
        Drzava.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("city")));
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("postcode")));
        WebElement PostanskiBroj = driver.findElement(By.name("postcode"));
        PostanskiBroj.sendKeys("11090");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("telephone")));
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("062227366");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkmo")));
        WebElement PlatiPouzecem = driver.findElement(By.id("checkmo"));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.id("checkmo")));
        js.executeScript("arguments[0].click();", PlatiPouzecem);
        Thread.sleep(6000);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MojaAdrzanaplatuidostavujeista = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MojaAdrzanaplatuidostavujeista));
        MojaAdrzanaplatuidostavujeista.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input")));
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input")));
        WebElement NovaAdresa = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        NovaAdresa.sendKeys("Vidikovacki venac 12");

        WebElement Dgra = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Dgra.sendKeys("Beograd");
        js.executeScript("arguments[0].scrollIntoView();", Dgra);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input")));
        WebElement Postanska2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanska2.sendKeys("11090");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input")));
        WebElement NovBrojFona = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        NovBrojFona.sendKeys("062227366");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]")));
        WebElement NovoAzuriranje = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(NovoAzuriranje));
        js.executeScript("arguments[0].click();", NovoAzuriranje);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button")));
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();

        Thread.sleep(5000);
    }


    @Test
    public void DeltaHoldingFaktura() throws InterruptedException {
        String url = "https://deltaterm.dev.smartweb.rs/";
        driver.get(url);
        WebElement Kanalizacija = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/nav/ul[1]/li[1]/a/span"));
        Kanalizacija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_21124")));
        WebElement SlivnikCrni = driver.findElement(By.id("product-item-info_21124"));
        SlivnikCrni.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/div[1]/div")));
        WebElement Velicina = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/div[1]/div"));
        Velicina.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("custom-label-web_f_serija-171-item-2098")));
        WebElement PrvaOpcija = driver.findElement(By.id("custom-label-web_f_serija-171-item-2098"));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.id("custom-label-web_f_serija-171-item-2098")));
        PrvaOpcija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        DodajUKorpu.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("counter-number")));

        WebElement minikorpa = driver.findElement(By.className("counter-number"));
        minikorpa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement CheckOut = driver.findElement(By.id("top-cart-btn-checkout"));
        CheckOut.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement emailpolje = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(emailpolje));
        emailpolje.sendKeys("nikola.cebic9@gmail.com");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sretena Mladenovica Mike 5");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("country_id")));
        WebElement Drzava = driver.findElement(By.name("country_id"));
        Drzava.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("city")));
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("postcode")));
        WebElement PostanskiBroj = driver.findElement(By.name("postcode"));
        PostanskiBroj.sendKeys("11090");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("telephone")));
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("062227366");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("banktransfer")));
        WebElement PlatiFakturom = driver.findElement(By.id("banktransfer"));
        wdWait.until(ExpectedConditions.elementToBeClickable(By.id("banktransfer")));
        js.executeScript("arguments[0].click();", PlatiFakturom);
        Thread.sleep(6000);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-banktransfer")));
        WebElement MojaAdrzanaplatuidostavujeista2 = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MojaAdrzanaplatuidostavujeista2));
        MojaAdrzanaplatuidostavujeista2.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("input-text")));
        WebElement Ime2 = driver.findElement(By.className("input-text"));

        Ime2.sendKeys("Nidza");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input")));
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Prezime2));
        Prezime2.sendKeys("Cebic");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input")));
        WebElement NovaAdresa = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        NovaAdresa.sendKeys("Vidikovacki venac 12");

        WebElement Dgra = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Dgra.sendKeys("Beograd");
        js.executeScript("arguments[0].scrollIntoView();", Dgra);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input")));
        WebElement Postanska2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanska2.sendKeys("11090");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input")));
        WebElement NovBrojFona = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        NovBrojFona.sendKeys("062227366");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]")));
        WebElement NovoAzuriranje = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(NovoAzuriranje));
        js.executeScript("arguments[0].click();", NovoAzuriranje);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button")));
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();

        Thread.sleep(5000);
    }

    @Test
    public void SearchTest() throws InterruptedException {
        String url = "https://deltaterm.dev.smartweb.rs/";
        driver.get(url);
        WebElement Search = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Search));
        Search.sendKeys("WC Solja");
        Search.sendKeys(Keys.END);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("amsearch-product-list")));
        WebElement Rezultati = driver.findElement(By.className("amsearch-product-list"));
        System.out.println(Rezultati.getText());
        Assert.assertTrue("Pretraga ne radi", Rezultati.getText().contains("WC"));


        Thread.sleep(6000);
    }

    @Test
    public void RegistracijaTest() throws InterruptedException {
        String url = "https://deltaterm.dev.smartweb.rs/";
        driver.get(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div[2]/div[1]/ul/li[2]/a")));
        WebElement ProfilDugme = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/div[1]/ul/li[2]/a"));
        ProfilDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a")));
        WebElement RegistracijaButton = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a"));
        RegistracijaButton.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
        WebElement Ime = driver.findElement(By.id("firstname"));
        Ime.sendKeys("Nikolaj");
        WebElement Prezime = driver.findElement(By.id("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Email = driver.findElement(By.id("email_address"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.id("password"));
        Pass.sendKeys("Ceba123!");
        WebElement PassConfirm = driver.findElement(By.id("password-confirmation"));
        PassConfirm.sendKeys("Ceba123!");
        WebElement RegistrirajSe = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div[1]/button"));
        RegistrirajSe.click();

        Thread.sleep(4000);
    }
}