package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PlanetBikeRSDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[1]/a"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[2]/a")));
        WebElement Reg2 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/ul/li[2]/a"));
        Reg2.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");

        WebElement Email = driver.findElement(By.id("am-email-address"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/div[1]/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void Loginh() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[2]/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement mejl = driver.findElement(By.name("login[username]"));
        mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.name("login[password]"));
        pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void KurirskaiPouzece() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("zice");
        Search.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Zice1 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Zice1.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_tablerate_bestway")));
        WebElement KURIRSKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        js.executeScript("arguments[0].click();", KURIRSKA);

        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("068745252");

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Hejeje 3");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11008");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("06547652");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(7000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
    }

    public static void KurirskaiPlatnaH() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("zice");
        Search.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Zice1 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Zice1.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_tablerate_bestway")));
        WebElement KURIRSKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        js.executeScript("arguments[0].click();", KURIRSKA);

        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("068745252");

        WebElement PLATNA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();", PLATNA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Hejhej 3");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11050");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065478523");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(7000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();

    }

    public static void KurirskaiPredracun() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("zice");
        Search.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Zice1 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Zice1.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_tablerate_bestway")));
        WebElement KURIRSKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        js.executeScript("arguments[0].click();", KURIRSKA);

        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("068745252");

        WebElement PREDRACUN = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", PREDRACUN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 3");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065712652");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(7000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
    }

    public static void KurirskaiObjekatH() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("zice");
        Search.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Zice1 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Zice1.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_tablerate_bestway")));
        WebElement KURIRSKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        js.executeScript("arguments[0].click();", KURIRSKA);

        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Jejeje 3");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("068745252");

        WebElement OBJEKAT = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();", OBJEKAT);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeasd 2");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065657426");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(7000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void LicnoH() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("zice");
        Search.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Zice1 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Zice1.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_amstorepickup_amstorepickup")));
        WebElement LICNO = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        js.executeScript("arguments[0].click();", LICNO);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select BIRAj = new Select(driver.findElement(By.name("am_pickup_store")));
        BIRAj.selectByVisibleText("Beograd Bul. Arsenija Čarnojevića 69d");
        Thread.sleep(2000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        Thread.sleep(5000);
        WebElement Ime = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica.sendKeys("Jefaksjd 2");
        WebElement Post = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post.sendKeys("11050");
        WebElement Grad = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad.sendKeys("Beograd");
        WebElement Fon = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon.sendKeys("0656547855");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://planetbike.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbike.dev.smartweb.rs/");
        WebElement Kon = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul[3]/li[2]/a"));
        Kon.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola test");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Kom = driver.findElement(By.name("comment"));
        Kom.sendKeys("Test");
        WebElement salji = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/form/div[1]/div/button/span"));
        js.executeScript("arguments[0].click();", salji);
    }
}
