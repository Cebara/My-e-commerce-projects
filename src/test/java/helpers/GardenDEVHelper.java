package helpers;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GardenDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://garden.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://garden.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[3]/div[2]/ul/li[2]/a")));
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[2]/ul/li[2]/a"));
        Nalog.click();
        WebElement Registracija = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Registracija.click();
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
        WebElement Upad = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/form/div/div[1]/button/span"));
        Upad.click();
    }

    public static void LoginHelper() throws InterruptedException{
        String url = "https://garden.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://garden.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[3]/div[2]/ul/li[2]/a")));
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[2]/ul/li[2]/a"));
        Nalog.click();
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement lozinka = driver.findElement(By.name("login[password]"));
        lozinka.sendKeys("Cebic123");
        WebElement Prijava = driver.findElement(By.id("send2"));
        Prijava.click();
    }

    public static void ShoppingH() throws InterruptedException{
        String url = "https://garden.dev.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://garden.dev.smartweb.rs/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/ol/div/div/div[6]/div/li/div/a/span/span/img")));
        WebElement Limunovi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/ol/div/div/div[6]/div/li/div/a/span/span/img"));
        Limunovi.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(3000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulca = driver.findElement(By.name("street[0]"));
        Ulca.sendKeys("Hehehe 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Postanski = driver.findElement(By.name("postcode"));
        Postanski.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0675645456");
        WebElement MojaADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MojaADR));
        js.executeScript("arguments[0].click();", MojaADR);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("JoJo 23");
        WebElement Dgra = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Dgra.sendKeys("Beograd");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanski2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065425455");
        WebElement Azuiriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuiriraj);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        js.executeScript("arguments[0].click();", Kupi);
    }
}
