package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BomarDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Ikonica = driver.findElement(By.xpath("/html/body/div[3]/header/div[3]/div[2]/ul/li[2]/a"));
        Ikonica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement RegistracijaDugme = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        RegistracijaDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement ImeField = driver.findElement(By.name("firstname"));
        ImeField.sendKeys("Nikola");
        WebElement PrezimeField = driver.findElement(By.name("lastname"));
        PrezimeField.sendKeys("Cebic");
        WebElement EmailField = driver.findElement(By.name("email"));
        EmailField.sendKeys("nikola.cebic@smartweb.rs");
        WebElement PassField = driver.findElement(By.name("password"));
        PassField.sendKeys("Cebic123");
        WebElement PassPotvrda = driver.findElement(By.name("password_confirmation"));
        PassPotvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/form/div/div[1]/button"));
        Aj.click();
        Thread.sleep(4000);
    }

    public static void LoginHelper() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Ikonica = driver.findElement(By.xpath("/html/body/div[3]/header/div[3]/div[2]/ul/li[2]/a"));
        Ikonica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mejl  = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("cebic123");
        WebElement Prijava = driver.findElement(By.id("send2"));
        Prijava.click();
        Thread.sleep(3000);

    }

    public static void PreuzimanjeIGotovina() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Lupa  = driver.findElement(By.className("searchIcon"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kucanje));
        Kucanje.sendKeys("Zoa handmade ocean");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_22464")));
        WebElement Narukvica = driver.findElement(By.id("product-item-info_22464"));
        Narukvica.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(5000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Trte Mrte 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065786123");
        Thread.sleep(8000);

        WebElement PREUZIMANJE = driver.findElement(By.name("ko_unique_1"));
        js.executeScript("arguments[0].click();", PREUZIMANJE);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select PRODZA = new Select(driver.findElement(By.name("am_pickup_store")));
        PRODZA.selectByVisibleText("BOMAR Ada");

        WebElement GOTOVINA = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", GOTOVINA);

        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(5000);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("HEHE 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11098");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065485263");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        Thread.sleep(4000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void PreuzimanjeIPlatnaH() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Lupa  = driver.findElement(By.className("searchIcon"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kucanje));
        Kucanje.sendKeys("Zoa handmade ocean");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_22464")));
        WebElement Narukvica = driver.findElement(By.id("product-item-info_22464"));
        Narukvica.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(5000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Trte Mrte 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065786123");
        Thread.sleep(8000);

        WebElement PREUZIMANJE = driver.findElement(By.name("ko_unique_1"));
        js.executeScript("arguments[0].click();", PREUZIMANJE);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select PRODZA = new Select(driver.findElement(By.name("am_pickup_store")));
        PRODZA.selectByVisibleText("BOMAR Ada");

        WebElement PLATNA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", PLATNA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement ulca2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        ulca2.sendKeys("Jeje 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("10090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("068745255");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        Thread.sleep(4000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void IsporukaIGotovina() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Lupa  = driver.findElement(By.className("searchIcon"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kucanje));
        Kucanje.sendKeys("Zoa handmade ocean");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_22464")));
        WebElement Narukvica = driver.findElement(By.id("product-item-info_22464"));
        Narukvica.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(5000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Trte Mrte 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065786123");
        Thread.sleep(8000);

        WebElement ISPORUKA = driver.findElement(By.id("s_method_tablerate_bestway"));
        js.executeScript("arguments[0].click();", ISPORUKA);

        WebElement GOTOVINA = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", GOTOVINA);

        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(5000);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        //wdWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("HEHE 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11098");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065485263");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        Thread.sleep(4000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);

    }

    public static void IsporukaIPlatna() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Lupa  = driver.findElement(By.className("searchIcon"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kucanje));
        Kucanje.sendKeys("Zoa handmade ocean");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_22464")));
        WebElement Narukvica = driver.findElement(By.id("product-item-info_22464"));
        Narukvica.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(5000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Trte Mrte 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065786123");
        Thread.sleep(8000);

        WebElement PLATNA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", PLATNA);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement ulca2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        ulca2.sendKeys("Jeje 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("10090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("068745255");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement SAGLASNOST = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SAGLASNOST);
        Thread.sleep(4000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        WebElement Lupa  = driver.findElement(By.className("searchIcon"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kucanje));
        Kucanje.sendKeys("narukvice");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("maincontent")));
        WebElement R = driver.findElement(By.id("maincontent"));
        System.out.println(R.getText());
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://bomar.dev.smartweb.rs/";
        driver.get(url);
        driver.navigate().to(url);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[1]/div/div/ul/li[2]/a")));
        WebElement K = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div/ul/li[2]/a"));
        K.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola Test");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement poruka = driver.findElement(By.name("comment"));
        poruka.sendKeys("Test");
        WebElement Salji = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div/div[2]/form/div/div/button"));
        js.executeScript("arguments[0].click();", Salji);
    }

}
