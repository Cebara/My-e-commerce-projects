package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ParfemiHelperLIVE extends BaseHelper {

    public static void RegH() throws InterruptedException{
        String url = "https://parfemi-online.com/#";
        driver.navigate().to(url);
        driver.get("https://parfemi-online.com/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/header/div[1]/div/div/ul/li[3]/a")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[5]/header/div[1]/div/div/ul/li[3]/a"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
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
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/form/div/div[1]/button/span"));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://parfemi-online.com/#";
        driver.navigate().to(url);
        driver.get("https://parfemi-online.com/#");
        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[5]/header/div[1]/div/div/ul/li[2]/a"));
        Prijava.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mail = driver.findElement(By.name("login[username]"));
        Mail.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void ShoppingH() throws InterruptedException{
        String url = "https://parfemi-online.com/#";
        driver.navigate().to(url);
        driver.get("https://parfemi-online.com/#");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement Muski = driver.findElement(By.id("ui-id-6"));
        Muski.click();
        js.executeScript("window.scrollBy(0,2000)");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[2]/div[1]/div[5]/div[3]/div/ol/li[1]/div/a/span/span/img")));
        WebElement Armaf = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div[1]/div[5]/div[3]/div/ol/li[1]/div/a/span/span/img"));
        Armaf.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[5]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[3]/div[1]/ul/li[1]/button"));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Mejl));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trte Mrte 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski = driver.findElement(By.name("postcode"));
        Postanski.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("065789522");
        WebElement MojaAdr = driver.findElement(By.name("billing-address-same-as-shipping"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MojaAdr));
        js.executeScript("arguments[0].click();", MojaAdr);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Igoreva 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Postanski2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("064885455");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        js.executeScript("arguments[0].click();", Kupi);





    }
}
