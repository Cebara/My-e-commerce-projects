package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BeanzDEVHelper extends BaseHelper {

    public static void Reghelper() throws InterruptedException{
        String url = "https://razvoj.server-beanz.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-beanz.smartweb.rs/#");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/ul/li[3]/a"));
        Nalog.click();
        WebElement Kreirajte = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Kreirajte.click();
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
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://razvoj.server-beanz.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-beanz.smartweb.rs/#");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/ul/li[3]/a"));
        Nalog.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void ProfakturaH() throws InterruptedException{
        String url = "https://razvoj.server-beanz.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-beanz.smartweb.rs/#");
        WebElement Aksesoari = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/nav[2]/ul/li[1]/a"));
        Aksesoari.click();
        WebElement Soljice = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div/div[3]/ol/li[4]/div/a/span/span/img"));
        Soljice.click();
        WebElement Kupi = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        Thread.sleep(5000);
        WebElement Zavrsi = driver.findElement(By.id("top-cart-btn-checkout"));
        Zavrsi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        Thread.sleep(4000);
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trte Mrte 23");
        WebElement Region1 = driver.findElement(By.name("region"));
        Region1.sendKeys("Rakovica");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("065789526");
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();
        Thread.sleep(3000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("banktransfer")));
        WebElement PROFAKTURA = driver.findElement(By.id("banktransfer"));
        PROFAKTURA.click();
//        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-banktransfer")));
//        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
//        js.executeScript("arguments[0].click();", MOJAADR);
//        Thread.sleep(4000);
//        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
//        Ime2.sendKeys("Nikola");
//        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
//        Prezime2.sendKeys("Cebic");
//        WebElement Adresa = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
//        Adresa.sendKeys("Bla bla 23");
//        WebElement Redjion = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
//        Redjion.sendKeys("Beograd");
//        WebElement Grad2 = driver.findElement(By.xpath("city"));
//        Grad2.sendKeys("Beograd");
//        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
//        Post2.sendKeys("11090");
//        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
//        Fon2.sendKeys("065458696");
//        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
//        Azuriraj.click();
//        Thread.sleep(3000);
        WebElement Naruci = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button"));
        Naruci.click();
    }

    public static void PouzeceH() throws InterruptedException{
        String url = "https://razvoj.server-beanz.smartweb.rs/#";
        driver.navigate().to(url);
        driver.get("https://razvoj.server-beanz.smartweb.rs/#");
        WebElement Aksesoari = driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/nav[2]/ul/li[1]/a"));
        Aksesoari.click();
        WebElement Soljice = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div/div[3]/ol/li[4]/div/a/span/span/img"));
        Soljice.click();
        WebElement Kupi = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        Thread.sleep(5000);
        WebElement Zavrsi = driver.findElement(By.id("top-cart-btn-checkout"));
        Zavrsi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        Thread.sleep(4000);
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trte Mrte 23");
        WebElement Region1 = driver.findElement(By.name("region"));
        Region1.sendKeys("Rakovica");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("065789526");
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();
        Thread.sleep(3000);
        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        POUZECE.click();
        Thread.sleep(3000);
        WebElement Naruci = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[4]/div/button"));
        Naruci.click();
    }

}
