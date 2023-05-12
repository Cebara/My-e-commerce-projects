package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PCPracticLIVEHelper extends BaseHelper {

    public static void RegistracijaH() throws InterruptedException {

        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[5]/a")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[5]/a"));
        Reg.click();
        WebElement ImePolje = driver.findElement(By.name("firstname"));
        ImePolje.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.id("password"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Pass));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
        Thread.sleep(5000);
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Prijava  = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
        Prijava.click();
        WebElement mejl = driver.findElement(By.name("login[username]"));
        mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.name("login[password]"));
        pass.sendKeys("Cebic123");
        WebElement Upad = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[4]/div[1]/div[2]/form/fieldset/div[6]/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Upad));
        Upad.click();
        Thread.sleep(5000);
    }

    public static void LicnoIPouzece() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_preuzimanjeshopione_preuzimanjeshopione"));
        js.executeScript("arguments[0].click();" , LICNO_PREUZIMANJE);
        Thread.sleep(3000);

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();" , POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065478552");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(5000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoIPlatnaKH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_preuzimanjeshopione_preuzimanjeshopione"));
        js.executeScript("arguments[0].click();" , LICNO_PREUZIMANJE);
        Thread.sleep(3000);

        WebElement PLATNA_KARTICA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();" , PLATNA_KARTICA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("06547955");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoIPredracunH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_preuzimanjeshopione_preuzimanjeshopione"));
        js.executeScript("arguments[0].click();" , LICNO_PREUZIMANJE);
        Thread.sleep(3000);

        WebElement PREDRACUN = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();" , PREDRACUN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0658855563");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();

    }

    public static void LicnoICEKOVI1() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_preuzimanjeshopione_preuzimanjeshopione"));
        js.executeScript("arguments[0].click();" , LICNO_PREUZIMANJE);
        Thread.sleep(3000);

        WebElement CEKOVI6MES = driver.findElement(By.id("cekovi6meseci"));
        js.executeScript("arguments[0].click();" , CEKOVI6MES);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cekovi6meseci"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065488555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoICekovi2() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_preuzimanjeshopione_preuzimanjeshopione"));
        js.executeScript("arguments[0].click();" , LICNO_PREUZIMANJE);
        Thread.sleep(3000);

        WebElement CEKOVI12MES = driver.findElement(By.id("cekovi12meseci"));
        js.executeScript("arguments[0].click();" , CEKOVI12MES);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cekovi12meseci"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("06543235");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoIRaiffeisen() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_PREUZIMANJE = driver.findElement(By.id("s_method_preuzimanjeshopione_preuzimanjeshopione"));
        js.executeScript("arguments[0].click();" , LICNO_PREUZIMANJE);
        Thread.sleep(3000);

        WebElement RAIFFEISEN = driver.findElement(By.id("raiffeisencreditpayment"));
        js.executeScript("arguments[0].click();" , RAIFFEISEN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-raiffeisencreditpayment"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejej 30");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065442569");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoARANDJELOVACIPouzeceH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_ARANDJELOVAC = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();" , LICNO_ARANDJELOVAC);
        Thread.sleep(4000);

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();" , POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065478552");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(5000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoAiPlatnaKH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_ARANDJELOVAC = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();" , LICNO_ARANDJELOVAC);
        Thread.sleep(4000);

        WebElement PLATNA_KARTICA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();" , PLATNA_KARTICA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("06547955");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoAiPredracunH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_ARANDJELOVAC = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();" , LICNO_ARANDJELOVAC);
        Thread.sleep(4000);

        WebElement PREDRACUN = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();" , PREDRACUN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0658855563");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoAiCEKOVI1H() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_ARANDJELOVAC = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();" , LICNO_ARANDJELOVAC);
        Thread.sleep(4000);

        WebElement CEKOVI6MES = driver.findElement(By.id("cekovi6meseci"));
        js.executeScript("arguments[0].click();" , CEKOVI6MES);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cekovi6meseci"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065488555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoAiCEKOVI2() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_ARANDJELOVAC = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();" , LICNO_ARANDJELOVAC);
        Thread.sleep(4000);

        WebElement CEKOVI12MES = driver.findElement(By.id("cekovi12meseci"));
        js.executeScript("arguments[0].click();" , CEKOVI12MES);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cekovi12meseci"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("06543235");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void LicnoAiRaifesseinH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement LICNO_ARANDJELOVAC = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();" , LICNO_ARANDJELOVAC);
        Thread.sleep(4000);

        WebElement RAIFFEISEN = driver.findElement(By.id("raiffeisencreditpayment"));
        js.executeScript("arguments[0].click();" , RAIFFEISEN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-raiffeisencreditpayment"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejej 30");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065442569");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void IsporukaiPouzeceH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement ISPORUKA = driver.findElement(By.id("s_method_postcodeship_postcodeship"));
        js.executeScript("arguments[0].click();" , ISPORUKA);
        Thread.sleep(4000);

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();" , POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("11090");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065478552");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(5000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void IsporukaiPlatnaKH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement ISPORUKA = driver.findElement(By.id("s_method_postcodeship_postcodeship"));
        js.executeScript("arguments[0].click();" , ISPORUKA);
        Thread.sleep(4000);

        WebElement PLATNA_KARTICA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();" , PLATNA_KARTICA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("06547955");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void IsporukaiPredracunH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement ISPORUKA = driver.findElement(By.id("s_method_postcodeship_postcodeship"));
        js.executeScript("arguments[0].click();" , ISPORUKA);
        Thread.sleep(4000);

        WebElement PREDRACUN = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();" , PREDRACUN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("0658855563");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(3000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void IsporukaiCekovi1H() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement ISPORUKA = driver.findElement(By.id("s_method_postcodeship_postcodeship"));
        js.executeScript("arguments[0].click();" , ISPORUKA);
        Thread.sleep(4000);

        WebElement CEKOVI6MES = driver.findElement(By.id("cekovi6meseci"));
        js.executeScript("arguments[0].click();" , CEKOVI6MES);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cekovi6meseci"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065488555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();" , Azuriraj);
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void IsporukaiCekovi2H() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement ISPORUKA = driver.findElement(By.id("s_method_postcodeship_postcodeship"));
        js.executeScript("arguments[0].click();" , ISPORUKA);
        Thread.sleep(4000);

        WebElement CEKOVI12MES = driver.findElement(By.id("cekovi12meseci"));
        js.executeScript("arguments[0].click();" , CEKOVI12MES);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cekovi12meseci"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejeje 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("06543235");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[5]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void IsporukaiRaifessein() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[8]/div/div/div/ol/div[1]/div/div[3]/li/div/a/span/span/img"));
        Frizider.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("hehehe 3");
        Select Drzava = new Select(driver.findElement(By.name("region")));
        Drzava.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("Beograd");
        Thread.sleep(3000);
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065445662");
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11000");
        Thread.sleep(3000);

        WebElement ISPORUKA = driver.findElement(By.id("s_method_postcodeship_postcodeship"));
        js.executeScript("arguments[0].click();" , ISPORUKA);
        Thread.sleep(4000);

        WebElement RAIFFEISEN = driver.findElement(By.id("raiffeisencreditpayment"));
        js.executeScript("arguments[0].click();" , RAIFFEISEN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-raiffeisencreditpayment"));
        js.executeScript("arguments[0].click();" , MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Jejej 30");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065442569");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[6]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);

        WebElement PRIHVATAM = driver.findElement(By.name("custom-terms"));
        js.executeScript("arguments[0].click();" , PRIHVATAM);

        WebElement NARUCI = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[3]/div[5]/div[3]/div[2]/div[4]/div/div/button/span"));
        NARUCI.click();
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://pcpractic.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Pretraga = driver.findElement(By.name("q"));
        Pretraga.sendKeys("Mis");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("maincontent")));
        WebElement R = driver.findElement(By.id("maincontent"));
        System.out.println(R.getText());
    }
}
