package helpers;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GameCentarDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[3]/div/ul/li[2]/a"));
        Nalog.click();
        WebElement Registracija = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/ul/li[2]/a"));
        Registracija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Mejl = driver.findElement(By.id("am-email-address"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement potvrda = driver.findElement(By.name("password_confirmation"));
        potvrda.sendKeys("Cebic123");
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div[2]/div[1]/form/div/div[1]/button/span"));
        Reg.click();
    }

    public static void LoginHelper() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[3]/div/ul/li[2]/a"));
        Nalog.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void KurirskaIPouzeceH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement KURIRSKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        KURIRSKA.click();

        WebElement POUZECE = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJADRESA = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJADRESA);
        Thread.sleep(6000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejejej 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("066265566");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        js.executeScript("arguments[0].click();", Poruci);
    }

    public static void KurirskaIRacunH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement KURIRSKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        KURIRSKA.click();

        WebElement RACUN = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();", RACUN );
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(6000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Mojne test 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("065488662");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();
    }

    public static void KurirskaIPlatnaH() throws InterruptedException {
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement KURIRSKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        KURIRSKA.click();

        WebElement PLATNA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", PLATNA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(6000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Mojne test 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("06684522");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();

    }

    public static void NSiPouzeceH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement NOVISAD = driver.findElement(By.id("s_method_flatrate_flatrate"));
        NOVISAD.click();

        WebElement POUZECE = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJADRESA = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJADRESA);
        Thread.sleep(6000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejejej 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("066265566");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        js.executeScript("arguments[0].click();", Poruci);
    }

    public static void NSiRacunH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement NOVISAD = driver.findElement(By.id("s_method_flatrate_flatrate"));
        NOVISAD.click();

        WebElement RACUN = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();", RACUN );
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(6000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Mojne test 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("065488662");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();
    }

    public static void NSiPlatnaH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement NOVISAD = driver.findElement(By.id("s_method_flatrate_flatrate"));
        NOVISAD.click();

        WebElement PLATNA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", PLATNA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(6000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Mojne test 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("06684522");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();
    }

    public static void BgiPouzeceH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement BG = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        BG.click();

        WebElement POUZECE = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJADRESA = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJADRESA);
        Thread.sleep(6000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejejej 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("066265566");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        js.executeScript("arguments[0].click();", Poruci);
    }

    public static void BgiRacunH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement BG = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        BG.click();

        WebElement RACUN = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();", RACUN );
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(6000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Mojne test 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("065488662");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();
    }

    public static void BgiPlatnaH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement SveKategorije = driver.findElement(By.className("menu-toggle"));
        SveKategorije.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-168")));
        WebElement Gedzeti = driver.findElement(By.id("ui-id-168"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Gedzeti));
        Gedzeti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/ol/li[2]/div/div/div[3]/div/div/form/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Idi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Idi));
        Idi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065454563");

        WebElement BG = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        BG.click();

        WebElement PLATNA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", PLATNA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(6000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Mojne test 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("06684522");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(7000);
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Poruci));
        Poruci.click();
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://gamecentar.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://gamecentar.dev.smartweb.rs/");
        WebElement Polje = driver.findElement(By.name("q"));
        Polje.sendKeys("Mis");
        Polje.sendKeys(Keys.ENTER);
        WebElement R = driver.findElement(By.id("amasty-shopby-product-list"));
        System.out.println(R.getText());

    }
}
