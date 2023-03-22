package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BarKodHelper extends BaseHelper {

    private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke) throws InterruptedException {
        String url = "https://barkodshop.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.dev.smartweb.rs/");
        WebElement RegistracijaDugme = driver.findElement(By.id("idsfUDxzHD"));
        RegistracijaDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
        WebElement ImePolje = driver.findElement(By.id("firstname"));
        ImePolje.sendKeys(Ime);
        WebElement PrezimePolje = driver.findElement(By.id("lastname"));
        PrezimePolje.sendKeys(Prezime);
        WebElement EmailPolje = driver.findElement(By.id("email_address"));
        EmailPolje.sendKeys(Email);
        WebElement PassPolje = driver.findElement(By.id("password"));
        PassPolje.sendKeys(Lozinka);
        WebElement PotvrdaLozinke1 = driver.findElement(By.id("password-confirmation"));
        PotvrdaLozinke1.sendKeys(PotvrdaLozinke);
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
        Thread.sleep(4000);

    }

    public static void DefRegistracija() throws InterruptedException {
        Registracija("Nikola", "Cebic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");
    }

    public static void Login() throws InterruptedException {
        String url = "https://barkodshop.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]/ul/li[2]")));
        WebElement PrijaviSe = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]/ul/li[2]"));
        PrijaviSe.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mail = driver.findElement(By.name("login[username]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Mail));
        Mail.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Pass));
        Pass.sendKeys("Cebic123");
        WebElement Upad = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[5]/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Upad));
        Upad.click();
        Thread.sleep(3000);
    }

    public static void KucnaAdresaIPouzece() throws InterruptedException {
        Login();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement ParfemiKategorija = driver.findElement(By.id("ui-id-2"));
        ParfemiKategorija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Amor = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Amor.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-sw_zapremina-145-item-584")));
        WebElement triesml = driver.findElement(By.id("option-label-sw_zapremina-145-item-584"));
        triesml.click();
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        DodajUKorpu.click();
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("minicart-wrapper")));
        WebElement MiniK = driver.findElement(By.className("minicart-wrapper"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviKaPlacanju.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("city")));
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Podgorica");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11060");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Njegoseva 3");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0655458555");
        WebElement KucnaAdresaButton = driver.findElement(By.name("ko_unique_1"));
        wdWait.until(ExpectedConditions.elementToBeClickable(KucnaAdresaButton));
        KucnaAdresaButton.click();
        Thread.sleep(6000);
        WebElement PlacanjePouzecem = driver.findElement(By.name("payment[method]"));
        PlacanjePouzecem.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("billing-address-same-as-shipping")));
        WebElement Mojaadrnijeista = driver.findElement(By.name("billing-address-same-as-shipping"));
        Mojaadrnijeista.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input")));
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Bjeljina");
        WebElement Postcode2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Postcode2.sendKeys("88090");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Alo alo 2");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0618554555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreement__1")));
        WebElement Prihvacam = driver.findElement(By.id("agreement__1"));
        Prihvacam.click();
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();

        Thread.sleep(4000);
    }

    public static void UparfimerijiIPouzece() throws InterruptedException {
        Login();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement ParfemiKategorija = driver.findElement(By.id("ui-id-2"));
        ParfemiKategorija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Amor = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Amor.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-sw_zapremina-145-item-584")));
        WebElement triesml = driver.findElement(By.id("option-label-sw_zapremina-145-item-584"));
        triesml.click();
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        DodajUKorpu.click();
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("minicart-wrapper")));
        WebElement MiniK = driver.findElement(By.className("minicart-wrapper"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviKaPlacanju.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("city")));
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Podgorica");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11060");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Njegoseva 3");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0655458555");
        WebElement UParfimeriji = driver.findElement(By.name("ko_unique_2"));
        UParfimeriji.click();
        Thread.sleep(6000);
        WebElement PlacanjePouzecem = driver.findElement(By.name("payment[method]"));
        PlacanjePouzecem.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("billing-address-same-as-shipping")));
        WebElement Mojaadrnijeista = driver.findElement(By.name("billing-address-same-as-shipping"));
        Mojaadrnijeista.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input")));
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Bjeljina");
        WebElement Postcode2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Postcode2.sendKeys("88090");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Alo alo 2");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0618554555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreement__1")));
        WebElement Prihvacam = driver.findElement(By.id("agreement__1"));
        Prihvacam.click();
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();

        Thread.sleep(4000);
    }

    public static void KucnaIPlatna() throws InterruptedException {
        Login();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement ParfemiKategorija = driver.findElement(By.id("ui-id-2"));
        ParfemiKategorija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Amor = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Amor.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-sw_zapremina-145-item-584")));
        WebElement triesml = driver.findElement(By.id("option-label-sw_zapremina-145-item-584"));
        triesml.click();
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        DodajUKorpu.click();
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("minicart-wrapper")));
        WebElement MiniK = driver.findElement(By.className("minicart-wrapper"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviKaPlacanju.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("city")));
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Podgorica");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11060");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Njegoseva 3");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0655458555");
        WebElement KucnaAdresaButton = driver.findElement(By.name("ko_unique_1"));
        wdWait.until(ExpectedConditions.elementToBeClickable(KucnaAdresaButton));
        KucnaAdresaButton.click();
        Thread.sleep(6000);
        WebElement PlatnaKartica = driver.findElement(By.id("sample_gateway"));
        PlatnaKartica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-sample_gateway")));
        WebElement MojaAdresa = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        MojaAdresa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input")));
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Bjeljina");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Postanski2.sendKeys("11080");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Njegoseva 3");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0678961112");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Azuriraj));
        Azuriraj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreement__1")));
        WebElement Prihvacam = driver.findElement(By.id("agreement__1"));
        Prihvacam.click();
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
        Thread.sleep(4000);
    }

    public static void ParfimerijaIPlatna() throws InterruptedException {
        Login();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        WebElement ParfemiKategorija = driver.findElement(By.id("ui-id-2"));
        ParfemiKategorija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Amor = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Amor.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-sw_zapremina-145-item-584")));
        WebElement triesml = driver.findElement(By.id("option-label-sw_zapremina-145-item-584"));
        triesml.click();
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        DodajUKorpu.click();
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("minicart-wrapper")));
        WebElement MiniK = driver.findElement(By.className("minicart-wrapper"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviKaPlacanju.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("city")));
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Podgorica");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11060");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Njegoseva 3");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0655458555");
        WebElement UParfimeriji = driver.findElement(By.name("ko_unique_2"));
        UParfimeriji.click();
        Thread.sleep(2000);
        WebElement PlatnaKartica = driver.findElement(By.id("sample_gateway"));
        PlatnaKartica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-sample_gateway")));
        WebElement MojaAdresa = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        MojaAdresa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input")));
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Bjeljina");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Postanski2.sendKeys("11080");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Njegoseva 3");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0678961112");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Azuriraj));
        Azuriraj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreement__1")));
        WebElement Prihvacam = driver.findElement(By.id("agreement__1"));
        Prihvacam.click();
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
        Thread.sleep(4000);
    }

    public static void Search() throws InterruptedException {
        String url = "https://barkodshop.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("showSearch")));
        WebElement SearchPolje = driver.findElement(By.id("showSearch"));
        SearchPolje.click();
        WebElement Kucaj = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kucaj));
        Kucaj.sendKeys("maskara");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("maincontent")));
        WebElement Result = driver.findElement(By.id("maincontent"));
        System.out.println(Result.getText());
        Thread.sleep(4000);
    }
}