package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZlatniStandardDEVHelper extends BaseHelper {

    public static void RegH() throws InterruptedException{
        String url = "https://zlatnistandard.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://zlatnistandard.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Registracija']")));
        WebElement Registracija = driver.findElement(By.xpath("//*[text()='Registracija']"));
        Registracija.click();
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/form/div/div[1]/button")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/form/div/div[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Reg));
        Reg.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://zlatnistandard.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://zlatnistandard.dev.smartweb.rs/#");

        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[2]/ul/li[2]/a"));
        Prijava.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        Aj.click();
    }

    public static void PostExpressIPrekoRacuna() throws InterruptedException{
        String url = "https://zlatnistandard.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://zlatnistandard.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement Zlato = driver.findElement(By.id("ui-id-2"));
        Zlato.click();
        js.executeScript("window.scrollBy(0,500)");
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-type_of_product-170-item-61")));
        WebElement Avansna = driver.findElement(By.id("option-label-type_of_product-170-item-61"));
        Avansna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='korpu']")));
        WebElement korpica = driver.findElement(By.xpath("//*[text()='korpu']"));
        korpica.click();
        Thread.sleep(6000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("0101199710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jovovo 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("064785696");
        Thread.sleep(2000);

        WebElement POST_EXPRESS = driver.findElement(By.id("s_method_flatrate_flatrate"));
        POST_EXPRESS.click();

        WebElement PREKORACUNA = driver.findElement(By.id("checkmo"));
        PREKORACUNA.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("01014805045");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("sadasdad 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("10900");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("066584555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);
        WebElement Saglasnost1 = driver.findElement(By.id("agreement_checkmo_2"));
        Saglasnost1.click();
        WebElement Saglasnost2 = driver.findElement(By.id("agreement_checkmo_3"));
        Saglasnost2.click();
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        KUPI.click();
    }

    public static void PostExpressIPouzeceH() throws InterruptedException{
        String url = "https://zlatnistandard.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://zlatnistandard.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement Zlato = driver.findElement(By.id("ui-id-2"));
        Zlato.click();
        js.executeScript("window.scrollBy(0,500)");
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-type_of_product-170-item-61")));
        WebElement Avansna = driver.findElement(By.id("option-label-type_of_product-170-item-61"));
        Avansna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='korpu']")));
        WebElement korpica = driver.findElement(By.xpath("//*[text()='korpu']"));
        korpica.click();
        Thread.sleep(6000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("0101199710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jovovo 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("064785696");
        Thread.sleep(2000);

        WebElement POST_EXPRESS = driver.findElement(By.id("s_method_flatrate_flatrate"));
        POST_EXPRESS.click();

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-cashondelivery")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("01254552142");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("dsadadas 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("10190");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("0654852566");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);
        WebElement Saglasnost1 = driver.findElement(By.id("agreement_cashondelivery_2"));
        Saglasnost1.click();
        WebElement Saglasnost2 = driver.findElement(By.id("agreement_cashondelivery_3"));
        Saglasnost2.click();
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        KUPI.click();
    }

    public static void ZlatniStandardiRacunH() throws InterruptedException{
        String url = "https://zlatnistandard.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://zlatnistandard.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement Zlato = driver.findElement(By.id("ui-id-2"));
        Zlato.click();
        js.executeScript("window.scrollBy(0,500)");
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-type_of_product-170-item-61")));
        WebElement Avansna = driver.findElement(By.id("option-label-type_of_product-170-item-61"));
        Avansna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='korpu']")));
        WebElement korpica = driver.findElement(By.xpath("//*[text()='korpu']"));
        korpica.click();
        Thread.sleep(6000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("0101199710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jovovo 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("064785696");
        Thread.sleep(2000);

        WebElement ZLATNI_STANDARD = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        ZLATNI_STANDARD.click();

        WebElement PREKORACUNA = driver.findElement(By.id("checkmo"));
        PREKORACUNA.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("01014805045");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("sadasdad 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("10900");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("066584555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);
        WebElement Saglasnost1 = driver.findElement(By.id("agreement_checkmo_2"));
        Saglasnost1.click();
        WebElement Saglasnost2 = driver.findElement(By.id("agreement_checkmo_3"));
        Saglasnost2.click();
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        KUPI.click();
    }

    public static void ZlatniStandardiPouzeceH() throws InterruptedException{
        String url = "https://zlatnistandard.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://zlatnistandard.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement Zlato = driver.findElement(By.id("ui-id-2"));
        Zlato.click();
        js.executeScript("window.scrollBy(0,500)");
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-type_of_product-170-item-61")));
        WebElement Avansna = driver.findElement(By.id("option-label-type_of_product-170-item-61"));
        Avansna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='korpu']")));
        WebElement korpica = driver.findElement(By.xpath("//*[text()='korpu']"));
        korpica.click();
        Thread.sleep(6000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("0101199710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jovovo 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("064785696");
        Thread.sleep(2000);

        WebElement ZLATNI_STANDARD = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        ZLATNI_STANDARD.click();

        WebElement PREKORACUNA = driver.findElement(By.id("checkmo"));
        PREKORACUNA.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("01014805045");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("sadasdad 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("10900");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("066584555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);
        WebElement Saglasnost1 = driver.findElement(By.id("agreement_checkmo_2"));
        Saglasnost1.click();
        WebElement Saglasnost2 = driver.findElement(By.id("agreement_checkmo_3"));
        Saglasnost2.click();
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        KUPI.click();
    }
}
