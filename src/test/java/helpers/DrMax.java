package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DrMax extends BaseHelper {

    private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke) throws InterruptedException {
        String url = "https://drmax.dev.smartweb.rs/";
        driver.get("https://drmax.dev.smartweb.rs/");
        WebElement MojNalog = driver.findElement(By.xpath("/html/body/div[5]/header/div/div/div[1]/div[2]/div/ul/li[1]/a"));
        MojNalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a")));
        WebElement RegiDugme = driver.findElement(By.xpath("/html/body/div[5]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a"));
        RegiDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
        WebElement ImePolje = driver.findElement(By.id("firstname"));
        ImePolje.sendKeys(Ime);
        WebElement PrezimePolje = driver.findElement(By.id("lastname"));
        PrezimePolje.sendKeys(Prezime);
        WebElement EmailPolje = driver.findElement(By.id("email_address"));
        EmailPolje.sendKeys(Email);
        WebElement LozinkaPolje = driver.findElement(By.id("password"));
        LozinkaPolje.sendKeys(Lozinka);
        WebElement PotvrdaLozPolje = driver.findElement(By.id("password-confirmation"));
        PotvrdaLozPolje.sendKeys(PotvrdaLozinke);
        WebElement REGDugme = driver.findElement(By.xpath("/html/body/div[5]/main/div[3]/div/form/div/div[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(REGDugme));
        REGDugme.click();
        Thread.sleep(4000);

    }

    public static void DefRegistracija() throws InterruptedException {
        Registracija("Jovan", "Markovic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");
    }

    public static void DefLogin() throws InterruptedException {
        String url = "https://drmax.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://drmax.dev.smartweb.rs/");
        WebElement MojNalog = driver.findElement(By.xpath("/html/body/div[5]/header/div/div/div[1]/div[2]/div/ul/li[1]/a"));
        MojNalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement PassField = driver.findElement(By.id("pass"));
        PassField.sendKeys("Cebic123");
        WebElement PrijaviSeDugme = driver.findElement(By.id("send2"));
        PrijaviSeDugme.click();
    }

    public static void PlacanjeIPretraga() throws InterruptedException {

        String url = "https://drmax.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://drmax.dev.smartweb.rs/");
        WebElement SearchPolje = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(SearchPolje));
        SearchPolje.sendKeys("Kreme za lice");
        SearchPolje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[3]/div[1]/div[3]/div/div[2]/ol/li[2]/div/a/span/span/img")));
        WebElement BaronessKrema = driver.findElement(By.xpath("/html/body/div[5]/main/div[3]/div[1]/div[3]/div/div[2]/ol/li[2]/div/a/span/span/img"));
        BaronessKrema.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(DodajUKorpu));
        DodajUKorpu.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[1]/div[2]/div")));
        //iznad komanda je dodata da saceka da izadje poruka "Uspesno ste dodali to i to" da bi registrovalo korpu gore. U suprotnom bi odma islo na korpu koja nije ni zavrsila dodavanje i error bi izaso
        WebElement MiniKorpa = driver.findElement(By.className("counter-number"));
        js.executeScript("arguments[0].click();",MiniKorpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(NastaviKaPlacanju));
        NastaviKaPlacanju.click();
        Thread.sleep(7000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime1 = driver.findElement(By.name("firstname"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ime1));
        Ime1.sendKeys("Jovan");
        WebElement Prezime1 = driver.findElement(By.name("lastname"));
        Prezime1.sendKeys("Mihajlovic");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("062227362");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Sretena Mladenovica Mike 3");
        Thread.sleep(9000);
        //Threadovi su stavljeni jer se stranica ucitava kad god se upotpune odredjena polja
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]")));
        WebElement MojaAdresazanaplatuidostavujeista = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MojaAdresazanaplatuidostavujeista));
        MojaAdresazanaplatuidostavujeista.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Jovan");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Mihajlovic");
        WebElement Mobitel = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Mobitel.sendKeys("062227366");
        WebElement Gradic = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Gradic.sendKeys("Pozarevac");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[10]/div/input"));
        Postanski2.sendKeys("10480");
        WebElement NovaUlca = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        NovaUlca.sendKeys("Stevan Mokranjac 23");
        WebElement Azuriraj2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        Azuriraj2.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("custom-terms")));
        WebElement Prihvatam = driver.findElement(By.name("custom-terms"));
        Prihvatam.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button")));
        WebElement Naruci = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        Naruci.click();
        Thread.sleep(4000);

    }
}