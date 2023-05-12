package helpers;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CoinCasaDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        WebElement Registracija = driver.findElement(By.xpath("/html/body/div[4]/header/div/div/div[1]/div/ul/li[4]/a"));
        Registracija.click();
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Lozinka = driver.findElement(By.name("password"));
        Lozinka.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/form/div/div[1]/button/span"));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        WebElement PrijaviSe = driver.findElement(By.xpath("/html/body/div[4]/header/div/div/div[1]/div/ul/li[3]/a"));
        PrijaviSe.click();
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LicnoIPouzeceH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]")));
        WebElement Kujna = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]"));
        Kujna.click();
        Thread.sleep(3000);
        WebElement CaseFilter = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/ul/li[15]/input"));
        CaseFilter.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/div[2]/div[1]/ul/li/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nkola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Blabla 23");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0645865656");
        Thread.sleep(3000);

        WebElement LICNOPREUZIMANJE = driver.findElement(By.id("s_method_flatrate_flatrate"));
        LICNOPREUZIMANJE.click();

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-cashondelivery")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 3");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("0647885565");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(5000);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        Kupi.click();

    }

    public static void LicnoIRacunH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]")));
        WebElement Kujna = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]"));
        Kujna.click();
        Thread.sleep(3000);
        WebElement CaseFilter = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/ul/li[15]/input"));
        CaseFilter.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/div[2]/div[1]/ul/li/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nkola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Blabla 23");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0645865656");
        Thread.sleep(3000);

        WebElement LICNOPREUZIMANJE = driver.findElement(By.id("s_method_flatrate_flatrate"));
        LICNOPREUZIMANJE.click();

        WebElement PREKORACUNA = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();" , PREKORACUNA);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-banktransfer")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(4000);

        //wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("0655823365");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        Kupi.click();
    }

    public static void LicnoIPlatnaH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]")));
        WebElement Kujna = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]"));
        Kujna.click();
        Thread.sleep(3000);
        WebElement CaseFilter = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/ul/li[15]/input"));
        CaseFilter.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/div[2]/div[1]/ul/li/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nkola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Blabla 23");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0645865656");
        Thread.sleep(3000);

        WebElement LICNOPREUZIMANJE = driver.findElement(By.id("s_method_flatrate_flatrate"));
        LICNOPREUZIMANJE.click();

        WebElement PLATNA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();" , PLATNA);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-sample_gateway")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(4000);

        WebElement Ime2 = driver.findElement(By.id("QIPMSU3"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065898565");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        Kupi.click();
    }

    public static void DostavaiPouzeceH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]")));
        WebElement Kujna = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]"));
        Kujna.click();
        Thread.sleep(3000);
        WebElement CaseFilter = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/ul/li[15]/input"));
        CaseFilter.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/div[2]/div[1]/ul/li/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nkola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Blabla 23");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0645865656");
        Thread.sleep(3000);

        WebElement DOSTAVA = driver.findElement(By.id("s_method_tablerate_bestway"));
        DOSTAVA.click();

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-cashondelivery")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 3");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("0647885565");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(5000);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        Kupi.click();
    }

    public static void DostavaiRacunH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]")));
        WebElement Kujna = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]"));
        Kujna.click();
        Thread.sleep(3000);
        WebElement CaseFilter = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/ul/li[15]/input"));
        CaseFilter.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/div[2]/div[1]/ul/li/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nkola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Blabla 23");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0645865656");
        Thread.sleep(3000);

        WebElement DOSTAVA = driver.findElement(By.id("s_method_tablerate_bestway"));
        DOSTAVA.click();

        WebElement PREKORACUNA = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();" , PREKORACUNA);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-banktransfer")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(4000);

        //wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("0655823365");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        Kupi.click();
    }

    public static void DostavaiPlatnaH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]")));
        WebElement Kujna = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/nav/ul/li[2]/a/span[2]"));
        Kujna.click();
        Thread.sleep(3000);
        WebElement CaseFilter = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/ul/li[15]/input"));
        CaseFilter.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div[1]/div[3]/div[3]/ol/li[2]/div/div[2]/div[2]/div/div[1]/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/div[2]/div[1]/ul/li/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nkola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Blabla 23");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0645865656");
        Thread.sleep(3000);

        WebElement DOSTAVA = driver.findElement(By.id("s_method_tablerate_bestway"));
        DOSTAVA.click();

        WebElement PLATNA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();" , PLATNA);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-sample_gateway")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(4000);

        WebElement Ime2 = driver.findElement(By.id("QIPMSU3"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065898565");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        Kupi.click();
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://coincasa.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://coincasa.dev.smartweb.rs/");
        WebElement Pretraga = driver.findElement(By.name("q"));
        Pretraga.sendKeys("Casa");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[3]/div[1]/div[3]/div/div[2]")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div[1]/div[3]/div/div[2]"));
        System.out.println(R.getText());
    }
}
