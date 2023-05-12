package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MidoriDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://midori.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://midori.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div[2]/ul/li[2]/a"));
        Nalog.click();
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg.click();
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
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
       // wdWait.until(ExpectedConditions.elementToBeClickable(R));
        js.executeScript("arguments[0].click();", R);
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://midori.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://midori.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div[2]/ul/li[2]/a"));
        Nalog.click();
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Prijava = driver.findElement(By.id("send2"));
        Prijava.click();
    }

    public static void ShoppingH() throws InterruptedException{
        LoginH();
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-3")));
        WebElement Aksesoari = driver.findElement(By.id("ui-id-3"));
        Aksesoari.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[1]/div/a[2]/span/span/img")));
        WebElement Bookstand = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[1]/div/a[2]/span/span/img"));
        Bookstand.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        Thread.sleep(3000);
        WebElement IdiNaPlacanje = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        IdiNaPlacanje.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trte Mrte 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065485462");
        Thread.sleep(3000);
        WebElement MojaADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        MojaADR.click();
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ulica2));
        Ulica2.sendKeys("EFEADASd 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanski2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0654256596");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        WebElement Poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", Poruci);

    }

    public  static void SearchH() throws InterruptedException{
        String url = "https://midori.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://midori.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/div[1]/div[2]/form/div[1]/label"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        Kucanje.sendKeys("Jastuk");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("amasty-shopby-product-list")));
        WebElement R = driver.findElement(By.id("amasty-shopby-product-list"));
        System.out.println(R.getText());
    }
}
