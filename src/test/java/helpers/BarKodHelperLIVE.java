package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BarKodHelperLIVE extends BaseHelper{

    public static void RegH() throws InterruptedException{
        String url = "https://barkodshop.me/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.me/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]/ul/li[3]/a")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]/ul/li[3]/a"));
        Reg.click();
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("Cebic123");
        WebElement potvrda = driver.findElement(By.name("password_confirmation"));
        potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://barkodshop.me/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.me/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]/ul/li[2]/a")));
        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]/ul/li[2]/a"));
        Prijava.click();
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[6]/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        js.executeScript("arguments[0].click();", Aj);
    }

    public static void IsporukaiPouzeceH() throws InterruptedException{
        String url = "https://barkodshop.me/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.me/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement SkinCare = driver.findElement(By.id("ui-id-6"));
        wdWait.until(ExpectedConditions.elementToBeClickable(SkinCare));
        SkinCare.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img")));
        WebElement BiothermCrveni = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img"));
        BiothermCrveni.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Hejeje 3");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06589522");

        WebElement ISPORUKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        js.executeScript("arguments[0].click();", ISPORUKA);

        WebElement POUZECE = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11080");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065458855");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement PRIHVATAM = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", PRIHVATAM);
        Thread.sleep(3000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(5000);
    }

    public static void IsporukaiKarticaH() throws InterruptedException{
        String url = "https://barkodshop.me/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.me/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement SkinCare = driver.findElement(By.id("ui-id-6"));
        wdWait.until(ExpectedConditions.elementToBeClickable(SkinCare));
        SkinCare.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img")));
        WebElement BiothermCrveni = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img"));
        BiothermCrveni.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Hejeje 3");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06589522");

        WebElement ISPORUKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        js.executeScript("arguments[0].click();", ISPORUKA);

        WebElement KARTICA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();", KARTICA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11080");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 2");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("055478555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement PRIHVATAM = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", PRIHVATAM);
        Thread.sleep(3000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(5000);

    }

    public static void LicnoiPouzeceH() throws InterruptedException{
        String url = "https://barkodshop.me/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.me/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement SkinCare = driver.findElement(By.id("ui-id-6"));
        wdWait.until(ExpectedConditions.elementToBeClickable(SkinCare));
        SkinCare.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img")));
        WebElement BiothermCrveni = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img"));
        BiothermCrveni.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Hejeje 3");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06589522");

        WebElement LICNO = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();", LICNO);

        WebElement POUZECE = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11080");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 23");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("065458855");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement PRIHVATAM = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", PRIHVATAM);
        Thread.sleep(3000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(5000);
    }

    public static void LicnoiKarticaH() throws InterruptedException{
        String url = "https://barkodshop.me/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.me/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement SkinCare = driver.findElement(By.id("ui-id-6"));
        wdWait.until(ExpectedConditions.elementToBeClickable(SkinCare));
        SkinCare.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img")));
        WebElement BiothermCrveni = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[16]/div/a/span/span/img"));
        BiothermCrveni.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Hejeje 3");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06589522");

        WebElement LICNO = driver.findElement(By.id("s_method_freeshipping_freeshipping"));
        js.executeScript("arguments[0].click();", LICNO);

        WebElement KARTICA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].click();", KARTICA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-sample_gateway"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Post2.sendKeys("11080");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 2");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("055478555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement PRIHVATAM = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", PRIHVATAM);
        Thread.sleep(3000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);
        Thread.sleep(5000);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://barkodshop.me/";
        driver.navigate().to(url);
        driver.get("https://barkodshop.me/");
        WebElement Lupa = driver.findElement(By.id("showSearch"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucaj = driver.findElement(By.name("q"));
        Kucaj.sendKeys("Ruz");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div/div[2]/div/ol")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div/div[2]/div/ol"));
        System.out.println(R.getText());
    }
}
