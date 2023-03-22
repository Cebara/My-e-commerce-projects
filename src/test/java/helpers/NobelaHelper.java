package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NobelaHelper extends BaseHelper {

    private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke) throws InterruptedException {
        String url = "https://nobelapoteke.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://nobelapoteke.dev.smartweb.rs/");
        WebElement RegistracijaDugme = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/ul/li[1]"));
        RegistracijaDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement RegiDugme = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        RegiDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
        WebElement ImePolje = driver.findElement(By.id("firstname"));
        ImePolje.sendKeys(Ime);
        WebElement PrezimePolje = driver.findElement(By.id("lastname"));
        PrezimePolje.sendKeys(Prezime);
        WebElement EmailPolje = driver.findElement(By.id("email_address"));
        EmailPolje.sendKeys(Email);
        WebElement PassPolje = driver.findElement(By.id("password"));
        PassPolje.sendKeys(Lozinka);
        WebElement PotvrdaPassa = driver.findElement(By.id("password-confirmation"));
        PotvrdaPassa.sendKeys(PotvrdaLozinke);
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div[1]/button/span"));
        Aj.click();
        Thread.sleep(4000);

    }

    public static void DefReg() throws InterruptedException {
        Registracija("Nikola", "Cebic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");
    }

    public static void Login() throws InterruptedException {
        String url = "https://nobelapoteke.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://nobelapoteke.dev.smartweb.rs/");
        WebElement RegistracijaDugme = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/ul/li[1]"));
        RegistracijaDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        Aj.click();
        Thread.sleep(3000);
    }

    public static void Shopping() throws InterruptedException {
        Login();
        driver.manage().deleteAllCookies();
        WebElement Zdravlje = driver.findElement(By.id("ui-id-11"));
        Zdravlje.click();
        WebElement Innventa = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img"));
        Innventa.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        js.executeScript("arguments[0].click();", Dodaj);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div/div/a")));
        WebElement KorpaPopUp = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div/div/a"));
        KorpaPopUp.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement MejlPolje1 = driver.findElement(By.id("customer-email"));
        MejlPolje1.sendKeys("jovan23@gmail.com");
        WebElement Ime1 = driver.findElement(By.name("firstname"));
        Ime1.sendKeys("Nikola");
        WebElement Prezime1 = driver.findElement(By.name("lastname"));
        Prezime1.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("blabla 2");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11080");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("062228765");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        WebElement Mojaadr = driver.findElement(By.name("billing-address-same-as-shipping"));
        Mojaadr.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Trte mrte 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Novi Sad");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanski2.sendKeys("55599");
        WebElement FOn2 = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        FOn2.sendKeys("065897165");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        js.executeScript("arguments[0].click();", Kupi);

        Thread.sleep(5000);
    }

    public static void Search() throws InterruptedException {
        String url = "https://nobelapoteke.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://nobelapoteke.dev.smartweb.rs/");
        WebElement Pretraga = driver.findElement(By.className("searchToggle"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Pretraga));
        js.executeScript("arguments[0].click();", Pretraga);
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        Kucanje.sendKeys("Tablete za kasalj");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[3]/div[1]")));
        WebElement Rezultati = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]"));
        System.out.println(Rezultati.getText());

        Thread.sleep(4000);
    }
}