package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OptiluxDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://optilux.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://optilux.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/ul/li[2]/a"));
        Nalog.click();
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg.click();
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement TAX = driver.findElement(By.name("taxvat"));
        TAX.sendKeys("0555449656");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Regbutton = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        Regbutton.click();
    }

    public static void LoginHelper() throws InterruptedException{
        String url = "https://optilux.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://optilux.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/ul/li[2]/a"));
        Nalog.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Prijava = driver.findElement(By.id("send2"));
        Prijava.click();
    }

    public static void Shoping1() throws InterruptedException{
        String url = "https://optilux.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://optilux.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-65")));
        WebElement olovke = driver.findElement(By.id("ui-id-65"));
        olovke.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[3]/div/a/span/span/img")));
        WebElement Olovka3001 = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[3]/div/a/span/span/img"));
        Olovka3001.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[2]/div/form/div[1]/div/div/div/div/div[2]")));
        WebElement Crveno = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[2]/div/form/div[1]/div/div/div/div/div[2]"));
        Crveno.click();
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[2]/div/form/div[2]/div[1]/div/div[2]/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement nastavi = driver.findElement(By.id("top-cart-btn-checkout"));
        wdWait.until(ExpectedConditions.elementToBeClickable(nastavi));
        nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime1 = driver.findElement(By.name("firstname"));
        Ime1.sendKeys("Nikola");
        WebElement Prezime1 = driver.findElement(By.name("lastname"));
        Prezime1.sendKeys("Cebic");
        WebElement Firma = driver.findElement(By.name("company"));
        Firma.sendKeys("Smartwebtest");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trteeee 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("0657862326");
        Thread.sleep(4000);
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("billing-address-same-as-shipping")));
        WebElement MojaADR = driver.findElement(By.name("billing-address-same-as-shipping"));
        MojaADR.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Firma2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[3]/div/input"));
        Firma2.sendKeys("Smartwebtest");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Heheheh 33");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Novi sad");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11036");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0657955666");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);
        WebElement poruci = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(poruci));
        js.executeScript("arguments[0].click();", poruci);

    }

    public static void SearchH() throws InterruptedException{
        String url = "https://optilux.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://optilux.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/section/div/section[1]/button[2]"));
        js.executeScript("arguments[0].click();", Lupa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucaj = driver.findElement(By.name("q"));
        Kucaj.sendKeys("Olovke");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div/div[2]/ol")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/div/div[2]/ol"));
        System.out.println(R.getText());
    }
}
