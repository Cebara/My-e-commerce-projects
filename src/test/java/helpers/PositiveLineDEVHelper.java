package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PositiveLineDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException {
        String url = "https://postivelinerazvoj.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://postivelinerazvoj.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/ul/li/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Kreiranje = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Kreiranje.click();
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException {
        String url = "https://postivelinerazvoj.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://postivelinerazvoj.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/ul/li/a"));
        Nalog.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        Aj.click();
    }

    public static void PlatnaKHelper() throws InterruptedException{
        String url = "https://postivelinerazvoj.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://postivelinerazvoj.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-5")));
        WebElement DodatnaOprema = driver.findElement(By.id("ui-id-5"));
        DodatnaOprema.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[2]/div/div/div/div[3]/a/img")));
        WebElement Punjaci = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[2]/div/div/div/div[3]/a/img"));
        Punjaci.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[6]/div/a/span/span/img")));
        WebElement Punjac = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[6]/div/a/span/span/img"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Punjac));
        Punjac.click();
        WebElement Kupi = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Nastavi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime1 = driver.findElement(By.name("firstname"));
        Ime1.sendKeys("Nikola");
        WebElement Prezime1 = driver.findElement(By.name("lastname"));
        Prezime1.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trteeee 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0657862326");
        Thread.sleep(6000);
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("teserakt_wspayform")));
        WebElement PLATNA = driver.findElement(By.id("teserakt_wspayform"));
        js.executeScript("arguments[0].click();", PLATNA);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("billing-address-same-as-shipping")));
        WebElement MojaADR = driver.findElement(By.name("billing-address-same-as-shipping"));
        MojaADR.click();
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Adresa2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Adresa2.sendKeys("Jojo 23");
        WebElement Dgra2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Dgra2.sendKeys("Novi sad");
        WebElement Postanksi2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanksi2.sendKeys("11080");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0354555563");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        WebElement nastavikaplacanju = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(nastavikaplacanju));
        js.executeScript("arguments[0].click();", nastavikaplacanju);
    }

    public static void IsporukaH() throws InterruptedException{
        String url = "https://postivelinerazvoj.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://postivelinerazvoj.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-5")));
        WebElement DodatnaOprema = driver.findElement(By.id("ui-id-5"));
        DodatnaOprema.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[2]/div/div/div/div[3]/a/img")));
        WebElement Punjaci = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[2]/div/div/div/div[3]/a/img"));
        Punjaci.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[6]/div/a/span/span/img")));
        WebElement Punjac = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[6]/div/a/span/span/img"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Punjac));
        Punjac.click();
        WebElement Kupi = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Nastavi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime1 = driver.findElement(By.name("firstname"));
        Ime1.sendKeys("Nikola");
        WebElement Prezime1 = driver.findElement(By.name("lastname"));
        Prezime1.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trteeee 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0657862326");
        Thread.sleep(6000);
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("cashondelivery")));
        WebElement ISPORUKA = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", ISPORUKA);

        WebElement MojaADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MojaADR));
        js.executeScript("arguments[0].click();", MojaADR);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        //wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Adresa2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Adresa2.sendKeys("Jojo 23");
        WebElement Dgra2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Dgra2.sendKeys("Novi sad");
        WebElement Postanksi2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanksi2.sendKeys("11080");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0354555563");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        WebElement Naruci = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[4]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Naruci));
        js.executeScript("arguments[0].click();", Naruci);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://postivelinerazvoj.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://postivelinerazvoj.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/section/div/section[1]/button[2]"));
        js.executeScript("arguments[0].click();", Lupa);
        WebElement Kucanje = driver.findElement(By.name("q"));
        Kucanje.sendKeys("Punjac");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div/div[2]/ol")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div/div[2]/ol"));
        System.out.println(R.getText());
    }

}
