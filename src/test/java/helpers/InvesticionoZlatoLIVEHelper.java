package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvesticionoZlatoLIVEHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException {
        String url = "https://investiciono-zlato.rs/";
        driver.navigate().to(url);
        driver.get("https://investiciono-zlato.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[2]/ul/li[3]/a"));
        Nalog.click();
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://investiciono-zlato.rs/";
        driver.navigate().to(url);
        driver.get("https://investiciono-zlato.rs/");
        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[2]/ul/li[2]/a"));
        Prijava.click();
        WebElement Ime = driver.findElement(By.name("login[username]"));
        Ime.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();

    }

    public static void IsporukaiRacun() throws InterruptedException{
        String url = "https://investiciono-zlato.rs/";
        driver.navigate().to(url);
        driver.get("https://investiciono-zlato.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement InvesticionoZlato = driver.findElement(By.id("ui-id-2"));
        InvesticionoZlato.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_69")));
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        WebElement Prodajna = driver.findElement(By.id("option-label-type_of_product-170-item-60"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Prodajna));
        Prodajna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        js.executeScript("arguments[0].click();", Dodaj);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("01011997710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Test 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0684565985");

        WebElement ISPORUKA = driver.findElement(By.id("s_method_flatrate_flatrate"));
        ISPORUKA.click();

        WebElement RACUN = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", RACUN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("0101997710178");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0654585855");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(6000);
        WebElement Saglasan1 = driver.findElement(By.id("agreement_checkmo_2"));
        Saglasan1.click();
        WebElement Saglasan2 = driver.findElement(By.id("agreement_checkmo_3"));
        Saglasan2.click();

        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        KUPI.click();
    }

    public static void IsporukaiPouzece() throws InterruptedException{
        String url = "https://investiciono-zlato.rs/";
        driver.navigate().to(url);
        driver.get("https://investiciono-zlato.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement InvesticionoZlato = driver.findElement(By.id("ui-id-2"));
        InvesticionoZlato.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_69")));
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        WebElement Prodajna = driver.findElement(By.id("option-label-type_of_product-170-item-60"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Prodajna));
        Prodajna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("01011997710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Test 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0684565985");

        WebElement ISPORUKA = driver.findElement(By.id("s_method_flatrate_flatrate"));
        ISPORUKA.click();

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("01011997710178");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11050");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065789952");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(6000);
        WebElement Saglasan1 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div[1]/input"));
        Saglasan1.click();
        WebElement Saglasan2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div[2]/input"));
        Saglasan2.click();

        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        KUPI.click();
    }

    public static void PreuzimanjeiRacunh() throws InterruptedException{
        String url = "https://investiciono-zlato.rs/";
        driver.navigate().to(url);
        driver.get("https://investiciono-zlato.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement InvesticionoZlato = driver.findElement(By.id("ui-id-2"));
        InvesticionoZlato.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_69")));
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        WebElement Prodajna = driver.findElement(By.id("option-label-type_of_product-170-item-60"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Prodajna));
        Prodajna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("01011997710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Test 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0684565985");

        WebElement PREUZIMANJE = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        PREUZIMANJE.click();

        WebElement RACUN = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", RACUN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("0101997710178");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0654585855");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(6000);
        WebElement Saglasan1 = driver.findElement(By.id("agreement_checkmo_2"));
        Saglasan1.click();
        WebElement Saglasan2 = driver.findElement(By.id("agreement_checkmo_3"));
        Saglasan2.click();

        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        KUPI.click();
    }

    public static void PreuzimanjeiPouzeceH() throws InterruptedException{
        String url = "https://investiciono-zlato.rs/";
        driver.navigate().to(url);
        driver.get("https://investiciono-zlato.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement InvesticionoZlato = driver.findElement(By.id("ui-id-2"));
        InvesticionoZlato.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_69")));
        WebElement ZlatnaPoluga = driver.findElement(By.id("product-item-info_69"));
        ZlatnaPoluga.click();
        WebElement Prodajna = driver.findElement(By.id("option-label-type_of_product-170-item-60"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Prodajna));
        Prodajna.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement JMBG = driver.findElement(By.name("custom_attributes[custom_field_1]"));
        JMBG.sendKeys("01011997710178");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Test 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0684565985");

        WebElement PREUZIMANJE = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        PREUZIMANJE.click();

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement JMBG2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        JMBG2.sendKeys("01011997710178");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11050");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065789952");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(6000);
        WebElement Saglasan1 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div[1]/input"));
        Saglasan1.click();
        WebElement Saglasan2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div/div/div[2]/input"));
        Saglasan2.click();

        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        KUPI.click();
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://investiciono-zlato.rs/";
        driver.navigate().to(url);
        driver.get("https://investiciono-zlato.rs/");
        WebElement Kon = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/ul/li[3]/a"));
        Kon.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola");
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Komentar = driver.findElement(By.name("comment"));
        Komentar.sendKeys("Test");
        WebElement Salji = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[2]/form/div/div/button"));
        Salji.click();

    }
}
