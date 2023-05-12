package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FratelliHelper extends BaseHelper{

   private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke) throws InterruptedException {
        String url = "https://fratelli.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://fratelli.dev.smartweb.rs/");
        WebElement UserIkona = driver.findElement(By.xpath("//a[text()='Prijavi se']"));
        js.executeScript("arguments[0].click();", UserIkona);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Registracija']")));
        WebElement RegDugme = driver.findElement(By.xpath("//a[text()='Registracija']"));
        js.executeScript("arguments[0].click();", RegDugme);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
        WebElement ImeField = driver.findElement(By.id("firstname"));
        ImeField.sendKeys(Ime);
        WebElement PrezimeField = driver.findElement(By.id("lastname"));
        PrezimeField.sendKeys(Prezime);
        WebElement MailField = driver.findElement(By.id("email_address"));
        MailField.sendKeys(Email);
        WebElement LozinkaPolje = driver.findElement(By.id("password"));
        LozinkaPolje.sendKeys(Lozinka);
        WebElement PotvrdaLoz = driver.findElement(By.id("password-confirmation"));
        PotvrdaLoz.sendKeys(PotvrdaLozinke);
        WebElement FinalReg = driver.findElement(By.id("send2"));
        js.executeScript("arguments[0].click();", FinalReg);
        Thread.sleep(3000);
    }

    public static void DefReg() throws InterruptedException{
        Registracija("Nikola", "Cebic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");
    }

    public static void Login() throws InterruptedException{
         String url = "https://fratelli.dev.smartweb.rs/";
         driver.navigate().to(url);
         driver.get("https://fratelli.dev.smartweb.rs/");
         WebElement UserIkona = driver.findElement(By.xpath("//a[text()='Prijavi se']"));
         js.executeScript("arguments[0].click();", UserIkona);
         WebElement Mejl = driver.findElement(By.id("email"));
         Mejl.sendKeys("nikola.cebic@smartweb.rs");
         WebElement Pass = driver.findElement(By.id("pass"));
         Pass.sendKeys("Cebic123");
         WebElement Prijavise = driver.findElement(By.id("send2"));
         Prijavise.click();
         Thread.sleep(5000);
    }

    public static void PreuzimanjeHelper() throws InterruptedException{

        String url = "https://fratelli.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://fratelli.dev.smartweb.rs/");
        driver.manage().deleteAllCookies();
        WebElement Lupa = driver.findElement(By.className("searchToggle"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement SearchPolje = driver.findElement(By.name("q"));
        SearchPolje.sendKeys("MARNI TORBA Z2N32");
        SearchPolje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("product-item-link")));
        WebElement Torba = driver.findElement(By.className("product-item-link"));
        Torba.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[1]/div[4]/form/div/div/div[2]/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[1]/div[4]/form/div/div/div[2]/button/span"));
        Dodaj.click();
        Thread.sleep(8000);
        WebElement MiniK = driver.findElement(By.className("minicart-wrapper"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviKaPlacanju.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement EmailPolje1 = driver.findElement(By.id("customer-email"));
        EmailPolje1.sendKeys("nikolatest@gmail.com");
        WebElement Ime1 = driver.findElement(By.name("firstname"));
        Ime1.sendKeys("Nikola");
        WebElement Prezime1 = driver.findElement(By.name("lastname"));
        Prezime1.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Testna 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065789633");
        WebElement Preuzimanje = driver.findElement(By.name("payment[method]"));
        js.executeScript("arguments[0].click();", Preuzimanje);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("billing-address-same-as-shipping")));
        WebElement MojaAdresa = driver.findElement(By.name("billing-address-same-as-shipping"));
        js.executeScript("arguments[0].click();", MojaAdresa);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nidza");
        Thread.sleep(4000);

       // WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div"));
       // Prezime2.sendKeys("Testic");
        Thread.sleep(7000);
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Blabla 3");
        WebElement Dgra = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Dgra.sendKeys("Novi Sad");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanski2.sendKeys("11075");
        WebElement Fontele = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fontele.sendKeys("03299885");
        Thread.sleep(3000);
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();



    }

    public static void PlatnaKartica() throws InterruptedException{
        String url = "https://fratelli.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://fratelli.dev.smartweb.rs/");
        driver.manage().deleteAllCookies();
        WebElement Lupa = driver.findElement(By.className("searchToggle"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement SearchPolje = driver.findElement(By.name("q"));
        SearchPolje.sendKeys("MARNI TORBA Z2N32");
        SearchPolje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("product-item-link")));
        WebElement Torba = driver.findElement(By.className("product-item-link"));
        Torba.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[1]/div[4]/form/div/div/div[2]/button")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[1]/div[4]/form/div/div/div[2]/button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span")));
        WebElement NastaviKaPlacanju = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        NastaviKaPlacanju.click();
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime1 = driver.findElement(By.name("firstname"));
        Ime1.sendKeys("Nikola");
        WebElement Prezime1 = driver.findElement(By.name("lastname"));
        Prezime1.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Blabla 2");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski = driver.findElement(By.name("postcode"));
        Postanski.sendKeys("11090");
        WebElement Broj  = driver.findElement(By.name("telephone"));
        Broj.sendKeys("065285412");





    }
}
