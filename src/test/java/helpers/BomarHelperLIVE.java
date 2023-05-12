package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BomarHelperLIVE extends BaseHelper {

    public static void Reghelper() throws InterruptedException {
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[3]/header/div[3]/div[2]/ul/li[2]/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a")));
        WebElement Reg1 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a"));
        Reg1.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
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
        WebElement Reg2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Reg2));
        Reg2.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[3]/header/div[3]/div[2]/ul/li[2]/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void IsporukaiGotovinaH() throws InterruptedException{
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement Aksesoari = driver.findElement(By.id("ui-id-6"));
        Aksesoari.click();
        js.executeScript("window.scrollBy(0,600)");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_24809")));
        WebElement Dupont = driver.findElement(By.id("product-item-info_24809"));
        js.executeScript("arguments[0].click();", Dupont);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement fon = driver.findElement(By.name("telephone"));
        fon.sendKeys("06855665");

        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MOJAADR));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Hej hej 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11050");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065415554");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement Slazemse = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", Slazemse);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(6000);
    }

    public static void IsporukaIPlatnaH() throws InterruptedException{
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement Aksesoari = driver.findElement(By.id("ui-id-6"));
        Aksesoari.click();
        js.executeScript("window.scrollBy(0,500)");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_24809")));
        WebElement Dupont = driver.findElement(By.id("product-item-info_24809"));
        Dupont.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement fon = driver.findElement(By.name("telephone"));
        fon.sendKeys("06855665");

        WebElement PLATNA = driver.findElement(By.id("intesa_payment"));
        wdWait.until(ExpectedConditions.elementToBeClickable(PLATNA));
        PLATNA.click();
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 4");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065778923");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement Slazemse = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", Slazemse);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(6000);
    }

    public static void LicnoIGotovina() throws InterruptedException{
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement Aksesoari = driver.findElement(By.id("ui-id-6"));
        Aksesoari.click();
        js.executeScript("window.scrollBy(0,600)");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[6]/div[2]/ol/li[6]/div/a/span/span/img")));
        WebElement Dupont = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[6]/div[2]/ol/li[6]/div/a/span/span/img"));
        js.executeScript("arguments[0].click();", Dupont);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement fon = driver.findElement(By.name("telephone"));
        fon.sendKeys("06855665");

        WebElement LICNO = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        js.executeScript("arguments[0].click();", LICNO);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Biraj = new Select(driver.findElement(By.name("am_pickup_store")));
        Biraj.selectByVisibleText("BOMAR Ušće");

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Hej hej 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11050");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065415554");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement Slazemse = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", Slazemse);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(6000);

    }

    public static void LicnoIPlatnakH() throws InterruptedException{
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement Aksesoari = driver.findElement(By.id("ui-id-6"));
        Aksesoari.click();
        js.executeScript("window.scrollBy(0,600)");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[6]/div[2]/ol/li[6]/div/a/span/span/img")));
        WebElement Dupont = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[6]/div[2]/ol/li[6]/div/a/span/span/img"));
        js.executeScript("arguments[0].click();", Dupont);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement email = driver.findElement(By.id("customer-email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement fon = driver.findElement(By.name("telephone"));
        fon.sendKeys("06855665");

        WebElement LICNO = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        js.executeScript("arguments[0].click();", LICNO);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Biraj = new Select(driver.findElement(By.name("am_pickup_store")));
        Biraj.selectByVisibleText("BOMAR Ušće");

        WebElement PLATNA = driver.findElement(By.id("intesa_payment"));
        wdWait.until(ExpectedConditions.elementToBeClickable(PLATNA));
        js.executeScript("arguments[0].click();", PLATNA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 4");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065778923");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement Slazemse = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", Slazemse);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(6000);
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        WebElement Kon = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div/ul/li[2]/a"));
        Kon.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola");
        WebElement mejl = driver.findElement(By.name("email"));
        mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement komentar = driver.findElement(By.name("comment"));
        komentar.sendKeys("Test");
        WebElement Salji = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div/div[2]/form/div/div/button/span"));
        js.executeScript("arguments[0].click();", Salji);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://bomar.rs/";
        driver.navigate().to(url);
        driver.get("https://bomar.rs/");
        Thread.sleep(2000);
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[3]/header/div[4]/a"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucaj = driver.findElement(By.name("q"));
        Kucaj.sendKeys("G Shock");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]"));
        System.out.println(R.getText());
    }
}
