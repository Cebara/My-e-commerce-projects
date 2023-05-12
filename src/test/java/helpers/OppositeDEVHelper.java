package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class OppositeDEVHelper extends BaseHelper {

    public static void RegH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[2]/ul/li[3]/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg.click();
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
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/form/div/div[1]/button/span")));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[2]/ul/li[3]/a"));
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

    public static void LicnoiPreuzimanje() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        LICNO_PREUZIMANJE.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Prodza = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodza.selectByVisibleText("OPPOSITE Bulevar");

        WebElement PLATIPOPREUZIMANJU = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", PLATIPOPREUZIMANJU);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("ASdf 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanski2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0654786533");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void LicnoIAdministrativnaZabranaH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        LICNO_PREUZIMANJE.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Prodza = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodza.selectByVisibleText("OPPOSITE Bulevar");

        WebElement ADMINISTRATIVNA_ZABRANA = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();", ADMINISTRATIVNA_ZABRANA );

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("asdasd 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065455666");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void LicnoICekoviH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        LICNO_PREUZIMANJE.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Prodza = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodza.selectByVisibleText("OPPOSITE Bulevar");

        WebElement CEKOVI = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", CEKOVI);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Asdafsdf 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11092");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065889562");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);

    }

    public static void LicnoIKarticaH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        LICNO_PREUZIMANJE.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Prodza = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodza.selectByVisibleText("OPPOSITE Bulevar");

        WebElement KARTICA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", KARTICA);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("afsed 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("06455454");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void PouzeceIPreuzimanjeH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement POUZECE = driver.findElement(By.id("s_method_tablerate_bestway"));
        POUZECE.click();

        WebElement PLATIPOPREUZIMANJU = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", PLATIPOPREUZIMANJU);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("ASdf 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanski2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0654786533");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void PouzeceIAdministrativnaH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement POUZECE = driver.findElement(By.id("s_method_tablerate_bestway"));
        POUZECE.click();

        WebElement ADMINISTRATIVNA_ZABRANA = driver.findElement(By.id("banktransfer"));
        js.executeScript("arguments[0].click();", ADMINISTRATIVNA_ZABRANA );

        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR );

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("asdasd 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065455666");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);


    }

    public static void PouzeceICekoviH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement POUZECE = driver.findElement(By.id("s_method_tablerate_bestway"));
        POUZECE.click();

        WebElement CEKOVI = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", CEKOVI);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Asdafsdf 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11092");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065889562");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);

    }

    public static void PouzeceIKarticaH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span")));
        WebElement DecijaObuca = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div[1]/div/div[2]/nav/div/ul/li[1]/ul/li[3]/a/span"));
        DecijaObuca.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_128670")));
        WebElement Patike = driver.findElement(By.id("product-item-info_128670"));
        Patike.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-conf_boja-180-item-714")));
        WebElement Boja = driver.findElement(By.id("option-label-conf_boja-180-item-714"));
        Boja.click();
        WebElement Velicina = driver.findElement(By.id("option-label-conf_velicina-181-item-732"));
        Velicina.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        //Thread.sleep(9000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sdadaf 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0658945523");

        WebElement POUZECE = driver.findElement(By.id("s_method_tablerate_bestway"));
        POUZECE.click();

        WebElement KARTICA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", KARTICA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("afsed 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("06455454");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div/button"));
        Thread.sleep(5000);
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://razvoj.server-opposite.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-opposite.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.name("q"));
        Lupa.sendKeys("Patike");
        Lupa.sendKeys(Keys.ENTER);
        WebElement R = driver.findElement(By.id("amasty-shopby-product-list"));
        System.out.println(R.getText());
    }
}
