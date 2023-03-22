package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RomaHelper  extends BaseHelper {

    private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke) throws InterruptedException {
        String url = "https://romarazvoj.dev.smartweb.rs/";
        driver.get(url);
        WebElement RegistracijaDugme = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[1]/div/ul/li[3]/a"));
        RegistracijaDugme.click();
        WebElement Imemoje = driver.findElement(By.id("firstname"));
        Imemoje.sendKeys(Ime);
        WebElement Prezimemoje = driver.findElement(By.id("lastname"));
        Prezimemoje.sendKeys(Prezime);
        WebElement Emailmoj = driver.findElement(By.id("email_address"));
        Emailmoj.sendKeys(Email);
        WebElement LozinkaMoja = driver.findElement(By.id("password"));
        LozinkaMoja.sendKeys(Lozinka);
        WebElement PotvrdiL = driver.findElement(By.id("password-confirmation"));
        PotvrdiL.sendKeys(PotvrdaLozinke);
        WebElement Registrujsedugme = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Registrujsedugme));
        Registrujsedugme.click();
        Thread.sleep(3000);

    }


    public static void DefRegistracija() throws InterruptedException {
        Registracija("Nikola", "Cebic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");
    }

    public static void DefLogin() throws InterruptedException {
        String url = "https://romarazvoj.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get(url);
        WebElement Prijavadugme = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[1]/div/ul/li[2]/a"));
        Prijavadugme.click();
        WebElement ImeLog = driver.findElement(By.name("login[username]"));
        ImeLog.sendKeys("nikola.cebic@smartweb.rs");
        WebElement LozinkaPrijava = driver.findElement(By.name("login[password]"));
        LozinkaPrijava.sendKeys("Cebic123");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("send")));
        WebElement PrijaviseDugmad = driver.findElement(By.name("send"));
        PrijaviseDugmad.click();

    }

    public static void KorpaKartica() throws InterruptedException {

        DefLogin();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[4]/div/div/div[2]/div/ol/li[1]/div/div/div[2]/div/div[1]/form/button")));
        WebElement RozaKanta = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[4]/div/div/div[2]/div/ol/li[1]/div/div/div[2]/div/div[1]/form/button"));
        RozaKanta.click();
        WebElement MiniKorpa = driver.findElement(By.className("counter-number"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MiniKorpa));
        js.executeScript("arguments[0].click();", MiniKorpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviDalje = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviDalje.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Cerak Vinogradi 3");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement BrojFona1 = driver.findElement(By.name("telephone"));
        BrojFona1.sendKeys("062227362");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("payment[method]")));
        WebElement PlacanjeKarticom = driver.findElement(By.name("payment[method]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(PlacanjeKarticom));
        PlacanjeKarticom.click();

        WebElement DrugiPodaciDugme = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/label/span"));
        DrugiPodaciDugme.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input")));
        WebElement NovaUlica = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        NovaUlica.sendKeys("Pedje Milosevica 3");

        WebElement Gradic = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Gradic.sendKeys("Beograd");

        WebElement PostanskiKod = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        PostanskiKod.sendKeys("11090");

        WebElement LazniBrojFona = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        LazniBrojFona.sendKeys("062227366");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]")));
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        Azuriraj.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[2]/div[4]")));
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[2]/div[4]"));
        Poruci.click();

        Thread.sleep(5000);
    }

    public static void KorpaPouzece() throws InterruptedException {

        DefLogin();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[4]/div/div/div[2]/div/ol/li[1]/div/div/div[2]/div/div[1]/form/button")));
        WebElement RozaKanta = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[4]/div/div/div[2]/div/ol/li[1]/div/div/div[2]/div/div[1]/form/button"));
        RozaKanta.click();
        WebElement MiniKorpa = driver.findElement(By.className("counter-number"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MiniKorpa));
        js.executeScript("arguments[0].click();", MiniKorpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviDalje = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviDalje.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Cerak Vinogradi 3");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement BrojFona1 = driver.findElement(By.name("telephone"));
        BrojFona1.sendKeys("062227362");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("cashondelivery")));
        WebElement PlacanjePouzecem = driver.findElement(By.id("cashondelivery"));
        wdWait.until(ExpectedConditions.elementToBeClickable(PlacanjePouzecem));
        PlacanjePouzecem.click();
        WebElement DrugiPodaciDugme = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        DrugiPodaciDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input")));
        WebElement NovaUlica = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        NovaUlica.sendKeys("Pedje Milosevica 3");
        WebElement Gradic = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Gradic.sendKeys("Beograd");

        WebElement PostanskiKod = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        PostanskiKod.sendKeys("11090");

        WebElement LazniBrojFona = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        LazniBrojFona.sendKeys("062227366");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span")));
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(5000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[2]/div[4]")));
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[2]/div[4]"));
        Poruci.click();

        Thread.sleep(5000);
    }

    public static void SearchBar() throws InterruptedException {
        DefLogin();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement SearchPolje = driver.findElement(By.name("q"));
        SearchPolje.sendKeys("Stiropor");
        SearchPolje.sendKeys(Keys.ENTER);

    }
}